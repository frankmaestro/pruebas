package com.frank2000.demoStart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoControlador {

	@RequestMapping("/saludar")
	public String saludar() {
		
		return "Hola Mundo";
	}
}
