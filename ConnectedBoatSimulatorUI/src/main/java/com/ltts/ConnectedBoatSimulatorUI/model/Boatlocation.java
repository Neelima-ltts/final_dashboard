package com.ltts.ConnectedBoatSimulatorUI.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Boatlocation {
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	 	private int locationid;
		private String hullid;
		private double latitude;
	 	private  double longitude;
	 	private int altitude;
	 	private double heading;
	    private String  timestamp;
	 	
	 	public Boatlocation() {
			super();
		}

		public Boatlocation(int locationid, String hullid, double latitude, double longitude, int altitude,
				double heading, String timestamp) {
			super();
			this.locationid = locationid;
			this.hullid = hullid;
			this.latitude = latitude;
			this.longitude = longitude;
			this.altitude = altitude;
			this.heading = heading;
			this.timestamp = timestamp;
		}

		public int getLocationid() {
			return locationid;
		}

		public void setLocationid(int locationid) {
			this.locationid = locationid;
		}

		public String getHullid() {
			return hullid;
		}

		public void setHullid(String hullid) {
			this.hullid = hullid;
		}

		public double getLatitude() {
			return latitude;
		}

		public void setLatitude(double latitude) {
			this.latitude = latitude;
		}

		public double getLongitude() {
			return longitude;
		}

		public void setLongitude(double longitude) {
			this.longitude = longitude;
		}

		public int getAltitude() {
			return altitude;
		}

		public void setAltitude(int altitude) {
			this.altitude = altitude;
		}

		public double getHeading() {
			return heading;
		}

		public void setHeading(double heading) {
			this.heading = heading;
		}

		public String getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		@Override
		public String toString() {
			return "Boatlocation [locationid=" + locationid + ", hullid=" + hullid + ", latitude=" + latitude
					+ ", longitude=" + longitude + ", altitude=" + altitude + ", heading=" + heading + ", timestamp="
					+ timestamp + "]";
		}
	 	
}

	