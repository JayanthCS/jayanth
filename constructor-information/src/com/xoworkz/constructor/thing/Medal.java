package com.xoworkz.constructor.thing;

public class Medal {

	
	public String type1; //metal
	public String type2; //glass
	public String type3; // acrylic
	public String size1;
	public String size2;
	public String size3;
	public String type4;//gold
	public String type5;//siver
	public String type6;//bronze
	public String type7;//lead
	public String usedMetal1;//nickel
	public String usedMetal2;//pewter
	public String usedMetal3;//bronze
	public String usedMetal4;//stainless steel
	

	public Medal(String t1,String t2,String t3,String s1,String s2,String s3,String t4,String t5,String t6 , String t7 ,String m1,String m2,String m3, String m4) {
		
		type1 = t1;
		type2 = t2;
		type3 = t3;
		size1 = s1;
		size2 = s2;
		size3 = s3;
		type4 = t4;
		type5 = t5;
		type6 = t6;
		type7 = t7;
		usedMetal1 = m1;
		usedMetal2 = m2 ;
		usedMetal3 = m3;
		usedMetal4 = m3;
		
	}		
	
	public void display() {
		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
		System.out.println(size1);
		System.out.println(size2);
		System.out.println(size3);
		System.out.println(type4);
		System.out.println(type5);
		System.out.println(type6);
		System.out.println(type7);
		System.out.println(usedMetal1);
		System.out.println(usedMetal2);
		System.out.println(usedMetal3);
		System.out.println(usedMetal4);
	}
}
