package com.xworkz.spring1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan("com.xworkz.spring1")

public class Configuration {

	public Configuration() {
		System.out.println("No-arg constructor in configuration");
	}

	@Bean
	public String name() {
		System.out.println("registerd name");
		return "Jayanth";
	}

	@Bean
	public String fan() {
		System.out.println("registerd fan");
		return "Bajaj";
	}

	@Bean
	public String hospital() {
		System.out.println("registerd hospital");
		return "ESICS";
	}

	@Bean
	public String college() {
		System.out.println("registerd college");
		return "Ait";
	}

	@Bean
	public String place() {
		System.out.println("registerd place");
		return "CKM";
	}

	@Bean
	public String street() {
		System.out.println("registerd street");
		return "shankar nagar";
	}

	@Bean
	public String bag() {
		System.out.println("registerd bag");
		return "HP";
	}

	@Bean
	public String pant() {
		System.out.println("registerd pant");
		return "Roadster";
	}

	@Bean
	public String shoe() {
		System.out.println("registerd shoe");
		return "puma";
	}

	@Bean
	public String wiskey() {
		System.out.println("registerd whiskey");
		return "Mc Whiskey";
	}

	@Bean
	public String waterBottle() {
		System.out.println("registerd waterBottle");
		return "Bislary";
	}

	@Bean
	public String book() {
		System.out.println("registerd book");
		return "polity";
	}

	@Bean
	public String phone() {
		System.out.println("registerd phone");
		return "mi";
	}

	@Bean
	public int score() {
		System.out.println("created score");
		return 50;
	}

	@Bean
	public int wheel() {
		System.out.println("created wheel");
		return 4;
	}

	@Bean
	public int temp() {
		System.out.println("created temp");
		return 34;
	}

	@Bean
	public int shoes() {
		System.out.println("created shoes");
		return 2;
	}

	@Bean
	public int doors() {
		System.out.println("created doors");
		return 4;
	}

	@Bean
	public int windows() {
		System.out.println("created windows");
		return 7;
	}

	@Bean
	public int waterBottels() {
		System.out.println("created waterBottle");
		return 2;
	}

	@Bean
	public int phone1() {
		System.out.println("created phone1");
		return 1;
	}

	@Bean
	public int compartment() {
		System.out.println("created compartments");
		return 15;
	}

	@Bean
	public double salary1() {
		System.out.println("created salary1");
		return 20000;
	}

	@Bean
	public double fanPrice() {
		System.out.println("created fanPrice");
		return 12000;
	}

	@Bean
	public double laptopPrice() {
		System.out.println("created laptopPrice");
		return 45000;
	}

	@Bean
	public double length() {
		System.out.println("created length");
		return 20;
	}

	@Bean
	public double km() {
		System.out.println("created km");
		return 10;
	}

	@Bean
	public double distance() {
		System.out.println("created distance");
		return 2;
	}

	@Bean
	public double height() {
		System.out.println("created height");
		return 6.2;
	}

	@Bean
	public double weight() {
		System.out.println("created weight");
		return 70;
	}

	@Bean
	public long jayNo() {
		System.out.println("created jayNo");
		return 8861174016L;
	}

	@Bean
	public long darshanNo() {
		System.out.println("created darshanNo");
		return 6364210803L;
	}

	@Bean
	public long pavanNo() {
		System.out.println("created pavanNo");
		return 9880425803L;
	}

	@Bean
	public long dinuNo() {
		System.out.println("created dinuNo");
		return 6374924238L;
	}

	@Bean
	public long basuNo() {
		System.out.println("created basuNo");
		return 8122000038L;
	}

	@Bean
	public long kavanNo() {
		System.out.println("created kavanNo");
		return 9845349521L;
	}

	@Bean
	public long anneshNo() {
		System.out.println("created anneshNo");
		return 9449781342L;
	}

	@Bean
	public long rikiNo() {
		System.out.println("created rikiNo");
		return 9861374016L;
	}

	@Bean
	public long shivuNo() {
		System.out.println("created shivuNo");
		return 9961174016L;
	}

	@Bean
	public char section() {
		System.out.println("created section");
		return 'A';
	}

	@Bean
	public char ward() {
		System.out.println("created ward");
		return 'G';
	}

	@Bean
	public char sessions() {
		System.out.println("created sessions");
		return 'c';
	}

	@Bean
	public char bloodGroup() {
		System.out.println("created bloodGroup");
		return 'o';
	}

	@Bean
	public char chargerType() {
		System.out.println("created chargerType");
		return 'c';
	}

	@Bean
	public char section1() {
		System.out.println("created section1");
		return 'd';
	}

	@Bean
	public char section2() {
		System.out.println("created section2");
		return 'e';
	}

	@Bean
	public char section3() {
		System.out.println("created section3");
		return 'g';
	}

	@Bean
	public char section4() {
		System.out.println("created section4");
		return 'w';
	}

	@Bean
	public boolean earthRound() {
		System.out.println("created earthRound");
		return true;
	}

	@Bean
	public boolean pavanAlive() {
		System.out.println("created pavanAlive");
		return true;
	}

	@Bean
	public boolean laptopOpen() {
		System.out.println("created laptopOpen");
		return false;
	}

	@Bean
	public boolean fanRunning() {
		System.out.println("created fanRunning");
		return true;
	}

	@Bean
	public boolean rcbWon() {
		System.out.println("created rcbWon");
		return true;
	}

	@Bean
	public boolean talking() {
		System.out.println("created talking");
		return true;
	}

	@Bean
	public boolean sleep() {
		System.out.println("created sleep");
		return true;
	}

	@Bean
	public boolean sit() {
		System.out.println("created sit");
		return true;
	}

	@Bean
	public boolean cloths() {
		System.out.println("created cloths");
		return false;
	}

	@Bean
	public float busCharge() {
		System.out.println("created bus charge");
		return 20F;
	}

	@Bean
	public float currentUsed() {
		System.out.println("created bus currentused");
		return 40.33F;
	}

	@Bean
	public float price() {
		System.out.println("created bus price");
		return 80;
	}

	@Bean
	public float busCharge1() {
		System.out.println("created bus charge1");
		return 45;
	}

	@Bean
	public float busCharge2() {
		System.out.println("created bus charge2");
		return 44;
	}

	@Bean
	public float busCharge3() {
		System.out.println("created bus charge3");
		return 59;
	}

	@Bean
	public float busCharge4() {
		System.out.println("created bus charge4");
		return 23.56F;
	}

	@Bean
	public float busCharge5() {
		System.out.println("created bus charge5");
		return 236.5F;
	}

	@Bean
	public int score1() {
		System.out.println("created score1");
		return 50;
	}

	@Bean
	public int wheel2() {
		System.out.println("created wheel2");
		return 4;
	}

	@Bean
	public int temp3() {
		System.out.println("created temp3");
		return 34;
	}

	@Bean
	public int shoes4() {
		System.out.println("created shoes4");
		return 2;
	}

	@Bean
	public int doors5() {
		System.out.println("created doors5");
		return 4;
	}

	@Bean
	public int windows6() {
		System.out.println("created windows6");
		return 7;
	}

	@Bean
	public int waterBottels7() {
		System.out.println("created waterBottle7");
		return 2;
	}

	@Bean
	public int phone18() {
		System.out.println("created phone18");
		return 1;
	}

	@Bean
	public int compartment9() {
		System.out.println("created compartments9");
		return 15;
	}
	
	

}
