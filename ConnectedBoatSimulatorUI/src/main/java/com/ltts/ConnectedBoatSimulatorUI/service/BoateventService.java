package com.ltts.ConnectedBoatSimulatorUI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatevent;
import com.ltts.ConnectedBoatSimulatorUI.repository.BoateventRepository;

@Service
public class BoateventService {

	@Autowired
	private BoateventRepository r2;
	
	public List<Boatevent> getAllBoatevent(){
		return r2.findAll();
	}
	public void save(Boatevent boat2) {
		r2.save(boat2);
	}
	public Boatevent get(int id) {
		return r2.findById(id).get();
	}
	public void delete(int id) {
		r2.deleteById(id);
}
}