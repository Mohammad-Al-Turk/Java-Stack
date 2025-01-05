package com.example.final_exam.mvc.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.final_exam.mvc.Models.Team;
import com.example.final_exam.mvc.Repositories.TeamRepository;

@Service
public class TeamService {
	private final TeamRepository teamRepository;

	public TeamService(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}
	
	
	public List<Team> allTeams() {
		return teamRepository.findAll();
	}
	
	
	public Team teamById(Long id) {
		Optional<Team> team = teamRepository.findById(id);
		return team.orElse(null);
	}
	
	
	public Team createTeams(Team team) {
		return teamRepository.save(team);
	}
	
	public void deleteTeamById(Long id) {
	    teamRepository.deleteById(id);
	}
	

}
