package com.msolimano.desafio.service;


import java.util.List;

import com.msolimano.desafio.entity.Comentario;



public interface IComentarioService {

	
	public Comentario save(Comentario comentario);
	public List<Comentario> findbyId(String id);
	
	
		
	
}
