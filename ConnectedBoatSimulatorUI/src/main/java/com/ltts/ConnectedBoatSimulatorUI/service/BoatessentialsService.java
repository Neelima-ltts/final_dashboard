package com.ltts.ConnectedBoatSimulatorUI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatvehicle;
import com.ltts.ConnectedBoatSimulatorUI.model.Boatessentials;
import com.ltts.ConnectedBoatSimulatorUI.repository.BoatessentialsRepository;


@Service
public class BoatessentialsService {

	@Autowired
	private BoatessentialsRepository r1;

	public List<Boatessentials> getAllBoatessentials(){
		return r1.findAll();
	}
	public void save(Boatessentials boat1) {
		r1.save(boat1);
	}
	public Boatessentials get(int id) {
		return r1.findById(id).get();
	}
	public void delete(int id) {
		r1.deleteById(id);
}
}