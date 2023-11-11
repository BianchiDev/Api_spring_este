package com.bianchi.myapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bianchi.myapi.domen.Usuario;
import com.bianchi.myapi.repositories.UsuarioRepository;
import com.bianchi.myapi.service.exceptions.ObjectNotFoundException;

@Service
public class usuarioService {

	@Autowired
	private UsuarioRepository repository;

	public Usuario findById(Integer Id) {
		Optional<Usuario> obj = repository.findById(Id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! " + "Id: " + Id + ", tipo" + Usuario.class.getName()));
	}

	public List<Usuario> findAll() {
		return repository.findAll();
	}

	public Usuario update(Integer id, Usuario obj) {
		Usuario newObj = findById(id);
		newObj.setLogin(obj.getLogin());
		newObj.setNome(obj.getNome());
		newObj.setSenha(obj.getSenha());
		return repository.save(obj);
	}

	public Usuario create(Usuario obj) {
		return null;
	}

}
