package com.tts.oauth2demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping(path="/")
	public String redirectHome() {
		return "redirect:/index.html";
	}
}
