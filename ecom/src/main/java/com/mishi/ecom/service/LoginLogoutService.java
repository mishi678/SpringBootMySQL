package com.mishi.ecom.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginLogoutService {
	
	@RequestMapping("login")
	public String testLogin(){
		System.out.println("login....");
		return "login.jsp";
	}
	
	@RequestMapping("logout-sucess")
	public String logout(){
		System.out.println("logout....");
		return "logout-success.jsp";
	}
}
