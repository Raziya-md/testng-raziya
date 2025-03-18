package javaprogramme1;
public class methodspractice3 {
	
public static void arithematic(long a,short b,int c){
 
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
public void increment() {
	byte raziya = 76;
	System.out.println(++raziya);
	System.out.println(raziya++);
	System.out.println(raziya);
	System.out.println(raziya++);
	System.out.println(raziya);
	System.out.println(++raziya);
}

public void add2() {
	System.out.println(100);
}
//assigning operators (=,+=,-=,*=,)
public static void assignments(long num,short age,float height,double weight) {
	System.out.println(num +age);
}


	public static void main(String[] args) {
		
		
       methodspractice3.arithematic(10,(short)112,20);
      

       
	}

}
