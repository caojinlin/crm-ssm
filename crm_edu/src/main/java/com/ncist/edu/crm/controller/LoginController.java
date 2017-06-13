package com.ncist.edu.crm.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncist.edu.crm.utils.VerifyCode;


@Controller
public class LoginController {
	@RequestMapping("login.do")
	public String login(){
		return "login";
	}
	@RequestMapping("logout.do")
	public String logout(HttpServletRequest request){
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		return "login";
	}
	@RequestMapping("getvaliImage.do")
	public void getvaliImage(HttpServletResponse response,HttpServletRequest request){
		response.setDateHeader("Expires", -1);
		response.setHeader("Cache-control", "no-cache");
		response.setHeader("Pragma", "no-cache");
		VerifyCode vc = new VerifyCode();
		try {
			vc.drawImage(response.getOutputStream());
			String code = vc.getCode();
			request.getSession().setAttribute("code", code.toUpperCase());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
