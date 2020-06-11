package com.msolimano.desafio.dao;


import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.msolimano.desafio.entity.Evaluacion;


public interface EvaluacionDao extends MongoRepository<Evaluacion, String>{
	
	@Query("{'fecha_inscripcion':{$gte:?0,$lt:?1}}")
    public List<Evaluacion> findByDateBetween(Date from,Date to);
	
   
}
 