package com.cpyt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpyt.model.Venta;
import com.cpyt.service.IVentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {
	
	@Autowired
	private IVentaService service;
	
	@GetMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Venta>> listar() {
		List<Venta> ventas = new ArrayList<>();
		ventas = service.listar();
		return new ResponseEntity<List<Venta>>(ventas, HttpStatus.OK);
	}
	
	@PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Venta> registrar(@RequestBody Venta venta) {
		Venta ven = new Venta();
		try {
			ven = service.registrar(venta);
		} catch (Exception e) {
			return new ResponseEntity<Venta>(ven, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<Venta>(ven, HttpStatus.OK);
	}

}
