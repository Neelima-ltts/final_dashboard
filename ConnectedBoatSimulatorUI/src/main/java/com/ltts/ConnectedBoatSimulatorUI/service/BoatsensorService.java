package com.ltts.ConnectedBoatSimulatorUI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatsensor;
import com.ltts.ConnectedBoatSimulatorUI.repository.BoatsensorRepository;

@Service
public class BoatsensorService {

	@Autowired
	private BoatsensorRepository r5;
	
	public List<Boatsensor> getAllBoatsensor(){
		return r5.findAll();
	}
	public void save(Boatsensor boat5) {
		r5.save(boat5);
	}
	public Boatsensor get(int id) {
		return r5.findById(id).get();
	}
	public void delete(int id) {
		r5.deleteById(id);
}
}