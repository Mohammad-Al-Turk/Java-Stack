package com.example.demo.mvc.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.mvc.Models.Dorm;
import com.example.demo.mvc.Models.Student;
import com.example.demo.mvc.Reopsitorys.DormRepo;

@Service
public class DormService {
	
	private final DormRepo dormRepo;

	public DormService(DormRepo dormRepo) {
		this.dormRepo = dormRepo;
	}

	
	
	
	public Dorm createDorm(Dorm dorm) {
		return dormRepo.save(dorm);
	}
	
	
	public List<Dorm> allDorm() {
		return dormRepo.findAll();
		
	}
	
	
	
	public Dorm dormById(Long id) {
		Optional<Dorm> dorm = dormRepo.findById(id);
		return dorm.orElse(null);
	}
	
	
	
	
	
	
	
	
	
	
}
