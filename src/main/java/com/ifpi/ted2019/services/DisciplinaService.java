package com.ifpi.ted2019.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifpi.ted2019.domain.Disciplina;
import com.ifpi.ted2019.repositories.DisciplinaRepository;

@Service
public class DisciplinaService {
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	public Disciplina buscar(Integer id) {
		return disciplinaRepository.findById(id).orElse(null);
	}
}
