package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;
import com.curso.service.CursoService;

@RestController
public class CursoController {

	@Autowired
	CursoService cursoService;
	
	@GetMapping(value="cursos", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> buscarCursos() {
		return cursoService.cursos();
	}
	
	@GetMapping(value="curso/{codCurso}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Curso buscarCurso(@PathVariable("codCurso") String codCurso) {
		return cursoService.buscarCurso(codCurso);
	}
	
	@GetMapping(value="curso/precio/{precio}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Curso buscarPorPrecio(@PathVariable("precio") int precio) {
		return cursoService.buscarPrecio(precio);
	}
	
	@PostMapping(value="curso", consumes=MediaType.APPLICATION_JSON_VALUE,  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> crearCurso(@RequestBody Curso curso){
		return cursoService.crearCurso(curso);		
	}
	
	@PutMapping(value="curso/{codCurso}/{duracion}")
	public void actualizarCurso(@PathVariable("codCurso") String codCurso,@PathVariable("duracion") int duracion) {
		cursoService.actualizarDuracion(codCurso, duracion);
	}
	
	@DeleteMapping(value="curso/{codCurso}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> eliminarCurso(@PathVariable("codCurso") String codCurso){
		return cursoService.eliminarCurso(codCurso);
	}
}
