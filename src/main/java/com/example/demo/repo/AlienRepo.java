package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{
	
	List<Alien> findByAname(String aname);
	
	List<Alien> findByAidGreaterThan(int aid);
	
}
