package projectmaven.TestNG;

public class superclass_child extends this_super{
	
	int x=30;
	static int y=70;
	
	public void sub() {
		System.out.println(super.A);//parent class variables
		System.out.println(super.B);
			System.out.println(this.x);  //can use same class variables
		System.out.println(this.y);
	}
	
	public static void main(String[] args) {
		superclass_child obj =new superclass_child();
		obj.sub();
		

	}

}
