package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Curso;

public interface CursoDao extends JpaRepository<Curso, String> {

	Curso findByPrecio(int precio);
}
