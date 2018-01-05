package com.cmower.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@RequestMapping("")
	public ModelAndView index() {
		ModelAndView initView = new ModelAndView("index");
		return initView;
	}
}
