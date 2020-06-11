package com.msolimano.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msolimano.desafio.dao.ComentarioDao;

import com.msolimano.desafio.entity.Comentario;




@Service
public class IComentarioImp implements IComentarioService {

	@Autowired
	private ComentarioDao comentarioDao;

	@Override
	public Comentario save(Comentario comentario) {
		return comentarioDao.save(comentario);
	}


	@Override
	public List<Comentario> findbyId(String id) {
		
		return comentarioDao.findbyId(id);
	}
	


	

}
