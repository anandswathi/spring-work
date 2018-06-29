package com.ran.sample.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ran.sample.spring.vo.StudentVO;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("studentView", "student", new StudentVO());
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String submit(@ModelAttribute("student") StudentVO student, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "studentError";
		}
		model.addAttribute("name", student.getName());
		model.addAttribute("contactNumber", student.getContactNumber());
		model.addAttribute("id", student.getId());
		System.out.println(student);
		return "studentList";
	}
}