package com.example.demo.mvc.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.mvc.Models.Dojo;
import com.example.demo.mvc.Repositorys.DojoRepo;

@Service
public class DojoService {
	
	private final DojoRepo dojoRepo;

	public DojoService(DojoRepo dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public List<Dojo> allDojo() {
		return (List<Dojo>) dojoRepo.findAll();
	}
	

	public Dojo dojoById(Long id) {
		Optional<Dojo> dojo = dojoRepo.findById(id);
		return dojo.orElse(null);
	}
}
