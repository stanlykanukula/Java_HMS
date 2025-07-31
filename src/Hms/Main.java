package Hms;

public class Main {

	public static void main(String[] args) {
		 Person obj1=new Doctor();
		 Person obj2=new Patient();
		 Person obj3=new Receptionist();
		 Person obj4=new Nurse();
		 
		Doctor d=(Doctor)obj1;
		Patient p=(Patient)obj2;
		Receptionist r=(Receptionist)obj3;
		Nurse n=(Nurse)obj4;
		
		d.specialization= "Neuro";
		p.disease="Braintumor";
		r.shift="night";
		n.qualificaton="nursing";

		 d.setName("Dr. Alekhya");     // setting base class field
	     d.setAge(33);
	     d.setGender("Female");
	     d.details(); 
	     System.out.println("----------------------------------");
	     
	     // subclass field
	        p.setName("Ravi");       // setting base class field
	        p.setAge(60);
	        p.setGender("Male");
	        p.details();
	        System.out.println("----------------------------------");
	        
	            // subclass field
	        r.setName("Mamatha");     // setting base class field
	        r.setAge(32);
	        r.setGender("Female");
	        r.details();
	        System.out.println("----------------------------------");
		
	     n.setName("Ramu");                // setting base class field
	        n.setAge(29);
	        n.setGender("Male");
	        n.details(); // Calls overridden method in Nurse class
	        System.out.println("----------------------------------");
	        

	}

} 