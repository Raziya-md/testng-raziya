package javaprogramme1;

public class methodspractice1 {

	public void welcome() {
		System.out.println("welcome to methods practice");
		System.out.println("This is non static method");

	}

	public static void company_1() {

		System.out.println("this is static method");
		System.out.println("My company name is OMC");

	}

	public void company_2() {
		System.out.println("this is non static method");
		System.out.println("My company name is OMC");
	}

	public static void booking() {
		int child = 80;
		int adult = 150;
		int senior = 100;

		if (child < senior && adult > senior) {
			System.out.println("true");

		}
	}

	public static void organisation() {
		int staff = 200;
		int students = 600;
		int workers = 100;
		if (students >= staff) {
			if (workers >= staff) {
				if (students > workers) {
					System.out.println("students are more than all");
				} else {
					System.out.println("3rd statement is true");
				}
			} else {
				System.out.println("2nd condition is true");
			}
		} else {
			System.out.println("1st condition is true");
		}
	}

	public static void strength() {
		System.out.println("strength =10");
	}

	public static void main(String[] args) {
		methodspractice1 objref = new methodspractice1();
		objref.welcome();
		company_1();
		objref.company_2();
		company_1();
		company_1();
		objref.company_2();
		objref.welcome();
		System.out.println("I am trying to call static method in this line");
		booking();
		organisation();
		strength();
		company_1();
		company_1();
		
	}

}
