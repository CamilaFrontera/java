package com.ApiEstudiantes.app.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ApiEstudiantes.app.model.Student;
import com.ApiEstudiantes.app.repository.StudentRepository;

@Service
public class StudentServideImplementation implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Student> findAll(Pageable pageable) {
		return studentRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Student> findById(Integer id) {
		return studentRepository.findById(id);
	}

	@Override
	@Transactional
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		studentRepository.deleteById(id);
		
	}
	



	 public ArrayList<Student>  findByCalification(Integer calification) {
	        return StudentRepository.findByCalification(calification);
	    }

}
