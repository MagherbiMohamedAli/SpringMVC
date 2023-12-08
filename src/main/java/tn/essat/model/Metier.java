package tn.essat.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Metier {
	
	@Autowired
	IGestion gest;
	public String Message() {
		return gest.getMessage();
	}
	public Metier() {
	
	}
	public IGestion getGest() {
		return gest;
	}
	public void setGest(IGestion gest) {
		this.gest = gest;
	}
	
}
