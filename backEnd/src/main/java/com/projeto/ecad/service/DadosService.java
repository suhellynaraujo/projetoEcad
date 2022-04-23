package com.projeto.ecad.service;



import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.ecad.entity.DadosEntity;
import com.projeto.ecad.repository.DadosRepository;

@Service
public class DadosService  implements CommandLineRunner{
	
	@Autowired
	private DadosRepository dadosRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		DadosEntity dado1 = new DadosEntity(null, "CB120800.RET", "BRADESCO", "12/08/2020", "12/08/2020", 508, "RRCUNHA", "RET", "110.266,19");
		DadosEntity dado2 = new DadosEntity(null, "CB120801.RET", "BRADESCO", "12/08/2020", "12/08/2020", 320, "RRCUNHA", "RET", "100.598,46");
		DadosEntity dado3 = new DadosEntity(null, "CB120802.RET", "BRADESCO", "12/08/2020", "12/08/2020", 8, "RRCUNHA", "RET", "34.975,77");
		DadosEntity dado4 = new DadosEntity(null, "CB120803.RET", "BRADESCO", "12/08/2020", "12/08/2020", 603, "RRCUNHA", "RET", "139.881,24");
		DadosEntity dado5 = new DadosEntity(null, "CB120801.REM", "BRADESCO", "12/08/2020", "12/08/2020", 286, "MMORAIS", "REM", "208.924,55");
		DadosEntity dado6 = new DadosEntity(null, "CB120802.REM", "BRADESCO", "12/08/2020", "12/08/2020", 15, "MMORAIS", "REM", "6.260,43");
		dadosRepository.saveAll(Arrays.asList(dado1, dado2, dado3, dado4, dado5, dado6));
	}
	
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

	public void delete(Long idDado) {
		Optional<DadosEntity> dados =  dadosRepository.findById(idDado);
		if(dados.isPresent()) {
			dadosRepository.delete(dados.get());
			System.out.println(dados.get().getNome());
		}else {
			System.out.println("Não há arquivos!");
		}
		
	}

	public DadosEntity getById(Long idDado) {
		Optional<DadosEntity> dados = dadosRepository.findById(idDado);
		if(dados.isPresent()) {
			return dados.get();
		}else {
		
		return null;
	}
		}


	
	
}
