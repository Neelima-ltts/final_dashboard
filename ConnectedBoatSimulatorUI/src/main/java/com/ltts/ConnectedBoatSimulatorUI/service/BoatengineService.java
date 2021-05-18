package com.ltts.ConnectedBoatSimulatorUI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ltts.ConnectedBoatSimulatorUI.repository.*;
import com.ltts.ConnectedBoatSimulatorUI.model.*;

@Service
public class BoatengineService {

	@Autowired
	private BoatengineRepository r;
	
	public List<Boatengine> getAllBoatengine(){
		return r.findAll();
	}
	public void save(Boatengine boat) {
		r.save(boat);
	}
	public Boatengine get(int id) {
		return r.findById(id).get();
	}
	public void delete(int id) {
		r.deleteById(id);
}
}