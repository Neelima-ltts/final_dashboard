package com.ltts.ConnectedBoatSimulatorUI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatlocation;
import com.ltts.ConnectedBoatSimulatorUI.repository.BoatlocationRepository;

@Service
public class BoatlocationService {

	@Autowired
	private BoatlocationRepository r3;
	
	public List<Boatlocation> getAllBoatlocation(){
		return r3.findAll();
	}
	public void save(Boatlocation boat3) {
		r3.save(boat3);
	}
	public Boatlocation get(int id) {
		return r3.findById(id).get();
	}
	
	public Boatlocation getCurrentLocation(Boatlocation m) {
		//return repo.findByLocationId(id).get();
		  
		 return m;
	}
	public void delete(int id) {
		r3.deleteById(id);
}
}