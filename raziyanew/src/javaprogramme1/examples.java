package javaprogramme1;
import java.util.Scanner;
public class examples {

	public static void main(String[] args) {
		

        System.out.println("**** Welcome to make my trip ****");
        System.out.println("Enter the no. of tickets to be booked: ");
      
        Scanner scanner = new Scanner(System.in);

        // Accept user name input
        String user1 = scanner.nextLine();

        // Welcome message based on the username
        if (user1.equals("1")) { // Case-insensitive comparison
            System.out.println("kindly book the tickets");
        } else {
            System.out.println("invalid booking ");
        }

        // eligibility for booking
        short tickets = 1;

        // booking
        
       System.out.println("Choose an action: ");
        System.out.println("1.Book ");
        System.out.println("2. Not eligible to book more than 2 tickets");

     // User choice
        int choice = scanner.nextInt();
        
        if (choice == 1) {
           //booking
        	
        	        	            System.out.println("eligible to book 2 tickets ");
           double deposite = scanner.nextDouble();
            
            
                
            }
        

	else if (choice == 2) {
            // not eligible
            System.out.println("not eligible to book more than 2 ");
            int noteligible = scanner.nextInt();
            
                 
                            System.out.println("Insufficient booking");
        
        } 
        
        scanner.close();// Close the scanner

        System.out.println("Thank you for booking with us!"); 
        
    }


}