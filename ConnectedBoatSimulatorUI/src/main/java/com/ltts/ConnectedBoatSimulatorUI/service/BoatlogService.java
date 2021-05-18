package com.ltts.ConnectedBoatSimulatorUI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatlog;
import com.ltts.ConnectedBoatSimulatorUI.repository.BoatlogRepository;

@Service
public class BoatlogService {

	@Autowired
	private BoatlogRepository r4;
	
	public List<Boatlog> getAllBoatlog(){
		return r4.findAll();
	}
	public void save(Boatlog boat4) {
		r4.save(boat4);
	}
	public Boatlog get(int id) {
		return r4.findById(id).get();
	}
	public void delete(int id) {
		r4.deleteById(id);
}
}