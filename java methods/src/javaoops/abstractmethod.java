package javaoops;

public abstract class abstractmethod {  //will create with abstract keyword only

	public void normal() {   //normal method declaration
		System.out.println("this is normal method"); //implementation also there in normal method
	}
	
	public abstract void add();   //no implementation of code only declaration of method
	public abstract void subract();
	public abstract void division();
	public abstract void add1(int A); //
	public abstract void add1();
	public abstract void module();
	public abstract void multiplication();
	

public static void main(String[] args) {	
 //abstractmethod obj=new abstractmethod();  // we cannot create object from abstract class
}
}