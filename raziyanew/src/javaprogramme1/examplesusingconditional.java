package javaprogramme1;
import java.util.Scanner;
public class examplesusingconditional {

	public static void main(String[] args) {
		
		
		        System.out.println("**** Welcome to make my trip****");
		        System.out.println("Enter the username for ticket booking: ");
		      
		        Scanner scanner = new Scanner(System.in);

		        // Accept user name input
		        String user1 = scanner.nextLine();

		        // Welcome message based on the username
		        if (user1.equals("raziya")) { // Case-insensitive comparison
		            System.out.println("Welcome Ms. raziya!");
		        } else {
		            System.out.println("Welcome Mr.ziya !");
		        }

		        // day selection
		       int weekdays = 800;
		        int weekends =1000;

		        // selection options
		        System.out.println("\nselect weekday/weekend");
		        System.out.println("Choose an action: ");
		        System.out.println("1. weekday");
		        System.out.println("2. weekend");

		        // User choice
		        int choice = scanner.nextInt();

		        if (choice == 1) {
		            // weekday
		            System.out.println("pay the amount 800 for weekday booking ");
		            
		            int weekday = scanner.nextInt();
		            if (weekday == 800) {
		              System.out.println("paid 800");
		                
		            } else {
		                System.out.println("Invalid  amount!");
		            }
		            
		        } else if  (choice == 2) {
		            // Weekend
		            System.out.println("pay the amount 1000 for weekend booking ");
		            int weekend = scanner.nextInt();
		            if (weekend == 1000) {
		                System.out.println(" paid 1000 "); }
		                
		            else   {
		                System.out.println("Invalid  amount!");
		        
		        } 
		        }
		        
		        scanner.close();// Close the scanner

		        
		        System.out.println("Thank you for booking with us!");  
	}}
		    
	
	

	


