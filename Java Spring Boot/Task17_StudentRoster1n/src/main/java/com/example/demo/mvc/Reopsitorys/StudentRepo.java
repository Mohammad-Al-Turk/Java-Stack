package com.example.demo.mvc.Reopsitorys;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.mvc.Models.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student,Long> {
	List<Student> findAll();
}
