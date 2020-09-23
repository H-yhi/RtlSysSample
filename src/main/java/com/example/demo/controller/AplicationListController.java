package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.ApplicationList;
import com.example.demo.service.*;
import java.util.List;

@Controller
@RequestMapping("/sample")
public class AplicationListController {
	
	// @Autowired
	// private ApplicationListService applicationListService;
	
	@GetMapping("/test")
	public String test(Model model) {
		// List<ApplicationList> applicationList = applicationListService.searchAll();
		model.addAttribute("applicationList","applicationList");
		return "view/Application-List/Application-List";
	}

}
