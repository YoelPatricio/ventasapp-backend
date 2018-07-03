package com.cpyt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpyt.dao.IVentaDAO;
import com.cpyt.model.Venta;
import com.cpyt.service.IVentaService;
@Service
public class VentaServiceImpl implements IVentaService{
	
	@Autowired
	private IVentaDAO dao; 

	@Override
	public Venta registrar(Venta venta) {
		venta.getDetalleVenta().forEach(x -> x.setVenta(venta)); // Java 8
		return dao.save(venta);
	}

	@Override
	public List<Venta> listar() {
		return dao.findAll();
	}

}
