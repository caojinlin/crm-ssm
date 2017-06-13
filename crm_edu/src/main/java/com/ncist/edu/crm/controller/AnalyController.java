package com.ncist.edu.crm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncist.edu.crm.pojo.BarStyle;
import com.ncist.edu.crm.pojo.PieStyle;
import com.ncist.edu.crm.service.ChanceService;
import com.ncist.edu.crm.service.CustomerService;
import com.ncist.edu.crm.service.ServiceService;

@Controller
public class AnalyController {
	@Resource
	private CustomerService customerService;
	@Resource
	private ChanceService chanceService;
	@Resource
	private ServiceService serviceService;
	
	@RequestMapping("analycus.do")
	public String analycus(){
		return "analy/cuspro";
	}
	@RequestMapping("getanalycus.do")
	@ResponseBody
	public Object getanalycus(){
		BarStyle bs= customerService.findcountcuslev();
		return bs;
	}
	@RequestMapping("analyuser.do")
	public String analyuser(){
		return "analy/userana";
	}
	@RequestMapping("analyuser2.do")
	public String analyuser2(){
		return "analy/userana2";
	}
	@RequestMapping("getuserana.do")
	@ResponseBody
	public Object getuserana(){
		List<PieStyle> pielist = chanceService.finduserana();
		return pielist;
	}
	@RequestMapping("getuseranaservice.do")
	@ResponseBody
	public Object getuseranaservice(){
		List<PieStyle> pielist = serviceService.finduserana();
		return pielist;
	}
}
