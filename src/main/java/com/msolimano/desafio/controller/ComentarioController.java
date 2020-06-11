package com.msolimano.desafio.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.msolimano.desafio.entity.Comentario;

import com.msolimano.desafio.service.IComentarioService;




@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/detalle")
public class ComentarioController {
	
	@Autowired
	private IComentarioService comentarioService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Comentario create(@Valid @RequestBody Comentario comentario) {
		 	
		return comentarioService.save(comentario);
	}
	

	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<Comentario> listar(@RequestParam(name = "id") String id)  {
		 	
			return comentarioService.findbyId(id);
		
	}
	
	
	


	
	
	

}
