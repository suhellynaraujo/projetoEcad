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
	
	
	
	
	

}
