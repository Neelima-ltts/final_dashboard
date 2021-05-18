package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatengine;
import com.ltts.ConnectedBoatSimulatorUI.model.Boatevent;
import com.ltts.ConnectedBoatSimulatorUI.model.Boatlocation;
import com.ltts.ConnectedBoatSimulatorUI.model.Boatlog;
import com.ltts.ConnectedBoatSimulatorUI.model.Boatsensor;
import com.ltts.ConnectedBoatSimulatorUI.model.Boatvehicle;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatengineService;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatessentialsService;
import com.ltts.ConnectedBoatSimulatorUI.service.BoateventService;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatlocationService;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatlogService;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatsensorService;

@RestController
public class BoatVehicleController {
	
	@Autowired
	private BoatessentialsService serviceEssentials;
	@Autowired
	private BoatlocationService serviceLocation;
	@Autowired
	private BoateventService serviceEvent;
	@Autowired
	private BoatengineService serviceEngine;
	@Autowired
	private BoatlogService serviceLog;
	@Autowired
	private BoatsensorService serviceSensor;
	
	
	@GetMapping("/boatvehicle/{hullid}")
	public Boatvehicle getVehicleDetail(@PathVariable("hullid") String hullid ) {
		//List<Boatevent> eventList = serviceEvent.getAllBoatevent();
		Boatevent be = serviceEvent.get(Integer.parseInt(hullid));
		List<Boatengine> engineList = serviceEngine.getAllBoatengine();
		List<Boatlog> logList = serviceLog.getAllBoatlog();
		List<Boatsensor> sensorList = serviceSensor.getAllBoatsensor();
		Boatvehicle vehicle = new Boatvehicle();
		//Boatevent event = new Boatevent();
		Boatlog log = new Boatlog();
		Boatsensor sensor = new Boatsensor();
		Boatengine engine = new Boatengine();
		//event = eventList.get(0);
		log = logList.get(0);
		sensor = sensorList.get(0);
		engine = engineList.get(0);
		vehicle.setHullid(be.getHullid());
		vehicle.setName(log.getName());
		vehicle.setModel(log.getModel());
		vehicle.setEnginerpm(engine.getEnginerpm());
		vehicle.setOilpressure(engine.getOilpressure());
		vehicle.setOiltemperature(engine.getOiltemperature());
		vehicle.setEnginetemperature(engine.getEnginetemperature());
		vehicle.setEngineruntime(engine.getEngineruntime());
		vehicle.setEnginefuelrate(engine.getEnginefuelrate());
		vehicle.setEngineList(engineList);
		vehicle.setIdle(be.getIdle());
		vehicle.setSpeed(be.getSpeed());
		vehicle.setTimestamp(be.getTimestamp());
		vehicle.setOceandepth(sensor.getOceandepth());
		vehicle.setDoorsensor(sensor.getDoorsensor());
		return vehicle;
	}
	
	@GetMapping("/location/{hullId}")
	public Boatlocation getCurrentLocationDetail(@PathVariable("hullId") String hullId) {
		List<Boatlocation> li = serviceLocation.getAllBoatlocation();
		Boatlocation m=li.get(li.size()-1);
		//System.out.println(m);
		Boatlocation currentLocation= serviceLocation.getCurrentLocation(m);
		return currentLocation;
	}
}
