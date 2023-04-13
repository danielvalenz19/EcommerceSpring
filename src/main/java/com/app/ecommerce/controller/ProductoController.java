package com.app.ecommerce.controller;

import org.slf4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.ecommerce.model.Producto;

import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	private final Logger LOGGER = (Logger) LoggerFactory.getLogger(ProductoController.class);
	
	@GetMapping("")
	public String show() {
		return "productos/show";
	}
	@GetMapping("/create")
	public String create() {
		return"productos/create";
	}
	@PostMapping("/save")
	public String save(Producto producto) {
		LOGGER.info("este es el objeto producto {}",producto);
		return "redirect:/productos";
	}
	
	
}
