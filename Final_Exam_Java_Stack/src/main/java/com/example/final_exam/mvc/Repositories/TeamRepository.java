package com.example.final_exam.mvc.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.final_exam.mvc.Models.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long>{

	List<Team> findAll();
	void deleteById(Long id);
}
