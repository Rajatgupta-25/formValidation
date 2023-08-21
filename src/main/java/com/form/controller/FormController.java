package com.form.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.form.entities.LoginDetail;

@Controller
public class FormController {
	
	@GetMapping("/form")
	public String openForm(Model model) {
		model.addAttribute("loginData", new LoginDetail());
		return "form";
	}
	
	@PostMapping("/submit")
	public String processForm(@Valid @ModelAttribute("loginData") LoginDetail loginDetail, BindingResult bindingResult) {
		System.out.println(loginDetail);
		if(bindingResult.hasErrors()) {
			System.out.println(bindingResult);
			return "form";
		}
		return "success";
	}
	
}
