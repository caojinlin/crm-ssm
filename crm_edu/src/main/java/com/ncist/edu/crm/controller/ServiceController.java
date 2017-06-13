package com.ncist.edu.crm.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncist.edu.crm.pojo.PageBean;
import com.ncist.edu.crm.pojo.Service;
import com.ncist.edu.crm.pojo.UserInfo;
import com.ncist.edu.crm.service.CustomerService;
import com.ncist.edu.crm.service.ServiceService;
import com.ncist.edu.crm.service.UserService;
import com.ncist.edu.crm.utils.ReadUtil;

@Controller
public class ServiceController {
	@Resource
	private ServiceService serviceservice;
	@Resource
	private CustomerService customerService;
	@Resource
	private UserService userservice;
	
	@RequestMapping("toaddservice.do")
	public String toaddservice(Model model){
		List<String> name = customerService.findname();
		model.addAttribute("cnames", name);
		return "service/addservice";
	}
	@RequestMapping("addservice.do")
	public String addservice(Service service,HttpSession session){
		UserInfo user = (UserInfo) session.getAttribute("user");
		service.setCreatename(user.getAccount());
		long currentTimeMillis = System.currentTimeMillis();
		Date date = new Date(currentTimeMillis);
		service.setCreatetime(date);
		serviceservice.addservice(service);
		return "redirect:toaddservice.do";
	}
	@RequestMapping("toassignservice.do")
	public String toassign(Model model,int page){
		PageBean<Service> pagelist = serviceservice.findallservice(page);
		model.addAttribute("page", pagelist);
		return "service/servicelist";
	}
	@RequestMapping("assignservice.do")
	public String toassignservice(String serviceid,Model model){
		serviceid = serviceid.substring(1);
		int id = Integer.parseInt(serviceid);
		Service service = serviceservice.findservicebyid(id);
		List<UserInfo> userlist = userservice.findalluser();
		model.addAttribute("service", service);
		model.addAttribute("userinfos", userlist);
		return "service/assignservice";
	}
	@RequestMapping("assignservicedue.do")
	public String assign(int serviceid,String duename){
		long currentTimeMillis = System.currentTimeMillis();
		Date date = new Date(currentTimeMillis);
		serviceservice.updatedue(serviceid,duename,date);
		return "redirect:toassignservice.do?page=1";
	}
	@RequestMapping("todueservicelist.do")
	public String todueservicelist(Model model,int page){
		PageBean<Service> pagelist = serviceservice.findallservice(page);
		model.addAttribute("page", pagelist);
		return "service/serviceduelist";
	}
	@RequestMapping("dealservice.do")
	public String dealservice(String serviceid,Model model){
		serviceid = serviceid.substring(1);
		int id = Integer.parseInt(serviceid);
		Service service = serviceservice.findservicebyid(id);
		model.addAttribute("service", service);
		return "service/dueservice";
	}
	@RequestMapping("dealservicedue.do")
	public String dealservicedue(int serviceid,String deal){
		long currentTimeMillis = System.currentTimeMillis();
		Date date = new Date(currentTimeMillis);
		serviceservice.updatedeal(serviceid,deal,date);
		return "redirect:todueservicelist.do?page=1";
	}
	@RequestMapping("toresultlist.do")
	public String toresultlist(Model model,int page){
		PageBean<Service> pagelist = serviceservice.findallservice(page);
		model.addAttribute("page", pagelist);
		return "service/resultservicelist";
	}
	
	
	@RequestMapping("resultservice.do")
	public String resultservice(String serviceid,Model model){
		serviceid = serviceid.substring(1);
		int id = Integer.parseInt(serviceid);
		Service service = serviceservice.findservicebyid(id);
		model.addAttribute("service", service);
		return "service/resultservice";
	}
	@RequestMapping("resultservicedue.do")
	public String resultservicedue(int serviceid,String result,int satisfy){
		serviceservice.updateresult(serviceid,result,satisfy);
		Service service = serviceservice.findservicebyid(serviceid);
		List<Service> services = serviceservice.findservicebyname(service.getCname());
		int sum =0;
		double avgsa = 0.0;
		for (Service ser : services) {
			String sat = ser.getSatisfy();
			if(ReadUtil.isNotNull(sat) ){
				sum +=Integer.parseInt(sat);
			}
		}
		avgsa = sum/services.size();
		customerService.updatesatisfy(avgsa,service.getCname());
		return "redirect:toresultlist.do?page=1";
	}
	@RequestMapping("tostatuslist.do")
	public String tostatuslist(Model model,int page){
		PageBean<Service> pagelist = serviceservice.findallfiling(page);
		model.addAttribute("page", pagelist);
		return "service/servicefiling";
	}
	@RequestMapping("searchservice.do")
	public String searchservice(int type,String cname,Model model,int page){
		PageBean<Service> pagelist = serviceservice.findbysearch(type,cname,page);
		model.addAttribute("page", pagelist);
		model.addAttribute("type", type);
		model.addAttribute("cname", cname);
		return "service/servicefiling";
	}
}
