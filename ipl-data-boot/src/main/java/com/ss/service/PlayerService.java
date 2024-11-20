package com.ss.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ss.entity.Player;


public interface PlayerService {
	
	public void save(Player P, int teamId);
	
	public Player fetch(int jId);
	
	public List<Player> list();
	
	public List<Player> listByTeam(int teamId);
	
	public void remove (int jNo);

	public List<Player> findByTeam(int tid);

}
