package com.app.ecommerce.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.ecommerce.service.ProductoService;

import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/")
public class HomeController {
	
	private final Logger log = (Logger) LoggerFactory.getLogger(HomeController.class);//21 6:04 me pide casteo
	
	@Autowired
	private ProductoService productoService;

	@GetMapping("")
	public String home(Model model) {

		model.addAttribute("productos", productoService.findAll());

		return "usuario/home";
	}
	@GetMapping("productohome/{id}")
	public String productoHome(@PathVariable Integer id) {
		log.info("id producto enviado como parametro {}", id);
		return "usuario/productohome";
	}

}
