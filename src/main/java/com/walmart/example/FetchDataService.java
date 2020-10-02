package com.walmart.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FetchDataService extends JpaRepository<Products,Integer>{

	
	@Override
	List<Products> findAll();
}
