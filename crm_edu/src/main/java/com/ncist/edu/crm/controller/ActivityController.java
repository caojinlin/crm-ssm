package com.ncist.edu.crm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ncist.edu.crm.pojo.Activity;
import com.ncist.edu.crm.pojo.PageBean;
import com.ncist.edu.crm.service.ActivityService;

@Controller
public class ActivityController {
	@Resource
	private ActivityService activityservice;
	
	@RequestMapping("toactivity.do")
	public String toactivity(int id,Model model,int page){
		PageBean<Activity> pagelist = activityservice.findactivitybyid(id,page);
		model.addAttribute("page", pagelist);
		model.addAttribute("cid", id);
		return "activity/activitylist";
	}
	
	@RequestMapping("delactivity.do")
	public String delactivity(int[] id,int[] cid,RedirectAttributes attr){
		activityservice.delactivity(id);
		attr.addAttribute("id", cid[0]);
		return "redirect:toactivity.do?page=1";
	}
	
	@RequestMapping("toaddactivity.do")
	public String toaddactivity(int cid,Model model){
		model.addAttribute("cid", cid);
		return "activity/addactivity";
	}
	
	@RequestMapping("addactivity.do")
	public String addactivity(Activity activity,RedirectAttributes attr){
		activityservice.addactivity(activity);
		attr.addAttribute("id", activity.getCid());
		return "redirect:toactivity.do?page=1";
	}
	
	@RequestMapping("toupdateactivity.do")
	public String toupdateactivity(String aid,Model model){
		aid = aid.substring(1);
		int id = Integer.parseInt(aid);
		Activity activity = activityservice.findactivitybyaid(id);
		model.addAttribute("activity", activity);
		return "activity/updateactivity";
	}
	@RequestMapping("updateactivity.do")
	public String updateactivity(Activity activity,RedirectAttributes attr){
		activityservice.updateactivity(activity);
		attr.addAttribute("id", activity.getCid());
		return "redirect:toactivity.do?page=1";
	}
}
