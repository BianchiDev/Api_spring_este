package com.bianchi.myapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bianchi.myapi.domen.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>	{

}
