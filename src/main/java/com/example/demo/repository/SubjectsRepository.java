package com.example.demo.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Subjects;

@Repository
public interface SubjectsRepository extends JpaRepository<Subjects, Integer> {

	List<Subjects> findAll();

	
}