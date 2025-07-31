package Hms;

public class Doctor extends Person {
	String specialization;
	
	@Override
	void details() {
		super.details();
		System.out.println("Doctor Specialization :" +specialization);
	}
}
