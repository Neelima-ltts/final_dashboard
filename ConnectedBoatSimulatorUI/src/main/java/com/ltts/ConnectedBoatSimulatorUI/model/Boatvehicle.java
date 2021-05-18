package com.ltts.ConnectedBoatSimulatorUI.model;

import java.util.ArrayList;
import java.util.List;



public class Boatvehicle {
   
	private String hullid;
	private String name;
 	private String model;
	private int enginerpm;
 	private double oilpressure;
 	private double oiltemperature;
 	private double enginetemperature;
 	private double engineruntime;
 	private double enginefuelrate;
 	private int idle;
 	private double speed;
    private String  timestamp;
    private  double oceandepth;
 	private String doorsensor;
 	private List<Boatengine> engineList = new ArrayList<Boatengine>();
 	
 	
	public Boatvehicle() {
		super();
	}

	public Boatvehicle(String hullid, String name, String model, int enginerpm, double oilpressure,
			double oiltemperature, double enginetemperature, double engineruntime, double enginefuelrate, int idle,
			double speed, String timestamp, double oceandepth, String doorsensor, List<Boatengine> engineList) {
		super();
		this.hullid = hullid;
		this.name = name;
		this.model = model;
		this.enginerpm = enginerpm;
		this.oilpressure = oilpressure;
		this.oiltemperature = oiltemperature;
		this.enginetemperature = enginetemperature;
		this.engineruntime = engineruntime;
		this.enginefuelrate = enginefuelrate;
		this.idle = idle;
		this.speed = speed;
		this.timestamp = timestamp;
		this.oceandepth = oceandepth;
		this.doorsensor = doorsensor;
		this.engineList = engineList;
	}


	public String getHullid() {
		return hullid;
	}

	public void setHullid(String hullid) {
		this.hullid = hullid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getEnginerpm() {
		return enginerpm;
	}

	public void setEnginerpm(int enginerpm) {
		this.enginerpm = enginerpm;
	}

	public double getOilpressure() {
		return oilpressure;
	}

	public void setOilpressure(double oilpressure) {
		this.oilpressure = oilpressure;
	}

	public double getOiltemperature() {
		return oiltemperature;
	}

	public void setOiltemperature(double oiltemperature) {
		this.oiltemperature = oiltemperature;
	}

	public double getEnginetemperature() {
		return enginetemperature;
	}

	public void setEnginetemperature(double enginetemperature) {
		this.enginetemperature = enginetemperature;
	}

	public double getEngineruntime() {
		return engineruntime;
	}

	public void setEngineruntime(double engineruntime) {
		this.engineruntime = engineruntime;
	}

	public double getEnginefuelrate() {
		return enginefuelrate;
	}

	public void setEnginefuelrate(double enginefuelrate) {
		this.enginefuelrate = enginefuelrate;
	}

	public int getIdle() {
		return idle;
	}

	public void setIdle(int idle) {
		this.idle = idle;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public double getOceandepth() {
		return oceandepth;
	}

	public void setOceandepth(double oceandepth) {
		this.oceandepth = oceandepth;
	}

	public String getDoorsensor() {
		return doorsensor;
	}

	public void setDoorsensor(String doorsensor) {
		this.doorsensor = doorsensor;
	}

	public List<Boatengine> getEngineList() {
		return engineList;
	}

	public void setEngineList(List<Boatengine> engineList) {
		this.engineList = engineList;
	}

	@Override
	public String toString() {
		return "Boatvehicle [hullid=" + hullid + ", name=" + name + ", model=" + model + ", enginerpm=" + enginerpm
				+ ", oilpressure=" + oilpressure + ", oiltemperature=" + oiltemperature + ", enginetemperature="
				+ enginetemperature + ", engineruntime=" + engineruntime + ", enginefuelrate=" + enginefuelrate
				+ ", idle=" + idle + ", speed=" + speed + ", timestamp=" + timestamp + ", oceandepth=" + oceandepth
				+ ", doorsensor=" + doorsensor + ", engineList=" + engineList + "]";
	}

	
 	
}
