package com.nacre.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="hos")
public class BloodBank {

	@Value("Maathoshri")
	String hospitalName;
	
	@Value("HYD")
	String location;
	@Autowired
	Blood bloodDetails;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Blood getBloodDetails() {
		return bloodDetails;
	}

	public void setBloodDetails(Blood bloodDetails) {
		this.bloodDetails = bloodDetails;
	}

	@Override
	public String toString() {
		return "BloodBank [hospitalName=" + hospitalName + ", location=" + location + ", bloodDetails=" + bloodDetails
				+ "]";
	}

	
	
	
}
