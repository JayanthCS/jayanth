package com.xworkz.association.things;

public class Rooms {

	public String room;
	public int noOfRooms;
	public boolean staffRoom;

	public void initialisation(String room, int noOfRooms, boolean staffRoom) {
		this.room = room;
		this.noOfRooms = noOfRooms;
		this.staffRoom = staffRoom;
	}

	public void display() {
		System.out.println("room is :" + room);
		System.out.println("noOfRooms are :" + noOfRooms);
		System.out.println("is staff room present :" + staffRoom);
	}
}
