package practiseprograme;

final public class finalkeyword {   //final keyword for class,we can use only in this class we cannot inherit to other child class
final public void add() {   //final keyword for method,can use only in same class cant use in child class...similar like private 
	System.out.println("add two numbers");
}
public  void sub() {
	int a=20;
		System.out.println(a);
}

	public static void main(String[] args) {
		int a=20;
		a=30;
		a=70;
		System.out.println(a);  //will print latest variable

		final int b=100;  //final keyword for variables 
		//b=20;
		//b=14;
		System.out.println(b);  //once final keyword used the value will not be changed if we add other variables also it will show error
		finalkeyword obj=new finalkeyword();
		obj.add();
	}

}
