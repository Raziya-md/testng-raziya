package practiseprograme;

public class methods1 {
public static void add(int a,byte b,int c){
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a+b-c);
	System.out.println(a+c-b);
	System.out.println(a-c+b);
	System.out.println(a/b);
	System.out.println(a%b);
	System.out.println(a<c);
	System.out.println(b>a);
	System.out.println(a%c);
	System.out.println(a*b);
	System.out.println(a<=c);
	System.out.println(a>=b);
	System.out.println(c!=b);
	System.out.println(a<b && b>c);
	System.out.println(c>b || a<c);
	System.out.println(a==b);
	System.out.println(a++);
	System.out.println(b--);
	System.out.println(++c);
	System.out.println(--b);
		
	}
public void employee() {
	 int workers=100;
	 byte staff=98;
	 short management=10;
	 float employer= 20.5f;
	 System.out.println(workers>staff);
	 System.out.println(staff==management);
	 System.out.println(employer>=staff);
	 System.out.println(workers<=management);
	
}
	public int returns() {
		int t=90;
		int e= 190;
	return (t+e);
	
	}
	public static void main(String[] args) {
		methods1 obj=new methods1();
		obj.add(50,(byte) 40, 90);
		methods1.add(20, (byte)30, 90);
		obj.employee();
		methods2 obj2=new methods2();
		obj2.sub();
		System.out.println(obj.returns());
		
	}

}
