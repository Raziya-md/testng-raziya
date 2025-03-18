package methodsexample;

public class variables {

	
	String username ="Raziya";
	String password= "raziya0786";// instance variable will be outside the class 
	
	
	public void add(){  //local variables within class
		int A=10 , B=20;
			System.out.println(A*B);
	}
	
	public static void div() {
	byte  w=30;
		byte z=5;
		float x = w/z;
		System.out.println(x); //static variable
	}
	
	
	public static void main(String[] args) {
		variables obj=new variables();
		obj.add();
		System.out.println(obj.username);
		div();
	}

}
