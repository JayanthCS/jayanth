package com.xworkz.object1.thing;

public class PoliceStation {

	private String location;
	private String siName;
	private int noOfPc;
	private int noOfSi;
	private int noKallas;
	private int noOfCells;
	private int noOfRooms;
	private int noOfSp;
	private int noOfPrisoners;
	private int noOfLadyStaffs;

	public PoliceStation(String location, String siName, int noOfPc, int noOfSi, int noKallas, int noOfCells,
			int noOfRooms, int noOfSp, int noOfPrisoners, int noOfLadyStaffs) {
		this.location = location;
		this.siName = siName;
		this.noOfPc = noOfPc;
		this.noOfSi = noOfSi;
		this.noKallas = noKallas;
		this.noOfCells = noOfCells;
		this.noOfRooms = noOfRooms;
		this.noOfSp = noOfSp;
		this.noOfPrisoners = noOfPrisoners;
		this.noOfLadyStaffs = noOfLadyStaffs;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running object in Police Station :" + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof PoliceStation) {
				System.out.println("Object is Police Station , so we can compare");
				PoliceStation casted = (PoliceStation) obj;
				PoliceStation ps = this;
				PoliceStation ps1 = casted;
				if (ps.location.equals(ps1.location) && ps.siName.equals(ps1.siName) && ps.noOfPc == ps1.noOfPc
						&& ps.noOfSi == ps1.noOfSi && ps.noKallas == ps1.noKallas && ps.noOfCells == ps1.noOfCells
						&& ps.noOfRooms == ps1.noOfRooms && ps.noOfSp == ps1.noOfSp
						&& ps.noOfPrisoners == ps1.noOfPrisoners && ps.noOfLadyStaffs == ps1.noOfLadyStaffs) {
					System.out.println("ps and ps1 are same");
					return true;

				} else {
					System.err.println("ps and ps1 are not same");
				}
			} else {
				System.err.println("Object is not PoliceStation ,so we can not compare");
			}
		} else {
			System.err.println("Object is null");
		}

		return super.equals(obj);
	}

	@Override
	public String toString() {

		return "location :" + this.location + "\n siName :" + this.siName + "\n noOfPc :" + this.noOfPc
				+ "\n noOfKallas :" + this.noKallas + "\n cells :" + this.noOfCells + "\n rooms :" + this.noOfRooms
				+ " \n noOfSp :" + this.noOfSp + "\n prisoners :" + this.noOfPrisoners + "\n staffs :"
				+ this.noOfLadyStaffs;
	}
}
