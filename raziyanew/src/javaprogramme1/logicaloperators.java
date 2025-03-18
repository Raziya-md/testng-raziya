package javaprogramme1;

public class logicaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//java commands
		// single line comment will disable the result for that line
		/*  ........multiple line comment  */  
		
		
		// logical operators !not,&& and,|| or,
		
		/*       System.out.println(true);  //true
		System.out.println(!true);  //false
		System.out.println(!false);  //true         */
		
	byte  w = 70;
	byte  x = 90;
	byte  y = 120;
	
	System.out.println(!(x<y));  //false
		
	System.out.println("and operators output start from here");
	
	System.out.println("not operator example");
	System.out.println(!true);  //false
	System.out.println(!false);  //true
	
	System.out.println("and operator example");
	boolean raziyaismyname = true;
	boolean hydisintelangana= true;
	boolean mathsistuff = false;
	boolean eatingjunkishealthy = false;
	System.out.println(raziyaismyname && hydisintelangana );  //true
	System.out.println(hydisintelangana && mathsistuff);           //false  
	System.out.println(eatingjunkishealthy && hydisintelangana);  //false
	System.out.println(eatingjunkishealthy && mathsistuff);     //false
	
	System.out.println(w>y && x>y);  //false
	System.out.println(!(y<x) && x>w);  //true
	System.out.println(!(y>x) && x>w);  //false
	System.out.println(x>y && w>x);  //false
	
	
	// ||or 
	System.out.println("or operator example");
	System.out.println(w>y || x>y);  //false
	System.out.println(y>x || x>w);  //true
	System.out.println(y>x || x>w);  //true
	System.out.println(x>y || w<x);  //true
	
	System.out.println(raziyaismyname || hydisintelangana );  //true
	System.out.println(hydisintelangana || mathsistuff);           //true  
	System.out.println(eatingjunkishealthy || hydisintelangana);  //true
	System.out.println(eatingjunkishealthy || mathsistuff);     //false
	
	
		

	}

}
