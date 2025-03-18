package methodsexample;

import java.util.Scanner;

public class parameters {
	public static void arithematic(long a,short b,long c){  // using 3 parameters
		 
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);	
		System.out.println(c);
		System.out.println(c+a-b);
		System.out.println(c-a+b);
		System.out.println(c/a);
		System.out.println(c%a);
		}
		public static void increment(byte raziya) {  //1 parameter
			
			System.out.println(++raziya);
			System.out.println(raziya++);
			System.out.println(raziya);
			System.out.println(raziya++);
			System.out.println(raziya);
			System.out.println(++raziya);
		}

		public void add2() {
			System.out.println("this is zero parameter");
		}
		
		public static void assignments() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the age:");

			short personage = scanner.nextShort();
			if (personage <= 5){
				System.out.println("height:2.5 weight:18 ");}
			
			else if (personage <= 10){
					System.out.println("height:4.5 weight:22 ");
				}
			else if (personage >= 18) {
				System.out.println("height:6.5 weight:50 ");
			}
			else {
				System.out.println("inappropiate data");
			}
				scanner.close();
			}
		
		public static void operators() {
			//Booking tickets in govt bus
			Scanner input = new Scanner(System.in);
			System.out.println("enter the gender:");
			int choice = input.nextInt();
				System.out.println("\nselect female/male/senior");
	        System.out.println("Choose an action: ");
	        System.out.println("1. female");
	        System.out.println("2. male");
	        System.out.println("3. senior");
	        
			if (choice == 1) {
				System.out.println("Female the ticket rate is 0");
							}
			else if (choice == 2) {
				System.out.println("male the ticket rate is as per location");
			}
			else if (choice == 3){
				System.out.println("senior citizen price is half for males");
			}
			else {
				System.out.println("kids for free");
			}
			}
		public static void character(char B,char P) {
			
			System.out.println(B*P);
			System.out.println(B+P);
			System.out.println(B<P);
			System.out.println(B>P);
			System.out.println(B==P);
		}
    	        				


	public static void main(String[] args) {
		System.out.println("hello");
		
	//	parameters.arithematic(100,(short)20,120);
  //     parameters objref0 =new parameters();
//objref0.add2();
increment((byte)78);
//parameters.assignments();
//operators();
//parameters.character((char)10,(char)8);

	}

}
