package com.demotruper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demotruper.Entity.PedidoDetalleEntity;
import com.demotruper.Entity.PedidoEntity;
import com.demotruper.service.IPedido;
import com.demotruper.service.IPedidoDetalle;


@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	@Autowired
	private IPedido pedido;
	
	@Autowired
	private IPedidoDetalle pedidoDEtalle;
	
	
	@PostMapping("/insert/{nombre}")
	public void insertPedido(@RequestBody PedidoEntity pedi ,@PathVariable String nombre) {
		pedido.insertPedido(pedi, nombre);
	}
	
	@PostMapping("/insertPedidoDetalle")
	public void insertPedidoDetalle(@RequestBody PedidoDetalleEntity pedidoDetalle) {
		pedidoDEtalle.inserPedidoDetalle(pedidoDetalle);
	}
}
