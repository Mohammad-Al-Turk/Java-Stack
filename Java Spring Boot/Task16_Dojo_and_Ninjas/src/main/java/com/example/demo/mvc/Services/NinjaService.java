package com.example.demo.mvc.Services;

import org.springframework.stereotype.Service;

import com.example.demo.mvc.Models.Ninja;
import com.example.demo.mvc.Repositorys.NinjaRepo;

@Service
public class NinjaService {
	
	private final NinjaRepo ninjaRepo;

	public NinjaService(NinjaRepo ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	

}
