package javaprogramme1;
import java.util.Scanner;
public class conditionalexample3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        // Prices
        double fullticket =100.0;
        double PriceUnder18 = 70.0;
        double PriceSenior = 80.0;

        // Get input from the user
        System.out.print("Enter the number of tickets to book: ");
        int numTickets = scanner.nextInt();

        double totalCost = 0;

         for (int i = 1; i <= numTickets;i++ ) {
            System.out.print("Enter the age of person for ticket " + i + ":");
            int age = scanner.nextInt();

            if (age < 18) {
                totalCost += PriceUnder18;
            } else if (age >= 60) {
                totalCost += PriceSenior;
            } else {
            	totalCost += fullticket;
            
            }
        }

        // Display the total cost
        System.out.println("Total cost of tickets $" + totalCost);

        scanner.close();
    
        // Close the scanner
        scanner.close();
	

	}

}
