package methodsexample;

public class accessmodifier2 {
void flight() {
	System.out.println("Ammi is coming on 24th dec to India");
}
	public static void main(String[] args) {
		accessmodifiers obj1=new accessmodifiers();
		//obj1.employees();  //private class not able to access in other class
		obj1.id();  //default can access in entire package
		obj1.increment(); //protected same like default access entire package
		accessmodifiers.arithematic(18, (short)12, 5); //public use in entire package and project level
		accessmodifier2 obj2=new accessmodifier2();
		obj2.flight();
	}

}
