package com.ss.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ss.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
	
	@Query("FROM Player WHERE team.teamId=:teamId")
	List<Player> findByTeam(@Param("teamId") int teamId);
}
