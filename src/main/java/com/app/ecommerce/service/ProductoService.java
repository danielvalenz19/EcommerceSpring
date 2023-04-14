package com.app.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.sql.Update;

import com.app.ecommerce.model.Producto;

public interface ProductoService {
	public Producto save(Producto producto);

	public Optional<Producto> get(Integer id);

	public void Update(Producto producto);

	public void Delete(Integer id);

	public List<Producto> findAll();
}
