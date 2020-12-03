package com.prueba.tecnica.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.tecnica.app.dao.TareaDao;
import com.prueba.tecnica.app.entity.Tarea;

@Service
public class TareaServiceImpl implements TareaService{

	@Autowired
	private TareaDao tareaDao;
	
	
	
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Tarea> findAll() {
		
		return tareaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Tarea> findAll(Pageable pageable) {
		
		return tareaDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Tarea> findById(int id) {
		
		return tareaDao.findById(id);
	}

	@Override
	@Transactional
	public Tarea save(Tarea tarea) {
		
		return tareaDao.save(tarea);
	}

	@Transactional
	public void deleteById(int id) {
		tareaDao.deleteById(id);
	}

}
