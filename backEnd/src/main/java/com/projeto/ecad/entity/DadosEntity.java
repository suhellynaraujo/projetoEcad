package com.projeto.ecad.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DadosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDado;
	private String nome;
	private String dataInicial;
	private String dataFinal;
	private String arquivos;
	
	public DadosEntity() {
		
	}

	public DadosEntity(Long idDado, String nome, String dataInicial, String dataFinal, String arquivos) {
		this.idDado = idDado;
		this.nome = nome;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.arquivos = arquivos;
	}
	
	
	
	
	

}
