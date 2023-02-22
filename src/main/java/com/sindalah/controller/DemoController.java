package com.sindalah.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

	@GetMapping("/get-info")
	public String getStringMessage() {
		return "Hi ! You will be able to monitor health of the application !!";
	}

}
