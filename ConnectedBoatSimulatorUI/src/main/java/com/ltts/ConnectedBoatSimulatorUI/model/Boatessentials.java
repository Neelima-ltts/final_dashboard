package com.ltts.ConnectedBoatSimulatorUI.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Boatessentials {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private String hullid;
	private String boatid;
	private int noofengine;
	private String status;
	
	public Boatessentials() {
		super();
	}

	public Boatessentials(String hullid, String boatid, int noofengine, String status) {
		super();
		this.hullid = hullid;
		this.boatid = boatid;
		this.noofengine = noofengine;
		this.status = status;
	}

	public String getHullid() {
		return hullid;
	}

	public void setHullid(String hullid) {
		this.hullid = hullid;
	}

	public String getBoatid() {
		return boatid;
	}

	public void setBoatid(String boatid) {
		this.boatid = boatid;
	}

	public int getNoofengine() {
		return noofengine;
	}

	public void setNoofengine(int noofengine) {
		this.noofengine = noofengine;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Boatessentials [hullid=" + hullid + ", boatid=" + boatid + ", noofengine=" + noofengine + ", status="
				+ status + "]";
	}

	
	
}

	
	
	