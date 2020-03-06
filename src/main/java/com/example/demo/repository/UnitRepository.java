package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Unit;
public interface UnitRepository  extends JpaRepository<Unit, Integer>{
	
	List<Unit> findAll();

}
