package com.example.legacy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

	@RequestMapping("/view")
	public String asdf( ) {
		return "sample";
	}
}
