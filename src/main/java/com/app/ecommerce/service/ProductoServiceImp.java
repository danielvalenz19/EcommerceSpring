package com.app.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ecommerce.model.Producto;
import com.app.ecommerce.repository.ProductoRepository;

@Service
public class ProductoServiceImp implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoRepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id);
	}

	@Override
	public void Update(Producto producto) {
		productoRepository.save(producto);

	}

	@Override
	public void Delete(Integer id) {
		productoRepository.deleteById(id);

	}

}
