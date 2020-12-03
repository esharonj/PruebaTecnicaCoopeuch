package com.prueba.tecnica.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.prueba.tecnica.app.entity.Tarea;

public interface TareaService {

	public Iterable<Tarea> findAll();
	
	public Page<Tarea> findAll(Pageable pageable);
	
	public Optional<Tarea> findById(int id);
	
	public Tarea save(Tarea tarea);
	
	public void deleteById(int id);
	
	  
 }
