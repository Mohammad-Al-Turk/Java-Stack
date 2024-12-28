package com.example.demo.mvc.Repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.mvc.Models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long>{

}
