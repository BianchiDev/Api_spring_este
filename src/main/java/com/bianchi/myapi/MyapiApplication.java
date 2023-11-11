package com.bianchi.myapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bianchi.myapi.domen.Usuario;
import com.bianchi.myapi.repositories.UsuarioRepository;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Usuario u1 = new Usuario(null,"felipe" ,"felipe bianchi" ,"123");
		Usuario u2 = new Usuario(null ,"Pedro" ,"pedro bianchi","123");

		usuarioRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
