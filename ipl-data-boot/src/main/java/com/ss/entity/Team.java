package com.ss.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Team {
	
	@Id
	@Column
	private int teamId;
	
	@Column
	private String teamName;
	
	@Column 
	private String owner;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "team", cascade = CascadeType.REMOVE)
	private List<Player> player;
	
	

	public int getteamId() {
		return teamId;
	}

	public void setjId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public List<Player> getPlayer() {
		return player;
	}

	public void setPlayer(List<Player> player) {
		this.player = player;
	}
	
	
}
