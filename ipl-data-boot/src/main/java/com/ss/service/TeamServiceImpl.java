package com.ss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ss.entity.Team;
import com.ss.repo.TeamRepository;
@Service
public class TeamServiceImpl implements TeamService {
	@Autowired
	private TeamRepository repo;

	@Override
	public void save(Team T) {
		// TODO Auto-generated method stub
		repo.save(T);

	}

	@Override
	public Team fetch(int teamId) {
		// TODO Auto-generated method stub
		return repo.findById(teamId).get();
	}

	@Override
	public List<Team> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void remove(int teamId) {
		// TODO Auto-generated method stub
		repo.deleteById(teamId);
	}

}
