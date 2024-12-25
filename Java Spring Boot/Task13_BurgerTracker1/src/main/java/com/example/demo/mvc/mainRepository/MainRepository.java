package com.example.demo.mvc.mainRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.mvc.mainModel.Burger;

@Repository
public interface MainRepository extends CrudRepository<Burger, Long>{

	List<Burger> findAll();
	
}
