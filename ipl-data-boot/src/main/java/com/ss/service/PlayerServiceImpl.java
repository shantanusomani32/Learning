package com.ss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ss.entity.Player;
import com.ss.entity.Team;
import com.ss.repo.PlayerRepository;



@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	private PlayerRepository repo;
	
	@Autowired
	private TeamService tservice;
	

	@Override
	public void save(Player p, int teamId) {
		Team t = tservice.fetch(teamId);
		p.setTeam(t);
		repo.save(p);
	}

	@Override
	public Player fetch(int jId) {
		// TODO Auto-generated method stub
		return repo.findById(jId).get();
	}

	@Override
	public List<Player> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void remove(int jId) {
		// TODO Auto-generated method stub
		repo.deleteById(jId);
	}

	@Override
	public List<Player> listByTeam(int teamId) {
		// TODO Auto-generated method stub
		return repo.findByTeam(teamId);
	}

	@Override
	public List<Player> findByTeam(int tid) {
		// TODO Auto-generated method stub
		
		return repo.findByTeam(tid);
	}

	

}
