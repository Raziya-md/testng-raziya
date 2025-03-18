package practiseprograme;

public class variables {
		
	//types of variables
	public void add() {
		int a=10;
		byte b=30;      //local variables
		System.out.println(a+b);
		}
	//instance variables outside the method we need to give datatypes directly
	String name="raziyasulthana.mba@gmail.com";
	String address = "6-1-117";
	public void  details () {
		System.out.println(name+" "+address);
	}
	
	static int r=100;
	static long l=120897967l;   //static variables
	public static void div() {
		
	System.out.println(r/l);
	System.out.println(r%l);
	System.out.println(r++);
	System.out.println(r<l);
	System.out.println(r==l);
	}
	public static void main(String[] args) {
		variables obj1=new variables();
			obj1.details();
		obj1.add();
		variables.div();
		
	}

}
