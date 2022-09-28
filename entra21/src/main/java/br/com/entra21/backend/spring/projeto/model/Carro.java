package br.com.entra21.backend.spring.projeto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carro")
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String marca;
	private String modelo;
	private String cor;
	private Integer velocidade_maxima;
	
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carro(Integer id, String marca, String modelo, String cor, Integer velocidade_maxima) {
		super();
		Id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.velocidade_maxima = velocidade_maxima;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getVelocidade_maxima() {
		return velocidade_maxima;
	}

	public void setVelocidade_maxima(Integer velocidade_maxima) {
		this.velocidade_maxima = velocidade_maxima;
	}
	
	
	
}
