/*package javaprogramme1;

public class conditionalexample {

	public static void main(String[] args) {
		
		
					
				
			System.out.println("***Welcome to Make My Trip***");
				System.out.println("\nWould you like to Book the ticket on Weekdays or Weekdays");
		        
				
				
				int day = 3;
				
					switch (day) {
				 case 1:
					 System.out.println("monday = 1000");  
					 break;
				 case 2:
					 System.out.println("tuesday = 1100");  
					 break;
				 case 3:
					 System.out.println("wednesday = 1200");  
					 break;
				 case 4:
					 System.out.println("thursday = 1300");  
					 break;
					 default:
						  System.out.println("none of the above");  

					}
	}
}*/


/* package javaprogramme1;
import java.util.Scanner;
public class conditionalexample {

	public static void main(String[] args) {
		

        System.out.println("**** Welcome to make my trip ****");
        System.out.println("Enter the no. of tickets to be booked:");
      
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
        System.out.println("2. Not eligible");

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


}*/

	package javaprogramme1;
import java.util.Scanner;
public class conditionalexample { 
	

	public static void main(String[] args) {
		
 Scanner scanner = new Scanner(System.in);

		        System.out.println("** Welcome to Make My Trip **");
		        System.out.print("Enter the number of tickets to be booked:\nEnter the Age:\n ");
		        

		        // Read input and convert it to an integer
		        int tickets = scanner.nextInt();
		        int age = scanner.nextInt();
		        		        // Conditional statements to determine booking details
		        	        
		        
		        		if (tickets==1 ) {
		            System.out.println("\nThank you for booking with us! Your total amount is $800.");
		        }
		            else if (tickets==1&&age<60) {
			            System.out.println("\nThank you for booking with us! Your total amount is $1000.");
		        }
		            
		            else if (tickets == 2&&age>=60) {		 
		        	System.out.println("\nThank you for booking with us! Your total amount is $1600.");
		        }
		            else if (tickets==2&&age<60) {
			            System.out.println("\nThank you for booking with us! Your total amount is $2000.");

		        } 
		            else {
		            System.out.println("You are eligible to book only up to 2 tickets.");
		        }
	}
}
