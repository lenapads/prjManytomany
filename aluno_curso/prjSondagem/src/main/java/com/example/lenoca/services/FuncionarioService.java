package com.example.lenoca.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.lenoca.entities.Funcionario;
import com.example.lenoca.repositories.FuncionarioRepository;


@Service
public class FuncionarioService {
private final FuncionarioRepository funcionarioRepository;

	@Autowired
	public FuncionarioService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}
	
	public Funcionario findFuncionarioByid(Long id) {
		Optional<Funcionario> funcionario = funcionarioRepository.findById(id);
		return funcionario.orElseGet(null);
	}
	
	public List<Funcionario> findAllFuncionarios(){
	  return funcionarioRepository.findAll();	
	}
	
	public Funcionario saveFuncionario(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
}
