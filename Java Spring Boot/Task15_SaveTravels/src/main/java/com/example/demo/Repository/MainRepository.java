package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Expense;

@Repository
public interface MainRepository extends CrudRepository<Expense, Long>{

}
