package com.xworkz.interface3.implementer;

public abstract class AbstractInfo {

	private String createdBy = "jay";
	private String updatedBy = "dev";

	public AbstractInfo() {
		System.out.println("no-arg constructor");
	}

	public AbstractInfo(String createdBy, String updateBy) {
		this.createdBy = createdBy;
		this.updatedBy = updateBy;
	}

	@Override
	public String toString() {
		return "created by:" + createdBy + "   " + "updated By:" + updatedBy;
	}
}
