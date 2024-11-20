package com.ss.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ss.entity.Team;

public interface TeamService {
	public void save(Team T);
	
	public Team fetch(int teamId);
	
	public List<Team> list();
	
	public void remove(int teamId);
	
}
