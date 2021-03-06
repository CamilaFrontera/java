package com.ApiEstudiantes.app.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ApiEstudiantes.app.model.Student;

public interface StudentService {

	public Iterable<Student> findAll();
	
	public Page<Student> findAll(Pageable pageable);
	
	public Optional<Student> findById(Integer id);
	
	public Student save(Student student);
	
	public void deleteById(Integer id);

	public ArrayList<Student> findByCalification(Integer calification);
}
