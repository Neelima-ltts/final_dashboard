package com.ltts.ConnectedBoatSimulatorUI.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Boatevent {
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
		private int eventid;
	 	private String hullid;
	 	private int idle;
	 	private double speed;
	    private String timestamp;
	 	
	 	public Boatevent() {
			super();
		}

	 	
	 	
		public Boatevent(int eventid, String hullid, int idle, double speed, String timestamp) {
			super();
			this.eventid = eventid;
			this.hullid = hullid;
			this.idle = idle;
			this.setSpeed(speed);
			this.timestamp = timestamp;
		}

		public int getEventid() {
			return eventid;
		}

		public void setEventid(int eventid) {
			this.eventid = eventid;
		}

		public String getHullid() {
			return hullid;
		}

		public void setHullid(String hullid) {
			this.hullid = hullid;
		}

		public int getIdle() {
			return idle;
		}

		public void setIdle(int idle) {
			this.idle = idle;
		}

		public String getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		public double getSpeed() {
			return speed;
		}

		public void setSpeed(double speed) {
			this.speed = speed;
		}



		@Override
		public String toString() {
			return "Boatevent [eventid=" + eventid + ", hullid=" + hullid + ", idle=" + idle + ", speed=" + speed
					+ ", timestamp=" + timestamp + "]";
		}

		
}