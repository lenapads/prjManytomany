package com.example.lenoca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lenoca.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
