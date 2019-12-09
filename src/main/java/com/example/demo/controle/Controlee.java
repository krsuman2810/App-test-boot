package com.example.demo.controle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlee {
	
	@RequestMapping("/getmessage")
	public String getMessage() {
		return "Suman";
	}
}
