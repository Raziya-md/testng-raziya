package practiseprograme;

public class constructors {
public void add() {
	
}
constructors(){   //default constructors
	System.out.println("hello");
	}
constructors(int a,int b){
	System.out.println(a+b);
}
String name;        //instance method parameterized constructors,need to use this keyword 
String Location;
public constructors(String person,String area){
	this.name=person;
	this.Location=area;
	
}
//public,private,protected we can use in constructors but not static method
//we cannot override the constructors but we can overload the constructors
//we cannot use final keyword in constructor
//we cannot create abstract class  in constructors

	public static void main(String[] args) {
		constructors obj=new constructors(100,70);
		constructors obj1=new constructors();
		constructors obj2=new constructors("Raziya","Hyd");
		System.out.println(obj2.name + obj2.Location);
	}

}
