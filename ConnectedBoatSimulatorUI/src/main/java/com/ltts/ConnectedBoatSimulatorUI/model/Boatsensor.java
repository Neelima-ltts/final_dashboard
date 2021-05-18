package com.ltts.ConnectedBoatSimulatorUI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Boatsensor {
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	 	private int sensorid;
		private String hullid;
	 	private  double oceandepth;
	 	private String doorsensor;
	 	private String timestamp;
	 	
	 	public Boatsensor() {
			super();
		}

		public Boatsensor(int sensorid, String hullid, double oceandepth, String doorsensor, String timestamp) {
			super();
			this.sensorid = sensorid;
			this.hullid = hullid;
			this.oceandepth = oceandepth;
			this.doorsensor = doorsensor;
			this.timestamp = timestamp;
		}

		public int getSensorid() {
			return sensorid;
		}

		public void setSensorid(int sensorid) {
			this.sensorid = sensorid;
		}

		public String getHullid() {
			return hullid;
		}

		public void setHullid(String hullid) {
			this.hullid = hullid;
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

		public String getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		@Override
		public String toString() {
			return "Boatsensor [sensorid=" + sensorid + ", hullid=" + hullid + ", oceandepth=" + oceandepth
					+ ", doorsensor=" + doorsensor + ", timestamp=" + timestamp + "]";
		}
	 	
}

		