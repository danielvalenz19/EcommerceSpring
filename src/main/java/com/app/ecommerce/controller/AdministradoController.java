package com.app.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.ecommerce.model.Producto;
import com.app.ecommerce.service.ProductoService;

@Controller
@RequestMapping("/administrador")
public class AdministradoController {
	@Autowired
	private ProductoService productoService;
	@GetMapping("")
	public String home(Model model) {
		List<Producto> productos = productoService.findAll();
		model.addAttribute("productos",productos);
		return "administrador/home";
	}
}
