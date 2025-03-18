package javaprogramme1;
import java.util.Scanner;
public class movieticketbooking {

	public static void main(String[] args) {
		
		 int   result, numTickets;
		 //char operator;
		 
		
		System.out.println("**** Welcome to Book my show****");
		   System.out.print("Type of ticket to book: ");
		   Scanner input = new Scanner(System.in);
      int cost =  input.nextInt();
      
       System.out.println("Enter the no. of movie ticket booking: "); 
        numTickets = input.nextInt();
        
		 
	        // Get input from the user
	             
		 
		 switch (cost) {
		 case 1:
			   result = numTickets * 100;
		
			  System.out.println( "you can book normal ticket with:"  +  numTickets + " * " + 100 + " = " + result);  
			  
			 break;
			 
		 case 2:
			 result = numTickets * 150;
			 System.out.println("you can book balcony ticket with:" +  numTickets + " * " + 150 + " = " + result);  
			 break;
		 case 3:
			 result = numTickets * 200;
			 System.out.println("you can book recliner ticket with:" +  numTickets + " * " + 200 + " = " + result);  
			 break;
			 default:
				 System.out.println("none of the above");  
				 
				 
				 input.close();// Close the scanner

			        
			        System.out.println("Thank you for booking with us!");  
		

	}

}
}

 /*package javaprogramme1;
import java.util.Scanner;
public class movieticketbooking {

	public static void main(String[] args) {
		
		
        
        Scanner scanner = new Scanner(System.in);
      
     // Seating options and their prices
        int NORMAL_PRICE = 100;
        int BALCONY_PRICE = 150;
        int RECLINER_PRICE = 200;

        
        // Welcome message
        System.out.println("Welcome to the Movie Ticket Booking System!");
        System.out.println("Available options:");
        System.out.println("1. Normal - Rs. " + NORMAL_PRICE);
        System.out.println("2. Balcony - Rs. " + BALCONY_PRICE);
        System.out.println("3. Recliner - Rs. " + RECLINER_PRICE);

        // Prompt user to choose a seat type
        System.out.print("Enter your choice (1 for Normal,2 for Balcony, 3 for Recliner): ");
        int choice = scanner.nextInt();
		        		        // Conditional statements to determine booking details
		        	        
             
        if (choice == 1) {
            // Normal chosen
            {
                System.out.print("How many Normal tickets would you like to book? ");
                int tickets = scanner.nextInt();
                
                    int totalCost = tickets * NORMAL_PRICE;
                   
                    System.out.println("Booking successful! Total cost: Rs. " + totalCost);
            }


                	
                } if (choice == 2) {
                    // Balcony chosen
                    {
                        System.out.print("How many Balcony tickets would you like to book? ");
                        int tickets = scanner.nextInt();
                        
                            int totalCost = tickets * BALCONY_PRICE;
                           
                            System.out.println("Booking successful! Total cost: Rs. " + totalCost);
        }
	}if (choice == 3) {
        // Recliner chosen
        {
            System.out.print("How many Recliner tickets would you like to book? ");
            int tickets = scanner.nextInt();
            
                int totalCost = tickets * RECLINER_PRICE;
               
                System.out.println("Booking successful! Total cost: Rs. " + totalCost);
	}}}}
*/    
		            
	        
		           
	
 



