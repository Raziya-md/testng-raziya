package javaprogramme1;

public class METHODSPRACTICE2 {
	
	public void employees() {
		System.out.println("This statement belongs to methodspractice2 class and it is non static method");
		
	}
	public static void contractor() {
		System.out.println("This statement belongs to methodspractice2 class and it is  static method");	
	}
	
	public static void strength_1() {
		System.out.println("strength_1 =100");
		}
		
	public static void main(String[] args) {
		methodspractice1 objref = new methodspractice1();
		objref.company_2();
		//   company_1();     when i call static method in different class without giving class name not working
		methodspractice1.company_1();  // static method has been successfully called by using classname.static method		

		contractor();
		METHODSPRACTICE2 objref2 = new METHODSPRACTICE2();
		objref2.employees();
		methodspractice1.organisation();
		methodspractice1.strength();
		strength_1();
		 System.out.println("strength_1 + methodspractice1.strength();");
		 
		
	}

}
