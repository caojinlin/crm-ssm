package com.ncist.edu.crm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ncist.edu.crm.pojo.Chance;
import com.ncist.edu.crm.pojo.Linkman;
import com.ncist.edu.crm.pojo.PageBean;
import com.ncist.edu.crm.service.ChanceService;
import com.ncist.edu.crm.service.LinkmanService;
import com.ncist.edu.crm.utils.ReadUtil;

@Controller
public class LinkmanController {
	@Resource
	private LinkmanService linkmanservice;
	@Resource
	private ChanceService chanceservice;
	
	@RequestMapping("tolinkman.do")
	public String tolinkman(String name,Model model,int page){
		name = ReadUtil.characterModify(name);
		PageBean<Linkman> pagelist = linkmanservice.findlinkmanbycid(name,page);
		model.addAttribute("page", pagelist);
		model.addAttribute("cname", name);
		return "linkman/linkmanlist";
	}
	@RequestMapping("toaddlinkman.do")
	public String toaddlinkman(String cname,Model model){
		cname = ReadUtil.characterModify(cname);
		List<Chance> chances = chanceservice.findchancebytitle(cname);
		model.addAttribute("chances", chances);
		model.addAttribute("cname", cname);
		return "linkman/addlinkman";
	}
	@RequestMapping("addlinkman.do")
	public String addlinkman(Linkman linkman,RedirectAttributes attr){
		linkmanservice.addlinkman(linkman);
		attr.addAttribute("name", linkman.getCname());
		return "redirect:tolinkman.do?page=1";
	}
	@RequestMapping("toupdatelinkman.do")
	public String toupdatelinkman(String linkmanid,Model model){
		linkmanid = linkmanid.substring(1);
		int lid = Integer.parseInt(linkmanid);
		Linkman linkman = linkmanservice.findlinkmanbylid(lid);
		model.addAttribute("linkman", linkman);
		return "linkman/updatelinkman";
	}
	
	@RequestMapping("updatelinkman.do")
	public String updatelinkman(Linkman linkman,RedirectAttributes attr){
		linkmanservice.updatelinkman(linkman);
		attr.addAttribute("name", linkman.getCname());
		return "redirect:tolinkman.do?page=1";
	}
	@RequestMapping("dellinkman.do")
	public String dellinkman(int[] linkmanid,String[] cname,RedirectAttributes attr){
		linkmanservice.dellinkman(linkmanid);
		attr.addAttribute("name", cname[0]);
		return "redirect:tolinkman.do?page=1";
		
	}
	
}
