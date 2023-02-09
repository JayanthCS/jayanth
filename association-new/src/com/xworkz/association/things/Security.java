package com.xworkz.association.things;

public class Security {

	public String deptName = "HR";
	public int totalStaff;
	public String headStaff;
	public Company company;

	public Security(int totalStaff, String headStaff) {
		this.totalStaff = totalStaff;
		this.headStaff = headStaff;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void display() {
		System.out.println("Security details.....");
		System.out.println(this.deptName);
		System.out.println(this.totalStaff);
		System.out.println(this.headStaff);
		if (this.company != null) {
			this.company.display();
		} else {
			System.err.println("this.company is null.......");
		}
	}
}
