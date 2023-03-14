package com.xworkz.project.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class TravelDTO implements Serializable {

	private String destination;
	private int noOfPeoples;
	private double cost;
	private LocalDate when;
	
	public TravelDTO() {
		System.out.println("No-arg constructor");
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNoOfPeoples() {
		return noOfPeoples;
	}

	public void setNoOfPeoples(int noOfPeoples) {
		this.noOfPeoples = noOfPeoples;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public LocalDate getWhen() {
		return when;
	}

	@Override
	public String toString() {
		return "TravelDTO [destination=" + destination + ", noOfPeoples=" + noOfPeoples + ", cost=" + cost + ", when="
				+ when + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, destination, noOfPeoples, when);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof TravelDTO)) {
			return false;
		}
		TravelDTO other = (TravelDTO) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost)
				&& Objects.equals(destination, other.destination) && noOfPeoples == other.noOfPeoples
				&& Objects.equals(when, other.when);
	}

	public void setWhen(LocalDate when) {
		this.when = when;
	}

}
