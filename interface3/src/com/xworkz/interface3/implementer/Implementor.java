package com.xworkz.interface3.implementer;

import com.xworkz.interface3.Developer;
import com.xworkz.interface3.DubaiVisaRule;
import com.xworkz.interface3.PassportRule;

public class Implementor extends AbstractInfo implements PassportRule, DubaiVisaRule, Developer {

	@Override
	public String followStandards() {
		return "Should follow standards";
	}

	@Override
	public boolean understandingConcepts() {
		return true;
	}

	@Override
	public int minAmount() {
		return 50000;
	}

	@Override
	public boolean stayingHotel() {
		return false;
	}

	@Override
	public int maxGoldLimit() {
		return 567;
	}

	@Override
	public String citizen() {
		return "peoples";
	}

	@Override
	public int criminalRecords() {
		return 0;
	}

	@Override
	public boolean jail() {
		return false;
	}

}
