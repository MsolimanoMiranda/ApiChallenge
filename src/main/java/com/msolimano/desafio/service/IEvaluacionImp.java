package com.msolimano.desafio.service;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msolimano.desafio.dao.EvaluacionDao;
import com.msolimano.desafio.entity.Evaluacion;



@Service
public class IEvaluacionImp implements IEvaluacionService {

	@Autowired
	private EvaluacionDao evaluacionDao;

	@Override
	public Evaluacion save(Evaluacion evaluacion) {
		return evaluacionDao.save(evaluacion);
	}

	@Override
	public List<Evaluacion> listar() {
		
		return evaluacionDao.findAll();
	}

	@Override
	public List<Evaluacion> findByDateBetween(Date from, Date to) {
		
		return evaluacionDao.findByDateBetween(from, to);
	}
	


	

}
