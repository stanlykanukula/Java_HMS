package Hms;

public class Patient extends Person {
	String disease;
	
	@Override
	 void details() {
		super.details();
		System.out.println("Patient disease :"+ disease);
	}
}
