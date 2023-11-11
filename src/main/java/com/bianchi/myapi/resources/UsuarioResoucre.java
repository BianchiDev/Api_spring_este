package com.bianchi.myapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bianchi.myapi.domen.Usuario;
import com.bianchi.myapi.service.usuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResoucre {

	@Autowired
	private usuarioService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Integer id) {
		Usuario obj = this.service.findById(id);
		return ResponseEntity.ok().body(obj);

	}

	@GetMapping
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Usuario> update(@PathVariable Integer id, @RequestBody Usuario obj) {
		Usuario newObj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}

	@PostMapping
	public ResponseEntity<Usuario> create(@RequestBody Usuario obj) {
		Usuario newObj = service.create(obj);
		return ResponseEntity.status(HttpStatus.CREATED).body(newObj);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Usuario> delete(@PathVariable Integer id) {
		Usuario newObj = service.delete(id);
		return ResponseEntity.ok().build();
	}

}
