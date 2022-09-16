package br.com.entra21.backend.spring.projeto.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="programador")
public class Programador extends MaturidadeNivel3Richardson {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private Integer qtd_linguagem;
	
	public Programador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Programador(ArrayList<ItemNivel3> links) {
		super(links);
		// TODO Auto-generated constructor stub
	}
	public Programador(Integer id, String nome, Integer qtd_linguagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.qtd_linguagem = qtd_linguagem;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQtd_linguagem() {
		return qtd_linguagem;
	}
	public void setQtd_linguagem(Integer qtd_linguagem) {
		this.qtd_linguagem = qtd_linguagem;
	}
	
	
	
	
}
