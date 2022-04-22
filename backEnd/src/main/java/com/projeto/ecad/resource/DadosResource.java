package com.projeto.ecad.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.ecad.entity.DadosEntity;
import com.projeto.ecad.service.DadosService;

@RestController
@RequestMapping(value = "/dados")
public class DadosResource {
	
	@Autowired
	public DadosService dadosService;
	
	@GetMapping
	public List<DadosEntity> findAll(){
		return dadosService.findAll();
	}
	
	@PostMapping(value = "/salvar")
	public ResponseEntity<DadosEntity> save(@RequestBody DadosEntity dados){
		dadosService.save(dados);
		return ResponseEntity.ok().body(dados);
	}
	
	@PutMapping(value = "/atualizar")
	public ResponseEntity<DadosEntity> update(@RequestBody DadosEntity dado){
		dadosService.save(dado);
		return ResponseEntity.ok().body(dado);
		}

	@DeleteMapping(value = "/{idDados}")
	public ResponseEntity<DadosEntity> delete(@PathVariable Long idDados){
		dadosService.delete(idDados);
		DadosEntity dados = dadosService.getById(idDados);
		return ResponseEntity.ok().body(dados);
		
	}
}
