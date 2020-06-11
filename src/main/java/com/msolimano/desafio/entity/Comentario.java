package com.msolimano.desafio.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;



@SuppressWarnings("deprecation")
@Document(collection="satisfaccion_detalle")
public class Comentario implements Serializable{

	
	@JsonProperty
	@NotBlank
	private String id_evaluacion;
	
	public String getId_evaluacion() {
		return id_evaluacion;
	}




	public void setId_evaluacion(String id_evaluacion) {
		this.id_evaluacion = id_evaluacion;
	}




	@JsonProperty
	@NotBlank
	private String comentario;
	
	
	
	
	public String getComentario() {
		return comentario;
	}




	public void setComentario(String comentario) {
		this.comentario = comentario;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	





}


