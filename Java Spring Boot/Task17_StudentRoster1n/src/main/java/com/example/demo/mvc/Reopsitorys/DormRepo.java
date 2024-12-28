package com.example.demo.mvc.Reopsitorys;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.mvc.Models.Dorm;

@Repository
public interface DormRepo extends CrudRepository<Dorm, Long>{
	public List<Dorm>findAll();
		
	}

