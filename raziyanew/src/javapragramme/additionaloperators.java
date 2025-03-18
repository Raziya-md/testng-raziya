package javapragramme;

public class additionaloperators {

	public static void main(String[] args) {
		//additional of 2 numbers 10+20=30
		
		Byte num1 = 10;
		byte num2 = 20;
		System.out.println(num1+num2);
		System.out.println(num2-num1);
		System.out.println(num1*num2);
		System.out.println(num2/num1);   //qoficient in division 
		System.out.println(num2 % num1);  // remainder in division modules
		
				byte x =30;  //i want to add on  x
		System.out.println(x+20+50+30+20+10+x+x);
		
		//increment operator
			byte Y = 100;
			
			System.out.println(Y); //pre increment
			++Y;   //++ is an increment operator which adds only 1 value to any number
			System.out.println(Y);  //101  at same situation added 1 value in backend 
			int z = 200;
			System.out.println(z);    
			//z++;   // post increment operator will add the value and applicable when we use next time
			System.out.println(z++);   //200  here z already added 1 value in backend 
			System.out.println(z);  //201
			
		
		
		
		
	}

}
