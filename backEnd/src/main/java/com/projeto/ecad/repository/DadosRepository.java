package com.projeto.ecad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.ecad.entity.DadosEntity;

public interface DadosRepository extends JpaRepository<DadosEntity, Long>{

}
