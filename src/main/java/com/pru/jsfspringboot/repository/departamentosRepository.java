package com.pru.jsfspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pru.jsfspringboot.pojo.departamentos;

@Repository
public interface departamentosRepository extends JpaRepository<departamentos, Long> {
}