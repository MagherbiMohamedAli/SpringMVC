package tn.essat.model;

import org.springframework.stereotype.Repository;

@Repository
public class ClassA implements IGestion {
	public String getMessage() {
		return "C'est la classe A";
	}

}
