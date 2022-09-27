package br.com.entra21.backend.spring.projeto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.entra21.backend.spring.projeto.model.Usuario;
import br.com.entra21.backend.spring.projeto.repository.IUsuarioRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	IUsuarioRepository usuarioRepository;

	@GetMapping("/maior_que/{idade}")
	private List<Usuario> maiorQue(@PathVariable("idade") Integer idade){
		 
		 return new ArrayList<Usuario>();
	 }
}
