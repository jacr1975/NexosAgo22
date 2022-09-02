package com.pru.jsfspringboot.pojo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "empleados")
public class empleados {
	
	  private static final long serialVersionUID = 1L;

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  
	  private String documento_tipo;
	  private String documento_numero;
	  private String nombres;
	  private String apellidos;
	  private String departamentos_id;
	  private String ciudad;
	  private String direccion;	 
	  private String correo_electronico;	 	  
	  private String telefono;	 
	  private String fecha_hora_crea;
	  private String fecha_hora_modifica;
	  
	  public empleados() {}
	  


	public empleados(String documento_tipo, String documento_numero, String nombres, String apellidos,
			String departamentos_id, String ciudad, String direccion, String correo_electronico, String telefono,
			String fecha_hora_crea, String fecha_hora_modifica) {
		this.documento_tipo = documento_tipo;
		this.documento_numero = documento_numero;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.departamentos_id = departamentos_id;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.correo_electronico = correo_electronico;
		this.telefono = telefono;
		this.fecha_hora_crea = fecha_hora_crea;
		this.fecha_hora_modifica = fecha_hora_modifica;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDocumento_tipo() {
		return documento_tipo;
	}

	public void setDocumento_tipo(String documento_tipo) {
		this.documento_tipo = documento_tipo;
	}

	public String getDocumento_numero() {
		return documento_numero;
	}

	public void setDocumento_numero(String documento_numero) {
		this.documento_numero = documento_numero;
	}

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

	public String getDepartamentos_id() {
		return departamentos_id;
	}

	public void setDepartamentos_id(String departamentos_id) {
		this.departamentos_id = departamentos_id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}



	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
