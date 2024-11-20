package com.ss.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ss.entity.Player;
import com.ss.entity.Team;
import com.ss.service.PlayerService;
import com.ss.service.TeamService;

@RestController
public class IplController {
	
	
	@Autowired
	private PlayerService pservice;
	
	@Autowired
	private TeamService tservice;
	
	@PostMapping(value = "/team/save", consumes = "application/json")
	public String saveTeam(@RequestBody Team t) {
		//TODO: process POST request
		tservice.save(t);
		return "Team saved.";
	}
	
	@PostMapping(value = "/player/save/{teamId}", consumes = "application/json")
	public String savePerson(@RequestBody Player p, @PathVariable int teamId) {
		//TODO: process POST request
		pservice.save(p, teamId);
		return "Save Player";
	}
	
	@GetMapping(value = "/team/list")
	public List<Team> Team(){
		return tservice.list();
	}
	
	@GetMapping(value = "/player/list")
	public List<Player> Employee(){
		return pservice.list();
	}
	
	@GetMapping(value= "/list/{tid}" , produces ="application/json")
	public List<Player> listbyteam(@PathVariable int tid){
		return pservice.findByTeam(tid);
	}
	
	@GetMapping(value = "/fetch/{teamId}")
	public Team getTeam(@PathVariable int teamId)
	{
		
		Team t = tservice.fetch(teamId);
		return t;
	}
	
	@GetMapping(value = "/fetch/{jId}")
	public Player getPlayer(@PathVariable int jId)
	{
		
		Player p = pservice.fetch(jId);
		return p;
	}
	
	
	@DeleteMapping(value="/delete/{teamId}")
	public String deletebyid(@PathVariable int teamId)
	{
		 tservice.remove(teamId);
		 return "Deleted sucessfully";
	}
	
	@DeleteMapping(value="/delete/{Jid}")
	public String deletebyid1(@PathVariable int Jid) 
	{
		 pservice.remove(Jid);
		 return "Deleted sucessfully";
	}
	
	
}
