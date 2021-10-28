package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String helloShow() {
		return "Meu objetivo de aprendizagem essa semana, será focado no Spring, melhorando meu conhecimento em back-end";
	}
}
