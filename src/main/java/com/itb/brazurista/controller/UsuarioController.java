package com.itb.brazurista.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/brazurista/usuario")
public class UsuarioController {

	
	@GetMapping("/cadastro")
	String novoProduto() {
		
		return "cadastro";
	}
}
