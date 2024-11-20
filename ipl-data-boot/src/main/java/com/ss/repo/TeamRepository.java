package com.ss.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ss.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {

}
