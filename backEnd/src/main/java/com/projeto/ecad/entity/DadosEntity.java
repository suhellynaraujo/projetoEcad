package com.projeto.ecad.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Dados")
public class DadosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDado;
	
	private String banco; 
	private String nome;
	private String dataInicial;
	private String dataFinal;
	private String arquivos;
	private String tipo;
	private int linhas;
	private String total;
	
	
	public DadosEntity() {
		
	}

	public DadosEntity(Long idDado, String banco, String nome, String dataInicial, String dataFinal, String arquivos,
			String tipo, int linhas, String total) {
		this.idDado = idDado;
		this.banco = banco;
		this.nome = nome;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.arquivos = arquivos;
		this.tipo = tipo;
		this.linhas = linhas;
		this.total = total;
	}



	public Long getIdDado() {
		return idDado;
	}



	public void setIdDado(Long idDado) {
		this.idDado = idDado;
	}



	public String getBanco() {
		return banco;
	}



	public void setBanco(String banco) {
		this.banco = banco;
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



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public int getLinhas() {
		return linhas;
	}



	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}



	public String getTotal() {
		return total;
	}



	public void setTotal(String total) {
		this.total = total;
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
