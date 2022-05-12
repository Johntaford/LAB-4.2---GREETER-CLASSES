import java.util.Arrays;
import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose a greeting:");
		
		String greeting = scan.nextLine();	
		
		//Greeter user = new Greeter(UserInput);
		//user.greeting = UserInput;
		System.out.println("Enter your name:");
		
		String name = scan.nextLine();	
		//user.greeting = UserInput;
		//Greeter user = new Greeter();
		 System.out.println("How much volume to add? (0 to 10):");
	     int volume = scan.nextInt();
	     volume = volume > 10 ? 10 : Math.max(volume, 0);
	     scan.nextLine();
	     System.out.println("Enter an HTML tag (no brackets):");
	     String tag = scan.nextLine();
		
		Greeter greeter = new Greeter(greeting);
		JavaScriptGreeter simonGreeter = new JavaScriptGreeter(greeting);
		LoudGreeter loudGreeter = new LoudGreeter(greeting);
	        for (int i = 0; i < volume; i++) {
	            loudGreeter.addVolume();
	
	   }
	   
	}
}
