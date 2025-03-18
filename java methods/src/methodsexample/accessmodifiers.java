package methodsexample;

public class accessmodifiers {
private void employees() {   //private modifier
	int IT= 200;
	byte nonit= 100;
	short workers=10;
	System.out.println(IT+nonit+workers  + "entire strength");
}
	 void id() {   //default modifier
		String username="Raziya";
		String password= "raziya0786";
		System.out.println(username);
		
	}
	
	public static void arithematic(long a,short b,int c){   //public modifier
		 
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
		protected void increment() {
			byte raziya = 99;
			System.out.println(++raziya);
			System.out.println(raziya++);
			System.out.println(raziya);
			System.out.println(raziya++);
			System.out.println(raziya);
			System.out.println(++raziya);
		}

	public static void main(String[] args) {
		accessmodifiers obj1=new accessmodifiers();
		obj1.employees();  //private can access only in this class
obj1.id();  //default can access in entire package
obj1.increment();  //protected same like default access entire package
accessmodifiers.arithematic(18, (short)12, 5);  //public use in entire package and project level
accessmodifier2 obj2=new accessmodifier2();
obj2.flight();
	
	}

}
