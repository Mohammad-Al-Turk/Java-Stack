package com.example.demo.mvc.Repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.mvc.Models.Dojo;

@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long>{

}
