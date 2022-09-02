package com.pru.jsfspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pru.jsfspringboot.pojo.empleados;

@Repository
public interface empleadosRepository extends JpaRepository<empleados, Long> {
}