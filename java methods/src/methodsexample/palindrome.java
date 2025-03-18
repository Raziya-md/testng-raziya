package methodsexample;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		/*String original, reverse = ""; // Objects of String class    
	      Scanner in = new Scanner(System.in);     
	      System.out.println("Enter a string/number to check if it is a palindrome");    
	      original = in.nextLine();     
	      int length = original.length();     
	      for ( int i = length - 1; i >= 0; i-- )    {
	         reverse = reverse + original.charAt(i);    
	      if (original.equals(reverse)) {   
	         System.out.println("Entered string/number is a palindrome.");    
	      }else   { 
	         System.out.println("Entered string/number isn't a palindrome.");     
	   }    
	      }   */

	      String name= "radar"; 
	     // String splitVal[]=name.split(" ");
	      for(int i=name.length()-1;i>=0;i--) {
	    	  	System.out.println(name.charAt(i));
	      }
	      //if (name.equals("reverse")) {
	    	//  System.out.println("this is Palindrome");
	     // }else {
	    	//  System.out.println("this is not a  Palindrome"); 
	      
	   /*   int i, j,count;

	        System.out.println("Prime numbers between 1 to 100 :");
	        for (i = 2; i <= 100; i++) {
	            count = 0;
	            for (j = i; j >= 1; j--) {
	                if (i % j == 0)
	                    count = count + 1;
	            }
	            if (count == 2)
	                System.out.print("" + i + " ");
	        }*/
	      
	      
	          int coe=1,rows = 6;  
	       for(int i = 0; i < rows; i++) {  
	              for(int space = 1; space < rows - i; ++space) {  
	                  System.out.print("  ");  
	              }  
	    
	              for(int j = 0; j <= i; j++) {  
	                  if (j == 0 || i == 0)  
	                      coe = 1;  
	                  else  
	                      coe = coe * (i - j + 1) / j;  
	    
	                  System.out.printf("%4d", coe);  
	              }  
	        System.out.println();  
	          }     
	}}
