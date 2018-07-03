package com.cpyt.service;

import java.util.List;

import com.cpyt.model.Venta;

public interface IVentaService {
	
	Venta registrar(Venta venta);
	
	List<Venta> listar();
}
