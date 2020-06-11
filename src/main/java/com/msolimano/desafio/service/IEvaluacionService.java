package com.msolimano.desafio.service;


import java.util.Date;
import java.util.List;

import com.msolimano.desafio.entity.Evaluacion;



public interface IEvaluacionService {

	
	public Evaluacion save(Evaluacion evaluacion);
	public List<Evaluacion> listar();
	public List<Evaluacion> findByDateBetween(Date from,Date to);
	
		
	
}
