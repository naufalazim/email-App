package emailApp;

public class EmailApp {

	
	public static void main(String[] args) {
		// run app:
		System.out.println("SELAMAAT DATANG KE EMAIL Generator App");
		Email email = new Email("Naufal", "Azim");
		
		email.setAlternateEmail("nxfal.com");
		
		//return email:
		System.out.println(email.getAlternateEmail());
		
	}
}
