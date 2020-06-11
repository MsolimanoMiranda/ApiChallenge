package com.msolimano.desafio.dao;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.msolimano.desafio.entity.Comentario;




public interface ComentarioDao extends MongoRepository<Comentario, String>{
	

	@Query("{'id_evaluacion':?0}")
    public List<Comentario> findbyId(String id);
	
   
}
 