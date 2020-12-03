package com.prueba.tecnica.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.tecnica.app.entity.Tarea;

@Repository
public interface TareaDao extends JpaRepository<Tarea, Integer>{

}
