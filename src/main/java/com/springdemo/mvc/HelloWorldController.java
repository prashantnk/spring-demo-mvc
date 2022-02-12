package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/form")
public class HelloWorldController {
	@RequestMapping("/show")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/post")
	public String postForm() {
		return "postForm";

	}

	@RequestMapping("/postFormVersionTwo")
	public String postFormVersionTwo(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		name = name.toUpperCase();
		String message = "Hello!  " + name;
		model.addAttribute("message", message);
		return "postForm";
	}

	@RequestMapping("/postFormV3")
	public String postFormV3(@RequestParam("name") String name, Model model) {
		name = name.toUpperCase();
		String message = "Hello and good morning!  " + name;
		model.addAttribute("message", message);
		return "postForm";
	}

}
