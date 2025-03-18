package projectmaven.TestNG;

public class FinalizeExample {

	public static void main(String[] args) throws Throwable {
		FinalizeExample obj= new FinalizeExample();
		FinalizeExample obj1= new FinalizeExample();
		FinalizeExample obj2= new FinalizeExample();
		
		obj.finalize();   //this method will clean the object data,we cannot use this obj again
		System.gc();   //Garbage collections(moving to bin)
		
		
	}

}
