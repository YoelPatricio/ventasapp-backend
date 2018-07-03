package com.cpyt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpyt.dao.IProductoDAO;
import com.cpyt.model.Producto;
import com.cpyt.service.IProductoService;
@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoDAO dao;
	
	@Override
	public Producto registrar(Producto producto) {
		return dao.save(producto);
	}

	@Override
	public void modificar(Producto producto) {
		dao.save(producto);
		
	}

	@Override
	public void eliminar(int idProducto) {
		dao.delete(idProducto);
		
	}

	@Override
	public Producto listarId(int idProducto) {
		return dao.findOne(idProducto);
	}

	@Override
	public List<Producto> listar() {
		return dao.findAll();
	}

}
