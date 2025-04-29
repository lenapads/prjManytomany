package com.example.lenoca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lenoca.entities.Funcionario;
import com.example.lenoca.services.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

	private final FuncionarioService funcionarioService;
	
	@Autowired
	public FuncionarioController(FuncionarioService funcionarioService) {
		this.funcionarioService = funcionarioService;
	}
	
	@PostMapping("/create")
	public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioService.saveFuncionario(funcionario);
	}
	
	@GetMapping("/{id}")
	public Funcionario getFuncionario(@PathVariable Long id) {
		return funcionarioService.findFuncionarioByid(id);
	}
	
	@GetMapping("/all")
	public List<Funcionario> getAllFuncionarios(){
		return funcionarioService.findAllFuncionarios();
	}
}
