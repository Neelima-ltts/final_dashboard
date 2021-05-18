package com.ltts.ConnectedBoatSimulatorUI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Boatlog {
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	 	private String boatid;
	 	private String name;
	 	private String model;
	 	
	 	public Boatlog() {
			super();
		}

		public Boatlog(String boatid, String name, String model) {
			super();
			this.boatid = boatid;
			this.name = name;
			this.model = model;
		}

		public String getBoatid() {
			return boatid;
		}

		public void setBoatid(String boatid) {
			this.boatid = boatid;
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

		@Override
		public String toString() {
			return "Boatlog [boatid=" + boatid + ", name=" + name + ", model=" + model + "]";
		}
	 	
	 	
}
		
		