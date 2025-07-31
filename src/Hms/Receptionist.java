package Hms;

public class Receptionist extends Person{
	String shift;
	
	@Override
	 void details() {
		super.details();
		System.out.println("Reciptionist Shift :"+shift);
	}
}
