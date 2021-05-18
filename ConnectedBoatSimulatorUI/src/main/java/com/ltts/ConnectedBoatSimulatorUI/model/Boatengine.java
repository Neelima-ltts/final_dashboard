package com.ltts.ConnectedBoatSimulatorUI.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Boatengine {
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
		private String hullid;
	 	private int engineid;
	 	private int enginerpm;
	 	private double oilpressure;
	 	private double oiltemperature;
	 	private double enginetemperature;
	 	private double engineruntime;
	 	private double enginefuelrate;

	 	public Boatengine() {
			super();
			
		}

		public Boatengine(String hullid, int engineid, int enginerpm, double oilpressure, double oiltemperature,
				double enginetemperature, double engineruntime, double enginefuelrate) {
			super();
			this.hullid = hullid;
			this.engineid = engineid;
			this.enginerpm = enginerpm;
			this.oilpressure = oilpressure;
			this.oiltemperature = oiltemperature;
			this.enginetemperature = enginetemperature;
			this.engineruntime = engineruntime;
			this.enginefuelrate = enginefuelrate;
		}

		public String getHullid() {
			return hullid;
		}

		public void setHullid(String hullid) {
			this.hullid = hullid;
		}

		public int getEngineid() {
			return engineid;
		}

		public void setEngineid(int engineid) {
			this.engineid = engineid;
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

		@Override
		public String toString() {
			return "Boatengine [hullid=" + hullid + ", engineid=" + engineid + ", enginerpm=" + enginerpm
					+ ", oilpressure=" + oilpressure + ", oiltemperature=" + oiltemperature + ", enginetemperature="
					+ enginetemperature + ", engineruntime=" + engineruntime + ", enginefuelrate=" + enginefuelrate
					+ "]";
		}
	 	
	 	
}
	 	