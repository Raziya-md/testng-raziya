/*package javaprogramme1;
import java.util.Scanner;
public class MOVIETICKET {

	public static void main(String[] args) {
		 int   result, numTickets;
		 //char operator;
		 
		
		System.out.println("**** Welcome to Book my show****");
		   System.out.print("Type of ticket to book: ");
		   Scanner input = new Scanner(System.in);
      String cost =  input.next().toString();
      
       System.out.println("Enter the no. of movie ticket booking: "); 
        numTickets = input.nextInt();
        
		 
	        // Get input from the user
	     switch (cost) {
		 case "normal":
			   result = numTickets * 100;
		
			  System.out.println( "you can book normal ticket with:"   + result);  
			  
			 break;
			 
		 case "balcony":
			 result = numTickets * 150;
			 System.out.println("you can book balcony ticket with:"  + result);  
			 break;
		 case "recliner":
			 result = numTickets * 200;
			 System.out.println("you can book recliner ticket with:" +   + result);  
			 break;
			 default:
				 System.out.println("none of the above");  
				 
				 
				 input.close();// Close the scanner

			        
			        System.out.println("Thank you for booking with us!");  
		
		 
	}
}
}*/

package javaprogramme1;
import java.util.Scanner;
public class MOVIETICKET {

	public static void main(String[] args) {
 int result,num;
		System.out.println("welcome to Dmart");
		System.out.println("Enter the name of person: ");
		Scanner input = new Scanner(System.in);
		String performance = input.next().toString();
		System.out.println("result "); 
		 num = input.nextInt();
		 
		//user input details
		switch (performance) {
		case "salesp1":
			result = num + 0;
			System.out.println("Target to get 2 new customer daily  is a performer :" + result);
			break;
		case "salesp2":
			result = num * 0;
			System.out.println("Target to get <2 new customer is non performer of the day:" + result);
			break;
		case "salesp3":
			result = num+0;
			System.out.println("Target to get <2 new customer is non performer of the day:" + result);
		default:
			 System.out.println("none of the above");  
			 
			 
			 input.close();// Close the scanner

		        
		        System.out.println("Thank you for updating the performance!");  
			
			
			
			
			
			
			
			
			
		
		}
		
	}
}
