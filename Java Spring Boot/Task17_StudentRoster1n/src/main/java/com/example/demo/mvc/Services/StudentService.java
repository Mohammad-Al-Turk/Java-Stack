package com.example.demo.mvc.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.mvc.Models.Student;
import com.example.demo.mvc.Reopsitorys.StudentRepo;

@Service
public class StudentService {
	private final StudentRepo studentRepo;

	public StudentService(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}
	
	
	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}
	
	public List<Student> allStudent() {
		return studentRepo.findAll();
	}
	
	public Optional<Student> studentById(Long id) {
		return studentRepo.findById(id);
	}
	
	////////////////////////////

	public void removeStudentFromDorm(Long studentId) {
    Optional<Student> optionalStudent = studentRepo.findById(studentId);
    if (optionalStudent.isPresent()) {
        Student student = optionalStudent.get();
        student.setDorm(null);   
        studentRepo.save(student); 
    }
}

	
	
}
