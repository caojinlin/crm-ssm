package com.ncist.edu.crm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncist.edu.crm.pojo.UserInfo;
import com.ncist.edu.crm.service.UserService;
import com.ncist.edu.crm.utils.MD5Utils;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("touserlist.do")
	public String touserlist(Model model){
		List<UserInfo> findalluser = userService.findalluser();
		model.addAttribute("users", findalluser);
		return "user/userlist";
	}
	@RequestMapping("deluser.do")
	public String deluser(int[] userid){
		userService.deluser(userid);
		return "redirect:touserlist.do";
	}
	@RequestMapping("toadduser.do")
	public String toadduser(){
		return "user/adduser";
	}
	@RequestMapping("adduser.do")
	public String adduser(UserInfo user,Model model){
		String account = user.getAccount();
		UserInfo userfind = userService.finduserbyaccount(account);
		if(userfind==null){
			user.setPwd(MD5Utils.md5(user.getPwd()));
			userService.adduser(user);
			return "redirect:touserlist.do";
		}
		model.addAttribute("msg", "该账户已存在");
		return "user/adduser";
	}
	@RequestMapping("toupdateuser.do")
	public String toupdateUser(String userid,Model model){
		userid = userid.substring(1);
		int id = Integer.parseInt(userid);
		UserInfo user = userService.finduserbyid(id);
		model.addAttribute("user", user);
		return "user/updateuser";
	}
	
	@RequestMapping("updateuser.do")
	public String updateUser(UserInfo user){
		user.setPwd(MD5Utils.md5(user.getPwd()));
		userService.updateUser(user);
		return "redirect:touserlist.do";
	}
	
	@RequestMapping("updatestatususer.do")
	public String updatestatususer(int id,int status){
		userService.updateStatus(id,status);
		return "redirect:touserlist.do";
	}
	@RequestMapping("toupdatepwd.do")
	public String toupdatepwd(Model model,HttpSession session){
		UserInfo user = (UserInfo) session.getAttribute("user");
		model.addAttribute("user", user);
		return "user/updatepwd";
	}
	@RequestMapping("updatepwd.do")
	public String updatepwd(String pwdold,String pwdnew,HttpSession session,Model model){
		UserInfo user = (UserInfo) session.getAttribute("user");
		if(user.getPwd().equals(MD5Utils.md5(pwdold))){
			pwdnew = MD5Utils.md5(pwdnew);
			userService.updatepwd(pwdnew,user.getId());
			return "redirect:touserlist.do";
		}else{
			model.addAttribute("msg", "原密码输入错误");
			return "user/updatepwd";
		}
	}
}
