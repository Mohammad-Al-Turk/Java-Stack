package com.example.final_exam.mvc.Models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(catalog = "teams")
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotBlank(message = "must enter team name")
	private String teamName;
	
	
	@NotNull(message = "Skill level must be from 1 to 5")
	@Min(value = 1 , message = "Skill level must be from 1 to 5")
	@Max(value = 5, message = "Skill level must be from 1 to 5")
	private Long skillLevel;
	
	
	@NotBlank(message = "must enter Game day")
    private String gameDay;
	

	@Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    
    
    public Team() {}
	
	public Team(@NotBlank(message = "must enter team name") String teamName,
			@NotNull @Min(value = 1, message = "Skill level must be from 1 to 5") @Max(value = 5, message = "Skill level must be from 1 to 5") Long skillLevel,
			@NotBlank(message = "must enter Game day") String gameDay,User user) {
		super();
		this.teamName = teamName;
		this.skillLevel = skillLevel;
		this.gameDay = gameDay;
		this.user=user;
	}
	
	
	
	
	

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Long getSkillLevel() {
		return skillLevel;
	}
	public void setSkillLevel(Long skillLevel) {
		this.skillLevel = skillLevel;
	}
	public String getGameDay() {
		return gameDay;
	}
	public void setGameDay(String gameDay) {
		this.gameDay = gameDay;
	}

	public Date getCreatedAt() {
		return createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}


    
    
    
    
    
    
    
    
    
    
    
}
