package com.nacre.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Blood {

	@Value("1254.3")
	Float plasma;
	
	@Value("5489.69")
	Float rbc;
	
	@Value("444.6")
	Float platelets;
	
	public Float getPlasma() {
		return plasma;
	}
	public void setPlasma(Float plasma) {
		this.plasma = plasma;
	}
	public Float getRbc() {
		return rbc;
	}
	public void setRbc(Float rbc) {
		this.rbc = rbc;
	}
	public Float getPlatelets() {
		return platelets;
	}
	public void setPlatelets(Float platelets) {
		this.platelets = platelets;
	}
	@Override
	public String toString() {
		return "Blood [plasma=" + plasma + ", rbc=" + rbc + ", platelets=" + platelets + "]";
	}

	
	
	
}
