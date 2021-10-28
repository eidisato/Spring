package br.org.generation.atividade1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
public class atividade1Controller {
	
		@GetMapping
		public String helloShow() {
			return "Hoje utilizei minhas habilidades de conhecimento em java e Spring para realizar essa tarefa, além de ter uma mentalidade de persistencia!";
		}
	}

