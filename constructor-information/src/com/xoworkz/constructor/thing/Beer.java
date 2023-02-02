package com.xoworkz.constructor.thing;

public class Beer {

	 public String brand;
	   public String name;
	   public String type;
	   public float alcoholContent;
	   public int servingSize;
	   public int calories;
	   public int carbohydrates;
	   public float protein;
	   public int fat;
	   public int sugar;
	   public int sodium;
	   public int potassium;
	   public int calcium;
	   public int iron;
	   public int vitaminA;
	   public int vitaminC;
	   public int vitaminB12;
	   public int vitaminD;
	   public int vitaminE;
	   public int vitaminK;
	   public int thiamin;
	   public int riboflavin;
	   public int niacin;
	   public int folate;
	   public int pantothenicAcid;
	   public int biotin;
	   public int phosphorus;
	   public int magnesium;
	
	   public Beer(String br,String na,String ty,float alc,int ser,int cal,int ca,float pr,int f,int s,int s1,int pm,int c,int i,int vA,int vC,int vB12,int vD,int vE,int v,int t,int r,int n,int fo,int pA,int b,int p,int m) {
		   brand=br;
		   name=na;
		   type=ty;
		   alcoholContent=alc;
		   servingSize=ser;
		   calories=cal;
		   carbohydrates=ca;
		   protein=pr;
		   fat=f;
		   sugar=s;
		   sodium=s1;
		   potassium=pm;
		   calcium=c;
		   iron=i;
		   vitaminA=vA;
		   vitaminC=vC;
		   vitaminB12=vB12;
		   vitaminD=vD;
		   vitaminE=vE;
		   vitaminK=v;
		   thiamin=t;
		   riboflavin=r;
		   niacin=n;
		   folate=fo;
		   pantothenicAcid=pA;
		   biotin=b;
		   phosphorus=p;
		   magnesium=m;   
	}
	   
	   


	public void display() {
		   System.out.println("For 100 ml of Beer");
		   System.out.println("_______________________");
		   System.out.println("Brand of Beer "+brand);
		   System.out.println("Name of Beer "+name);
		   System.out.println("Type of Beer "+type);
		   System.out.println("Alcohol Content of Beer "+alcoholContent);
		   System.out.println("Serving Size of Beer "+servingSize);
		   System.out.println("Calories of Beer "+calories);
		   System.out.println("Carbohydrates of Beer "+carbohydrates);
		   System.out.println("Protein of Beer "+protein);
		   System.out.println("Calcium of Beer "+calcium);
		   System.out.println("Iron of Beer "+iron);
		   System.out.println("Vitamin A of Beer "+vitaminA);
		   System.out.println("Vitamin C of Beer "+vitaminC);
		   System.out.println("Vitamin B12 of Beer "+vitaminB12);
		   System.out.println("Vitamin D of Beer "+vitaminD);
		   System.out.println("Vitamin E of Beer "+vitaminE);
		   System.out.println("Vitamin K of Beer "+vitaminK);
		   System.out.println("Thiamin of Beer "+thiamin+" mg");
		   System.out.println("Riboflavin of Beer "+riboflavin+" mg");
		   System.out.println("Niacin of Beer "+niacin+" mg");
		   System.out.println("Folate of Beer "+folate+" mg");
		   System.out.println("PantothenicAcid of Beer "+pantothenicAcid+" mg");
		   System.out.println("biotin of Beer "+biotin+" mg"); 
		   System.out.println("Phosphorus of Beer "+phosphorus+" mg");
		   System.out.println("Magnesium of Beer "+magnesium+" mg");
		   System.out.println("_______________________");
		     
	   }

}
