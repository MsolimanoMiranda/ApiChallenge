package com.msolimano.desafio.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.msolimano.desafio.entity.Evaluacion;
import com.msolimano.desafio.service.IEvaluacionService;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class EvaluacionController {
	
	@Autowired
	private IEvaluacionService evaluacionService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Evaluacion create(@Valid @RequestBody Evaluacion evaluacion) {
		 	
		return evaluacionService.save(evaluacion);
	}
	
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<Evaluacion> LISTAR() {
		 	
		return evaluacionService.listar();
	}
	
	@RequestMapping(value = "/listaFind", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<Evaluacion> listar(@RequestParam(name = "fecha_inicio") String init,@RequestParam(name = "fecha_fin") String fin) throws java.text.ParseException {
		 	
		System.out.println(ParseFecha(init));
			return evaluacionService.findByDateBetween(ParseFecha(init),ParseFecha(fin));
		
	}
	
	
	public Date ParseFecha(String fecha) throws java.text.ParseException
	    {
	        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
	      
	
	        Date fechaDate = null;
	        try {
	            fechaDate = formato.parse(fecha);
	        } 
	        catch (ParseException ex) 
	        {
	            System.out.println(ex);
	        }
	        
	        return fechaDate;
	    }
	
	
	
	


	
	
	

}
