package com.xworkz.spring.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

//import lombok.ToString;

@ToString
@Component("saloon")
public class Saloon {

	private String name;
	private String ownerName;
	private String type;
	private String location;
	private int noOfBarbers;

	public Saloon(@Value("Raju Saloon") String name, @Value("Raju") String ownerName, @Value("Mens Saloon") String type,
			@Value("Cheeranahalli") String location, @Value("2") int noOfBarbers) {

		this.name = name;
		this.ownerName = ownerName;
		this.type = type;
		this.location = location;
		this.noOfBarbers = noOfBarbers;
	}

//	@Override
//	public String toString() {
//		return "Saloon [name=" + name + ", ownerName=" + ownerName + ", type=" + type + ", location=" + location
//				+ ", noOfBarbers=" + noOfBarbers + "]";
//	}
//	
    

}
