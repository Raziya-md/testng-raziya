package methodsexample;

import java.util.Scanner;

public class operatorspractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int marks=0;
		
		System.out.println("Please enter your Marks");
		marks = input.nextInt();
		
		if(marks<=34){
			System.out.println("Fail");
		}
			else if (marks<=54) {
				System.out.println("Pass");
			}
			
			else if(marks<=74) {
				System.out.println("Distiction");
			}
			
			else  if(marks>75)
			{
				System.out.println("High Destiction");
			}
			
			else
			{
		
				System.out.println("Invalid marks");
		
	}

	}

}
