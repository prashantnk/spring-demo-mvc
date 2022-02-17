package com.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springdemo.mvc.ModelClasses.Student;

@Controller
@RequestMapping("/student")
public class StudentFormController {
	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;

	@RequestMapping("/showForm")
	public String ShowForm(Model model) {

		Student student = new Student();
		model.addAttribute("student", student);
		System.out.println(countryOptions);
		model.addAttribute("countryOptions", countryOptions);

		return "student-form";
	}

	@RequestMapping("/processForm")
	public String confirmationPage(@ModelAttribute Student student) {
//		System.out.println(student);
		return "confirmation-page";
	}

}
