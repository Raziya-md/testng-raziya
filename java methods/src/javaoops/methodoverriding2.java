package javaoops;

public class methodoverriding2 extends methodoverriding{
//this is child class, if there is no method also will call directly from parent class 
	
	public static void main(String[] args) {
		methodoverriding2 obj=new methodoverriding2();
		obj.family();

	}

}
