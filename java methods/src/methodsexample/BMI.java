package methodsexample;
import java.util.Scanner;
public class BMI {
	public static void caluclations() {
		Scanner age= new Scanner(System.in);
				System.out.println("Enter Height:");
		Double height = age.nextDouble();
		
		System.out.println("Enter Weight:");
		Double weight = age.nextDouble();
		
		height = height/100;
		Double BMI = weight / (height * height);
		String s;
		//System.out.println("The BMI is:" + BMI);
		 
		if(BMI < 18.5) {
			System.out.println("less than 18.5");
			s = "underweight";
			}
		else if ((BMI) >= 18.5 || (BMI) <= 24.9) {
	        System.out.println("between 18.5 and 24.9");
	        s = "Normal";
	    } else if (BMI >= 25 || BMI <= 29.9) {
	        System.out.println("between 25 and 29.9");
	        s = "Overweight";
	    } else {
	        System.out.println("greater than 30");
	        
	        s = "Obese";
	    }

	    System.out.println("Your BMI is:" + BMI + " ( " +s +") ");
		}
	/*public static void BMI() {
		Scanner age= new Scanner(System.in);
				System.out.println("Enter Height:");
		Double height = age.nextDouble();
		
		System.out.println("Enter Weight:");
		Double weight = age.nextDouble();
		
		height = height/100;
		Double BMI = weight / (height * height);
		
		System.out.println("The BMI is:" + BMI);
	}*/
		
	
public static void main(String[]args) {
	caluclations();
//BMI();
}}
