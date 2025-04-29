package com.example.lenoca.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.lenoca.entities.Projeto;
import com.example.lenoca.repositories.ProjetoRepository;

@Service
public class ProjetoService {
	private final ProjetoRepository projetoRepository;
	
	@Autowired
	public ProjetoService(ProjetoRepository projetoRepository) {
		this.projetoRepository = projetoRepository;
	}
	
	public Projeto findProjetoByid(Long id) {
		Optional<Projeto> projeto = projetoRepository.findById(id);
		return projeto.orElseGet(null);
	}
	
	public List<Projeto> findAllProjetos(){
	  return projetoRepository.findAll();	
	}
	
	public Projeto saveProjeto(Projeto projeto) {
		return projetoRepository.save(projeto);
	}
}
