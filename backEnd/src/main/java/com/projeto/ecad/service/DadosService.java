package com.projeto.ecad.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.ecad.entity.DadosEntity;
import com.projeto.ecad.repository.DadosRepository;

@Service
public class DadosService {
	
	@Autowired
	private DadosRepository dadosRepository;
	
	@Transactional(readOnly = true)
	public List<DadosEntity> findAll(){
		List<DadosEntity> result = dadosRepository.findAll();
		return result;
		
	}

	public void save(DadosEntity dados) {
		try {
			dadosRepository.save(dados);
		}catch (Exception e) {
			throw e;
		}
	}
	
	public void update(DadosEntity dado) {
		try {
			dadosRepository.save(dado);
		} catch (Exception e) {
			throw e;
		}
	}

	
	
}
