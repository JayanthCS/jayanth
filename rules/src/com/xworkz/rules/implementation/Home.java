package com.xworkz.rules.implementation;

import com.xworkz.rules.thing.FamilyRules;

public class Home implements FamilyRules {

	@Override
	public boolean dontTalk() {
		return false;
	}

	@Override
	public boolean dontSit() {
		return false;
	}

	@Override
	public String goingOut() {
		return "dont go out at nyt";
	}

	@Override
	public String havingParty() {
		return "No driniking party ";
	}

	@Override
	public boolean giveRespect() {
		return false;
	}

	@Override
	public int pocketMoney() {
		return 0;
	}

	@Override
	public boolean usePhone() {
		return false;
	}

	@Override
	public String interruption() {
		return "Dont talk while elders talking";
	}

	@Override
	public boolean afterNoonSleep() {
		return false;
	}

	@Override
	public String food() {
		return "No outside food";
	}

	@Override
	public boolean inTime() {
		return false;
	}

	@Override
	public boolean loudVoice() {
		return false;
	}

	@Override
	public String water() {
		return "Water neene tarbeku";
	}

	@Override
	public boolean dress() {
		return false;
	}

	@Override
	public boolean claen() {
		return false;
	}

	@Override
	public boolean noSmoke() {
		return false;
	}

	@Override
	public String toString() {
		return "House [dontTalk(): " + dontTalk() + " dontSit():" + dontSit() + "goingOut():" + goingOut()
				+ "havingParty():" + havingParty() + "giveRespect():" + giveRespect() + "pocketMoney():" + pocketMoney()
				+ "usePhone(): " + usePhone() + "interruption():" + interruption() + "afterNoonSleep(): "
				+ afterNoonSleep() + "food(): " + food() + "inTime(): " + inTime() + "loudVoice(): " + loudVoice()
				+ " water(): " + water() + "dress(): " + dress() + "claen(): " + claen() + "noSmoke(): " + noSmoke()
				+ "]";
	}

	@Override
	public int hashCode() {
		return 300;
	}
}
