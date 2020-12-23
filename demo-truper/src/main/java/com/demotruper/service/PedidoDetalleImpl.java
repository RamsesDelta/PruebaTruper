package com.demotruper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demotruper.Entity.PedidoDetalleEntity;
import com.demotruper.dao.PedidoDetalleDAO;

@Service
public class PedidoDetalleImpl implements IPedidoDetalle{
	
	@Autowired
	private PedidoDetalleDAO pedidoDEtalleDAO;

	@Override
	public void inserPedidoDetalle(PedidoDetalleEntity pedidoEntity) {
		
		
		pedidoDEtalleDAO.save(pedidoEntity);
		
	}

	
	
}
