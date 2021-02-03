package com.springboot.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.practice.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
