package com.xworkz.inheritance1.boot;

import com.xworkz.inheritance1.thing.ButterRoti;
import com.xworkz.inheritance1.thing.JowarRoti;
import com.xworkz.inheritance1.thing.Kulcha;
import com.xworkz.inheritance1.thing.Naan;
import com.xworkz.inheritance1.thing.OnionMasalaRagiRoti;
import com.xworkz.inheritance1.thing.OnionRagiRoti;
import com.xworkz.inheritance1.thing.RagiRoti;
import com.xworkz.inheritance1.thing.Roti;

public class RotiRunner {

	public static void main(String[] args) {

		Roti roti = new Roti();
		String r = roti.getShape();
		System.out.println(r);

		Roti roti1 = new RagiRoti();
		roti1.getShape();
		RagiRoti ra = (RagiRoti) roti1;
		int r1 = ra.getCalories();
		System.out.println(r1);

		RagiRoti roti2 = new RagiRoti();
		int e = roti2.getCalories();
		String f = roti2.getShape();
		System.out.println(e);
		System.out.println(f);

		OnionRagiRoti r2 = new OnionRagiRoti();
		int g1 = r2.getWeight();
		int e1 = r2.getCalories();
		String f1 = r2.getShape();
		System.out.println(g1 + "  " + e1 + "   " + f1);

		RagiRoti roti3 = new OnionRagiRoti();
		int e2 = roti3.getCalories();
		String f2 = roti3.getShape();
		OnionRagiRoti on1 = (OnionRagiRoti) r2;
		int g2 = on1.getWeight();
		System.out.println(e2 + f2 + g2);

		Roti roti4 = new OnionRagiRoti();
		String f3 = roti4.getShape();
		OnionRagiRoti on2 = (OnionRagiRoti) r2;
		int g3 = on2.getWeight();
		RagiRoti on3 = (RagiRoti) roti3;
		int e3 = on3.getCalories();
		System.out.println(e3 + f3 + g3);

		OnionMasalaRagiRoti omrr = new OnionMasalaRagiRoti();
		double on = omrr.getThickness();
		System.out.println("thikness " + on);
		int g4 = omrr.getWeight();
		System.out.println("Weight " + g4);
		int e4 = omrr.getCalories();
		System.out.println("calories " + e4);
		String f4 = omrr.getShape();
		System.out.println("Shape is " + f4);

		OnionRagiRoti omrr1 = new OnionMasalaRagiRoti();
		int g5 = omrr1.getWeight();
		System.out.println("Weight " + g5);
		int e5 = omrr1.getCalories();
		System.out.println("calories " + e5);
		String f5 = omrr1.getShape();
		System.out.println("Shape is " + f5);
		if (omrr1 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti or = (OnionMasalaRagiRoti) omrr1;
			double or1 = or.getThickness();
			System.out.println(or1);
		} else {
			System.err.println("or1 is not a OnionMasalaRagiRoti");
		}

		RagiRoti rr = new OnionMasalaRagiRoti();
		String f6 = rr.getShape();
		System.out.println("Shape is " + f6);
		int e6 = rr.getCalories();
		System.out.println("calories " + e6);
		if (rr instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti or2 = (OnionMasalaRagiRoti) rr;
			int rt = or2.getWeight();
			System.out.println("Weight " + rt);
		} else {
			System.err.println("rt is not a OnionMasalaRagiRoti");
		}
		if (rr instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti or3 = (OnionMasalaRagiRoti) rr;
			double rt1 = or3.getThickness();
			System.out.println("thickness " + rt1);
		} else {
			System.err.println("rt1 is not a OnionMasalaRagiRoti");
		}

		Roti ro = new OnionMasalaRagiRoti();
		String f7 = ro.getShape();
		System.out.println("Shape is " + f7);
		if (ro instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti om = (OnionMasalaRagiRoti) ro;
			int e7 = om.getCalories();
			System.out.println("calories " + e7);
		} else {
			System.err.println("e7 is not a OnionMasalaRagiRoti");
		}
		if (ro instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti om1 = (OnionMasalaRagiRoti) ro;
			int g7 = om1.getWeight();
			System.out.println("Weight is " + g7);
		} else {
			System.err.println("g7 is not a OnionMasalaRagiRoti");
		}
		if (ro instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti om2 = (OnionMasalaRagiRoti) ro;
			double rt2 = om2.getThickness();
			System.out.println("thickness " + rt2);
		} else {
			System.err.println("rt2 is not a OnionMasalaRagiRoti");
		}

		Kulcha kulcha = new Kulcha();
		String ku = kulcha.getTaste();
		String ku2 = kulcha.getColour();
		int ku3 = kulcha.getLength();
		String ku4 = kulcha.getShape();
		System.out.println(ku + ku2 + ku3 + ku4);

		Naan naan = new Kulcha();
		String ku5 = kulcha.getColour();
		int ku6 = kulcha.getLength();
		String ku7 = kulcha.getShape();
		Kulcha k = (Kulcha) naan;
		String j = k.getShape();
		System.out.println(ku5 + ku6 + ku7 + j);

		ButterRoti br = new Kulcha();
		int ku8 = kulcha.getLength();
		String ku9 = kulcha.getShape();
		Kulcha j1 = (Kulcha) br;
		String ku11 = j1.getTaste();
		Kulcha j2 = (Kulcha) br;
		String ku12 = j2.getColour();
		System.out.println(ku8 + ku9 + ku11 + ku12);

		Roti ri = new Kulcha();
		String i = kulcha.getShape();
		Kulcha l = (Kulcha) ri;
		String l1 = l.getTaste();
		Kulcha i2 = (Kulcha) ri;
		String l2 = i2.getColour();
		Kulcha i3 = (Kulcha) ri;
		int l3 = i3.getLength();
		System.out.println(i + l1 + l2 + l3);

		Naan na = new Naan();
		String h = na.getShape();
		int h1 = na.getLength();
		String h3 = na.getColour();
		System.out.println(h + h1 + h3);

		ButterRoti na1 = new Naan();
		String b = na1.getShape();
		int b1 = na1.getLength();
		Naan n = (Naan) na1;
		String n1 = n.getColour();
		System.out.println(b + b1 + n1);

		Roti t = new Naan();
		String a = t.getShape();
		Naan a1 = (Naan) t;
		int a2 = a1.getLength();
		Naan a3 = (Naan) t;
		String a4 = a3.getColour();
		System.out.println(a + a2 + a4);

		ButterRoti butter = new ButterRoti();
		String d = butter.getShape();
		int d1 = butter.getLength();
		System.out.println(d + d1);

		Roti butter1 = new ButterRoti();
		String d2 = butter1.getShape();
		ButterRoti ri1 = (ButterRoti) butter1;
		int d3 = ri1.getLength();
		System.out.println(d2 + d3);

		JowarRoti jr = new JowarRoti();
		String c1 = jr.getShape();
		int c2 = jr.getLength();
		double c3 = jr.getPrice();
		System.out.println(c1 + c2 + c3);

		ButterRoti jr1 = new JowarRoti();
		String c4 = jr1.getShape();
		int c5 = jr1.getLength();
		if (jr1 instanceof Naan) {
			JowarRoti jr2 = (JowarRoti) jr1;
			double c7 = jr2.getPrice();
			System.out.println(c4 + c5 + c7);
		} else {
			System.err.println("exception");
		}

		Roti rt = new JowarRoti();
		String z = rt.getShape();
		JowarRoti z1 = (JowarRoti) rt;
		int z2 = z1.getLength();
		if(rt instanceof RagiRoti) {
		JowarRoti z3 = (JowarRoti) rt;
		double z4 = z3.getPrice();
		System.out.println(z + z2 + z4);
		}
		else {
			System.err.println("Exception");
		}
		
	}
}
