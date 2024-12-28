package com.example.demo.mvc.mainService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.demo.mvc.mainModel.Burger;
import com.example.demo.mvc.mainRepository.MainRepository;


@Service
public class MainSrevice {
	
private final MainRepository mainRepository;

public MainSrevice(MainRepository mainRepository) {
	this.mainRepository = mainRepository;
}

////////////////////////////////////1//////////////////////////

public Burger newCreate(Burger burger) {
	return mainRepository.save(burger);
}


public List<Burger> allBurger(Burger burger) {
	return mainRepository.findAll();
	
}

///////////////////////////////////////2//////////////////////////


public Burger dataById(Long id) {
	Optional<Burger> burger = mainRepository.findById(id);
		return burger.orElse(null);
    

}

public Burger editdata(Burger burger) {
		return mainRepository.save(burger);


}
	
}
