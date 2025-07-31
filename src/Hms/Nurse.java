package Hms;

public class Nurse extends Person{
	 String qualificaton;
	
	 @Override
	 void details() {
		 super.details();
		System.out.println("Nurse Qualification :"+ qualificaton);
	}
}
