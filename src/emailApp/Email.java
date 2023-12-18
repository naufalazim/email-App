package emailApp;

import java.util.Scanner;

public class Email {
	
	//Project: Create a generate email app;
	
	//create variables:
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	
	//Constructor to receive the first name and last name;
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		
		System.out.println("Nama Email Anda:" + this.firstName + " " + this.lastName);
		
		//Call function department:
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
	}
	
	// Pertanyaan untuk department:
	private String setDepartment() {
		System.out.println("Masukkan Department Anda\n1 IT\n2 HR\n3 Akaun\n0 tiada\nMasuk Code Department: ");
		Scanner in = new Scanner(System.in);
		
		int depC = in.nextInt();
		
		//Pilihan user:
		if(depC == 1) { return "IT";}
		else if (depC == 2) {return "HR";}
		else if (depC == 3) {return "Akaun";}
		else {return " ";}
	}
	
	// Generate random password;
	
	// Set the mailbox capacity;
	
	// Set the alternate email;
	
	// Change the password;
	
	
}
