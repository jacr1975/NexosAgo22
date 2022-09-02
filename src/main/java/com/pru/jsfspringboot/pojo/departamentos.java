package com.pru.jsfspringboot.pojo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "departamentos")
public class departamentos implements Serializable{

	  private static final long serialVersionUID = 1L;

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  


	  private String departamento_codigo;
	  

	  private String departamento_nombre;
	  private String fecha_hora_crea;
	  private String fecha_hora_modifica;
	  
	  
	  public departamentos() {}
	  

	
	
	


	public departamentos(String departamento_codigo, String departamento_nombre) {

		this.departamento_codigo = departamento_codigo;
		this.departamento_nombre = departamento_nombre;
	}







	public departamentos(String departamento_codigo, String departamento_nombre, String fecha_hora_crea,
			String fecha_hora_modifica) {
		this.departamento_codigo = departamento_codigo;
		this.departamento_nombre = departamento_nombre;
		this.fecha_hora_crea = fecha_hora_crea;
		this.fecha_hora_modifica = fecha_hora_modifica;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartamento_codigo() {
		return departamento_codigo;
	}

	public void setDepartamento_codigo(String departamento_codigo) {
		this.departamento_codigo = departamento_codigo;
	}

	public String getDepartamento_nombre() {
		return departamento_nombre;
	}
	public void setDepartamento_nombre(String departamento_nombre) {
		this.departamento_nombre = departamento_nombre;
	}
	public String getFecha_hora_crea() {
		return fecha_hora_crea;
	}
	public void setFecha_hora_crea(String fecha_hora_crea) {
		this.fecha_hora_crea = fecha_hora_crea;
	}
	public String getFecha_hora_modifica() {
		return fecha_hora_modifica;
	}
	public void setFecha_hora_modifica(String fecha_hora_modifica) {
		this.fecha_hora_modifica = fecha_hora_modifica;
	}
	  
	  
	  
}
