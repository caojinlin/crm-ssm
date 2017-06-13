package com.ncist.edu.crm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncist.edu.crm.pojo.Chance;
import com.ncist.edu.crm.pojo.Service;
import com.ncist.edu.crm.pojo.UserInfo;
import com.ncist.edu.crm.service.ChanceService;
import com.ncist.edu.crm.service.ServiceService;
import com.ncist.edu.crm.service.UserService;
import com.ncist.edu.crm.utils.MD5Utils;
import com.ncist.edu.crm.utils.ReadUtil;

@Controller
public class IndexConrtoller {
	
	@Resource
	private UserService indexservice;
	@Resource
	private ChanceService chanceService;
	@Resource
	private ServiceService serviceService;
	
	@RequestMapping("/index.do")
	public String index(UserInfo userinfo,HttpServletRequest request,String code,Model model){
		String account = userinfo.getAccount();
		if(ReadUtil.isNotNull(account)){
			UserInfo user=indexservice.finduserbyaccount(account);
			String code1 = (String) request.getSession().getAttribute("code");
			String pwd = userinfo.getPwd();
			pwd = MD5Utils.md5(pwd);
			if(user==null||!user.getPwd().equals(pwd)){
				model.addAttribute("msg", "密码和用户名不匹配");
				return "login";
			}else if(!ReadUtil.isNotNull(code)){
				model.addAttribute("msg", "验证码不能为空");
				return "login";
			}else if(!code1.equals(code.toUpperCase())){
				model.addAttribute("msg", "验证码不正确");
				return "login";
			}else{
				request.getSession().setAttribute("user", user);
				
			}
		}else{
			model.addAttribute("msg", "用户名不能为空");
			return "login";
		}
		return "index/index";
	}
	@RequestMapping("/left.do")
	public String left(){
		return "index/left";
	}
	@RequestMapping("/main.do")
	public String main(Model model,HttpSession session){
		UserInfo user = (UserInfo) session.getAttribute("user");
		List<Chance> chancelist = chanceService.findchancebyduename(user.getName());
		List<Service> services = serviceService.findservicebyduename(user.getName());
		model.addAttribute("services", services);
		model.addAttribute("chances", chancelist);
		return "index/main";
	}
	@RequestMapping("/top.do")
	public String top(){
		return "index/top";
	}
	
}
