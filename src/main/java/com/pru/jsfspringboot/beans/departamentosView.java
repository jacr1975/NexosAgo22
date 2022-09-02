package com.pru.jsfspringboot.beans;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;




import com.pru.jsfspringboot.pojo.departamentos;
import com.pru.jsfspringboot.repository.departamentosRepository;

@Named
@ViewScoped
public class departamentosView implements Serializable {

  private static final long serialVersionUID = 1L;

  @Inject
  private departamentosRepository depRepository;

  private List<departamentos> deps;
  private departamentos dept1 = new departamentos();
  private departamentos dept2 = new departamentos();

  @PostConstruct
  public void init() {
    deps = depRepository.findAll();
  }

  public List<departamentos> getDeps() {
    return deps;
  }
  
  
  
  public departamentos getDept1() {
	return dept1;
}

public void setDept1(departamentos dept1) {
	this.dept1 = dept1;
}


public departamentos getDept2() {
	return dept2;
}

public void setDept2(departamentos dept2) {
	this.dept2 = dept2;
}

public void limpiar() {

    this.deps = depRepository.findAll();
    this.dept2 = new departamentos();
}

public void createDept() {
      depRepository.save(dept1);
      this.deps = depRepository.findAll();
      this.dept1 = new departamentos();
  }

public void editDept() {
    depRepository.save(dept2);
    this.deps = depRepository.findAll();
    this.dept2 = new departamentos();
}


public void updateDept(Long id) {
	Optional<departamentos> dept3 = depRepository.findById(id);
	System.out.println("band " +id);

	if (dept3.isPresent()) {
		departamentos dept4 = dept3.get();
		dept2.setId(dept4.getId());
		dept2.setDepartamento_codigo(dept4.getDepartamento_codigo());
		dept2.setDepartamento_nombre(dept4.getDepartamento_nombre());
		System.out.println("cod " +dept2.getDepartamento_codigo());
	} 
}


  
	public String deleteDept( long id) {

			depRepository.deleteById(id);
			return "Departamentos";

	}
  
  
}
