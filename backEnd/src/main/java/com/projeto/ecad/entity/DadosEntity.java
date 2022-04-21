package com.projeto.ecad.entity;

import java.util.Objects;

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

	public Long getIdDado() {
		return idDado;
	}

	public void setIdDado(Long idDado) {
		this.idDado = idDado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getArquivos() {
		return arquivos;
	}

	public void setArquivos(String arquivos) {
		this.arquivos = arquivos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idDado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DadosEntity other = (DadosEntity) obj;
		return Objects.equals(idDado, other.idDado);
	}
	
	
	
	
	

}
