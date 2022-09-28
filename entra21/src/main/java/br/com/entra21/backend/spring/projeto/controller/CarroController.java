package br.com.entra21.backend.spring.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.entra21.backend.spring.projeto.model.Carro;
import br.com.entra21.backend.spring.projeto.repository.ICarroRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/carros")
public class CarroController {

	@Autowired
	ICarroRepository carroRepository;
	
	@GetMapping("/buscarCor/{cor}")
	private List<Carro> buscarCor(@PathVariable("cor") String cor) {
		
		return carroRepository.qualCor(cor);
	}
	
	@PostMapping("/velocidadeMaxima")
	public Carro velocidade(@RequestBody Carro velocidade) {
		
		return carroRepository.velocidade(velocidade.getVelocidade_maxima());
	}
}
