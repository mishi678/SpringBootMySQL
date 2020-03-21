package com.mishi.ecom.service;

import javax.annotation.security.RolesAllowed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/products")
public class ProductsServices {
	
	@GetMapping("/list")
	@ResponseBody
	public String listAllProducts(){
		System.out.println("listing all products");
		return "List of products ";
	}

}
