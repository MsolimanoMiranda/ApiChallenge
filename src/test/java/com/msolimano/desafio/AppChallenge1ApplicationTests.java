package com.msolimano.desafio;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.msolimano.desafio.controller.EvaluacionController;
import com.msolimano.desafio.entity.Evaluacion;
import com.msolimano.desafio.service.IEvaluacionService;

@RunWith(SpringRunner.class)
@SpringBootTest
class AppChallenge1ApplicationTests {


	 @Autowired
	 private EvaluacionController controller;
	 @Autowired
	 private IEvaluacionService repository;

	 @Test
	 public void contextLoads() {
	  assertThat(controller).isNotNull();
	 }
	 
	 @Test
	 public void saveEvaluacion() {
	        Evaluacion evaluacion;
			try {
				evaluacion = new Evaluacion("Mark", "Heckler","msolimano_miranda@gmai.com", 9, controller.ParseFecha("26-06-1995"));
				 repository.save(evaluacion);
			        assertThat(evaluacion.getPuntuacion()).isNotNull();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
	       
	    }
	 
	 @Test
	 public void listarEvaluacionesFiltro() {
	       
			try {
				repository.findByDateBetween(controller.ParseFecha("01-06-1995"), controller.ParseFecha("01-01-2020"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	    }
	 
	 @Test
	 public void listarEvaluaciones() {
	       
			repository.listar();
	        
	    }
}

