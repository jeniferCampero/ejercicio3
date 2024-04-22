package com.curso.service;

import java.util.List;

import com.curso.model.Curso;

public interface CursoService {

	List<Curso> cursos();
	Curso buscarCurso(String codCurso);
	List<Curso> crearCurso(Curso curso);
	void actualizarDuracion(String codCurso, int duracion);
	Curso buscarPrecio(int precio);
	List<Curso> eliminarCurso(String codCurso);
}
