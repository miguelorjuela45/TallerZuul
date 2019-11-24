package com.example.Api.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Api.Entity.Usuario;

@Repository("gestorUsuario")
public interface GestorUsuario extends JpaRepository<Usuario, Serializable> {

	public abstract Usuario findByUsuario(String usuario);
}
