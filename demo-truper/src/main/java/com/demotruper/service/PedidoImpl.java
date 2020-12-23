package com.demotruper.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demotruper.Entity.PedidoEntity;
import com.demotruper.dao.PedidoDAO;
import com.demotruper.dao.UsuarioDAO;

@Service
public class PedidoImpl implements IPedido {
	
	private static Logger log = LoggerFactory.getLogger(PedidoImpl.class);
	
	@Autowired
	private PedidoDAO pedidoDAO;
	
	@Autowired 
	private UsuarioDAO usuarioDAO;
	

	@Override
	public void insertPedido(PedidoEntity pedido, String usurname) {
		
		pedidoDAO.save(pedido);
		
		
	}

}
