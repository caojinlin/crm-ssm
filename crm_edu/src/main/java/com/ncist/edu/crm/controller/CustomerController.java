package com.ncist.edu.crm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncist.edu.crm.pojo.Chance;
import com.ncist.edu.crm.pojo.Customer;
import com.ncist.edu.crm.pojo.Lost;
import com.ncist.edu.crm.pojo.PageBean;
import com.ncist.edu.crm.pojo.UserInfo;
import com.ncist.edu.crm.service.ChanceService;
import com.ncist.edu.crm.service.CustomerService;
import com.ncist.edu.crm.service.LostService;
import com.ncist.edu.crm.utils.ReadUtil;

@Controller
public class CustomerController {
	@Resource
	private CustomerService customerservice;
	@Resource
	private ChanceService chanceservice;
	@Resource
	private LostService lostservice;
	
	@RequestMapping("tocustomer.do")
	public String tocustomer(Model model,int page){
		PageBean<Customer> pagelist = customerservice.findallcustomer(page);
		model.addAttribute("page", pagelist);
		return "customer/customerlist";
	}
	
	@RequestMapping("toaddcustomer.do")
	public String toaddcustomer(Model model){
		List<String> names = customerservice.findname();
		model.addAttribute("names", names);
		return "customer/addcustomer";
	}
	
	@RequestMapping("addcustomer.do")
	public String addcustomer(Customer customer,Model model){
		String duename = chanceservice.findduename(customer.getName());
		customer.setUname(duename);
		Customer cus = customerservice.findcustomerbycname(customer.getName());
		if(cus==null){
			customerservice.addcustomer(customer);
			return "redirect:tocustomer.do?page=1";
		}else{
			model.addAttribute("msg", "该客户已存在");
			return "redirect:toaddcustomer.do";
		}
	}
	@RequestMapping("topromag.do")
	public String topromag(String name,Model model){
		name = ReadUtil.characterModify(name);
		List<Chance> chancelist = chanceservice.findchancebytitle(name);
		PageBean<Chance> page = new PageBean<Chance>(chancelist);
		page.setList(chancelist);
		model.addAttribute("page", page);
		return "chance/chancelist";
	}
	@RequestMapping("cuslost.do")
	public String cuslost(int cid,int status,HttpSession session){
		customerservice.updatecusstatus(cid,status);
		UserInfo user = (UserInfo) session.getAttribute("user");
		if(status==3){
			Lost lost = new Lost();
			lost.setUname(user.getName());
			lost.setCid(cid);
			long ltime = System.currentTimeMillis();
			Date date = new Date(ltime);
			lost.setPubtime(date);
			lostservice.addlostcus(lost);
		}
		return "redirect:tocustomer.do?page=1";
	}
	
	@RequestMapping("toupdatecustomer.do")
	public String toupdate(String customerid,Model model){
		customerid = customerid.substring(1);
		int id = Integer.parseInt(customerid);
		Customer customer = customerservice.findcustomerbycid(id);
		model.addAttribute("customer", customer);
		return "customer/updatecustomer";
	}
	@RequestMapping("updatecustomer.do")
	public String updatecustomer(Customer customer){
		customerservice.updatecustomer(customer);
		return "redirect:tocustomer.do?page=1";
	}
	@RequestMapping("tocheckname.do")
	public void tocheckname(String name,HttpServletResponse response) throws IOException{
		 response.setContentType("text/html;charset=utf-8");
	     response.setHeader("Cache-Control", "no-cache");  
	     PrintWriter writer = response.getWriter();
		if(name==null){
			writer.print("客户名不能为空");
		}
		Customer customer = customerservice.findcustomerbycname(name);
		if(customer==null){
			
		}else{
			writer.print("该客户已存在");
		}
	}
}
