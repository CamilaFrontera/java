package com.ApiEstudiantes.app.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ApiEstudiantes.app.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	public static ArrayList<Student> findByCalification(Integer calification) {
		// TODO Auto-generated method stub
		return null;
	}
}
