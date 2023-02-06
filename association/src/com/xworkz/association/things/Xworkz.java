package com.xworkz.association.things;

public class Xworkz {

	public String founder;
	public String totalTrainees;
	public boolean projector;
	public HumanResourse hr = new HumanResourse();
	public Trainees tr = new Trainees();
	public WaterBottle wb = new WaterBottle();
	public Battery bt = new Battery();
	public Chair ch = new Chair();
	public Rooms ro = new Rooms();
	public Projector pr = new Projector();
	public CarromBoard cb = new CarromBoard();
	public CricketBat cr = new CricketBat();
	public LapTops lp = new LapTops();
	public Fann fn = new Fann();

	public void initialisation(String founder, String totalTrainees, boolean projector) {

		this.founder = founder;
		this.totalTrainees = totalTrainees;
		this.projector = projector;

	}

	public void display() {

		System.out.println("Founder is :" + founder);
		System.out.println("Total trainees in xworkz :" + totalTrainees);
		System.out.println("is projector in xworkz :" + projector);
		this.hr.show();
		this.tr.show();
		this.wb.show();
		this.bt.show();
		this.ch.show();
		this.ro.display();
		this.pr.show();
		this.cb.show();
		this.cr.show();
		this.lp.show();
		this.fn.show();
	}
}
