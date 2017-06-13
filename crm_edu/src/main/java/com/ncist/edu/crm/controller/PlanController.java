package com.ncist.edu.crm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncist.edu.crm.pojo.Chance;
import com.ncist.edu.crm.pojo.PageBean;
import com.ncist.edu.crm.pojo.Plan;
import com.ncist.edu.crm.service.ChanceService;
import com.ncist.edu.crm.service.PlanService;

@Controller
public class PlanController {
	@Resource
	private ChanceService chanceservice;
	@Resource
	private PlanService planservice;
	
	@RequestMapping("plan.do")
	public String toplan(Model model,int page){
		PageBean<Chance> pagelist = chanceservice.findchancelist(page);
		model.addAttribute("page", pagelist);
		return "plan/planlist";
	}
	@RequestMapping("toaddplan.do")
	public String toaddplan(String chanceid,Model model){
		chanceid = chanceid.substring(1);
		int cid = Integer.parseInt(chanceid);
		Chance chance = chanceservice.findchancebyid(cid);
		List<Plan> planlist = planservice.findallplan(cid);
		model.addAttribute("plans", planlist);
		model.addAttribute("chance", chance);
		return "plan/addplan";
	}
	
	@RequestMapping("addplan.do")
	public String addplan(Plan plan){
		planservice.addplan(plan);
		return "redirect:plan.do?page=1";
	}
	
	@RequestMapping("plantable.do")
	public String plantable(String cid,Model model){
		int cids = Integer.parseInt(cid);
		System.out.println(cids);
		List<Plan> planlist = planservice.findallplan(cids);
		model.addAttribute("plans", planlist);
		return "plan/tableplan";
	}
	@RequestMapping("upstatus.do")
	public String upstatus(int status,int cid){
		chanceservice.upstatus(status,cid);
		return "redirect:plan.do?page=1";
	}
}
