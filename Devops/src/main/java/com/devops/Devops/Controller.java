package com.devops.Devops;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
	@RequestMapping("/sample")
	public String sample() {
		return "hii Aniket";
	}

}
