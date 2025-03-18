package practiseprograme;

public class methods2 {
public void sub() {
	int c=100; long b=5678982l;
	System.out.println(c+b);
	System.out.println(b-c);
	System.out.println(c!=b);
	
}
	public static void main(String[] args) {
		methods1 obj=new methods1();
		obj.employee();  //void/non static
		methods1.add(50,(byte)40,30);//static
methods2 obj2=new methods2();
obj2.sub();
	}

}
