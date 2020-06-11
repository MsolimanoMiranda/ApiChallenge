package com.msolimano.desafio.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import java.io.Serializable;
import java.util.Date;


@SuppressWarnings("deprecation")
@Document(collection="satisfaccion")

public class Evaluacion implements Serializable{

	@Id
    private String _id;
	
	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}


	@JsonProperty
	@NotBlank
	private String nombres;
	
	@JsonProperty
	@NotBlank
	private String apellidos;
	
	@JsonProperty
	@NotBlank
	private String correo;
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}


	@JsonProperty
	@Min(value = 1)
	@Max(value = 10)
	@NotNull
	private Integer puntuacion;
	
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	@Past
	@NotNull
	private Date fecha_inscripcion;

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Date getFecha_inscripcion() {
		return fecha_inscripcion;
	}

	public void setFecha_inscripcion(Date fecha_inscripcion) {
		this.fecha_inscripcion = fecha_inscripcion;
	}
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Evaluacion(@NotBlank String nombres, @NotBlank String apellidos, @NotBlank String correo,
			@Min(1) @Max(10) @NotNull Integer puntuacion, @Past @NotNull Date fecha_inscripcion) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
		this.puntuacion = puntuacion;
		this.fecha_inscripcion = fecha_inscripcion;
	}

	public Evaluacion() {
	
	}

	
	





}


