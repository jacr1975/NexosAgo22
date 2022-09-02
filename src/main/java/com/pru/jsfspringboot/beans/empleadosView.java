package com.pru.jsfspringboot.beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.pru.jsfspringboot.pojo.departamentos;
import com.pru.jsfspringboot.pojo.empleados;
import com.pru.jsfspringboot.repository.empleadosRepository;
import com.pru.jsfspringboot.repository.departamentosRepository;

@Named
@ViewScoped
public class empleadosView implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private empleadosRepository empRepository;
	
	@Inject
	private departamentosRepository depRepository;

	private List<empleados> emps;
	private List<departamentos> deps;
	private empleados emp1 = new empleados();
	private empleados emp2 = new empleados();
	private List<String> lemp = new ArrayList<String>();
	int cont1 = 0;

	@PostConstruct
	public void init() {
		emps = empRepository.findAll();
		deps = depRepository.findAll();	
		llenar();

	}

	public List<empleados> getEmps() {
		return emps;
	}

	public empleados getEmp1() {
		return emp1;
	}

	public void setEmp1(empleados emp1) {
		this.emp1 = emp1;
	}

	public empleados getEmp2() {
		return emp2;
	}

	public void setEmp2(empleados emp2) {
		this.emp2 = emp2;
	}

	public List<String> getLemp() {
		return lemp;
	}

	public void setLemp(List<String> lemp) {
		this.lemp = lemp;
	}

	public void limpiar() {
        
		this.emps = empRepository.findAll();
		this.deps = depRepository.findAll();	
		this.emp2 = new empleados();
		llenar();
	}

	public void createEmpl() {
		emp1.setFecha_hora_crea(hfecha());
		emp1.setFecha_hora_modifica(hfecha());
		empRepository.save(emp1);
		this.emps = empRepository.findAll();
		this.deps = depRepository.findAll();
		llenar();
		this.emp1 = new empleados();
	}

	public void editEmpl() {
		emp2.setFecha_hora_modifica(hfecha());
		empRepository.save(emp2);
		this.emps = empRepository.findAll();
		this.deps = depRepository.findAll();	
		llenar();
		this.emp2 = new empleados();
	}

	public void updateEmpl(Long id) {
		Optional<empleados> emp3 = empRepository.findById(id);

		if (emp3.isPresent()) {
			empleados emp4 = emp3.get();
			emp2.setId(emp4.getId());
			emp2.setDocumento_tipo(emp4.getDocumento_tipo());
			emp2.setDocumento_numero(emp4.getDocumento_numero());
			emp2.setNombres(emp4.getNombres());
			emp2.setApellidos(emp4.getApellidos());
			emp2.setDepartamentos_id(emp4.getDepartamentos_id());
			emp2.setCiudad(emp4.getCiudad());
			emp2.setDireccion(emp4.getDireccion());
			emp2.setCorreo_electronico(emp4.getCorreo_electronico());
			emp2.setTelefono(emp4.getTelefono());
			emp2.setFecha_hora_crea(emp4.getFecha_hora_crea());
			emp2.setFecha_hora_modifica(emp4.getFecha_hora_modifica());
		}
	}

	public String deleteEmpl(long id) {

		empRepository.deleteById(id);
		return "Empleados";

	}

	public String hfecha() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Before : " + now);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formatDateTime = now.format(formatter);
		return formatDateTime;
	}

	public void llenar() {
		cont1 = 0;
		lemp = new ArrayList<String>();
		while(cont1 < deps.size()) {
			lemp.add(deps.get(cont1).getDepartamento_codigo());
			++cont1;
		}
	}
	
	
}