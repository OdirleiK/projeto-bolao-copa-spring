package com.odirlei.bolao.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/bolao")
public class BolaoController {
	
	@GetMapping
	public String exibirUsuarios() {
		return "ola mundo";
	}
}
