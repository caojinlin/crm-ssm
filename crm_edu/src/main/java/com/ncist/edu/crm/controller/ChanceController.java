package com.ncist.edu.crm.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncist.edu.crm.pojo.Chance;
import com.ncist.edu.crm.pojo.Customer;
import com.ncist.edu.crm.pojo.PageBean;
import com.ncist.edu.crm.pojo.UserInfo;
import com.ncist.edu.crm.service.ChanceService;
import com.ncist.edu.crm.service.CustomerService;
import com.ncist.edu.crm.service.UserService;
import com.ncist.edu.crm.utils.ReadUtil;

@Controller
public class ChanceController {
	@Resource
	private ChanceService chanceservice;
	@Resource
	private UserService userservice;
	@Resource
	private CustomerService customerService;
	
	@RequestMapping("chance.do")
	private String tochance(int page,Model model){
		PageBean<Chance> pageChance= chanceservice.findchancelist(page);
		model.addAttribute("page", pageChance);
		return "chance/chancelist";
	}
	
	@RequestMapping("toaddchance.do")
	public String toaddpro(Model model){
		List<Customer> Cuslist = customerService.findallcustomer1();
		model.addAttribute("cuslist", Cuslist);
		return "chance/addchance";
	}
	@RequestMapping("addchance.do")
	public String addpro(Chance chance,HttpSession session){
		UserInfo user = (UserInfo) session.getAttribute("user");
		Date date = new Date(System.currentTimeMillis());
		chance.setCreatetime(date);
		chance.setCreatename(user.getAccount());
		chanceservice.addchance(chance);
		return "redirect:chance.do?page=1";
	}
	@RequestMapping("delchance.do")
	public String delchance(@RequestParam(value="chanceid")int[] ids){
		chanceservice.delchance(ids);
		return "redirect:chance.do?page=1";
	}
	
	@RequestMapping("assignchance.do")
	public String assignchance(String chanceid,Model model){
		chanceid = chanceid.substring(1);
		String[] chanceids=null;
		if(chanceid.contains(";")){
			chanceids = chanceid.split(";");
		}else{
			chanceids = new String[1];
			chanceids[0] = chanceid;
		}
		int[] cids = new int[chanceids.length];
		for (int i=0;i<cids.length;i++ ) {
			int cid = Integer.parseInt(chanceids[i]);
			cids[i] = cid;
		}
		List<Chance> chancelist = chanceservice.findchancesbyid(cids);
		List<UserInfo> userlist = userservice.findalluser();
		model.addAttribute("chances", chancelist);
		model.addAttribute("userinfos", userlist);
		return "chance/assignchance";
	}
	
	@RequestMapping("assign")
	public String assigndue(String duename,String chanceid){
		duename = ReadUtil.characterModify(duename);
		int cid = Integer.parseInt(chanceid);
		chanceservice.updatadue(duename,cid);
		return "redirect:chance.do?page=1";
	}
	@RequestMapping("toupdatechance.do")
	public String toupdatechance(String chanceid,Model model){
		chanceid = chanceid.substring(1);
		int cid = Integer.parseInt(chanceid);
		Chance chance = chanceservice.findchancebyid(cid);
		model.addAttribute("chance", chance);
		return "chance/updatechance";
	}
	@RequestMapping("updatechance.do")
	public String updatechance(Chance chance){
		chanceservice.updatechance(chance);
		return "redirect:chance.do?page=1";
	}
	
}
