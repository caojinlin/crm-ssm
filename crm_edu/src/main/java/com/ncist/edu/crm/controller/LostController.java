package com.ncist.edu.crm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncist.edu.crm.pojo.Customer;
import com.ncist.edu.crm.pojo.Lost;
import com.ncist.edu.crm.pojo.PageBean;
import com.ncist.edu.crm.service.CustomerService;
import com.ncist.edu.crm.service.LostService;
import com.ncist.edu.crm.utils.ReadUtil;

@Controller
public class LostController {
	@Resource
	private LostService lostservice;
	@Resource
	private CustomerService customerservice;
	
	@RequestMapping("tolostlist.do")
	public String tolostlist(Model model,int page){
		PageBean<Lost> pagelist = lostservice.findalllost(page);
		for (Lost lost : pagelist.getList()) {
			Customer cus = customerservice.findcustomerbycid(lost.getCid());
			lost.setCname(cus.getName());
		}
		model.addAttribute("page", pagelist);
		return "lost/lostlist";
	}
	
	@RequestMapping("addreason.do")
	public String addreason(int id,String reason){
		reason = ReadUtil.characterModify(reason);
		lostservice.updatereason(id,reason);
		return "redirect:tolostlist.do?page=1";
	}
}
