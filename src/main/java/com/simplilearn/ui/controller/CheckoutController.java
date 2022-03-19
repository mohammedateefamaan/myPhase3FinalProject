package com.simplilearn.ui.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.simplilearn.Common;
import com.simplilearn.dto.Payment;
import com.simplilearn.service.UserService;
import com.simplilearn.ui.View;

@Controller
public class CheckoutController {

	@Autowired
	UserService service;
	
	@GetMapping("/checkout")
	public String checkout(Model model, HttpServletRequest request) {
		model.addAttribute("payment", new Payment());
		model.addAttribute("currentYear", Integer.parseInt(Common.getCurrentYear(Common.YEAR_FORMAT)));
		
		return View.V_USER_PAYMENT;
	}
	
}