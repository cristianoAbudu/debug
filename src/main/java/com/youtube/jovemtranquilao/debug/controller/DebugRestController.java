package com.youtube.jovemtranquilao.debug.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DebugRestController {
	@GetMapping("/{teste}")
	public String get(@RequestParam("parametro") String parametro,
			@PathVariable("teste") String teste) {
		String retorno = "josé";
				
		retorno += " das couves";
		
		return retorno;
	}
}
