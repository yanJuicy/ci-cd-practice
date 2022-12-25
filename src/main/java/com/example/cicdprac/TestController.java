package com.example.cicdprac;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.username}")
	private String username;

	// 주석 추가
	@GetMapping("/hello")
	public String test() {
		return "Hello World" + url + username;
	}


	@GetMapping()
	public String test2() {
		return "Hello World Test";
	}

}
