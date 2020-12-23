package com.demotruper.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.demotruper.Entity.Usuarios;

public interface UsuarioDAO extends CrudRepository<Usuarios, String> {
	
	@Query("SELECT u FROM Usuarios u "
			+ "where u.username = ?1 " )
	Usuarios selectUsuario(String name);

}
