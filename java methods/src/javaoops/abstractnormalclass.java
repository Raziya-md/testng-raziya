package javaoops;

public class abstractnormalclass extends abstractmethod{  //need to add unimplement methods

	

@Override
public void add() {
	int a=100;
	int b=20;
	System.out.println(a+b);
	
}

@Override
public void subract() {
	long x=20;
	short y=10;
	System.out.println(x-y);
	
}

@Override
public void division() {
	byte c=90;
	int d=10;
	System.out.println(c/d);
	
}

@Override
public void add1(int A) {
	A=100;
	System.out.println(A);
	
}

@Override
public void add1() {
	int a=100;
	byte n=30;
	System.out.println(a+n);
	
}

@Override
public void module() {
	float f=80f;
	double d=20f;
	System.out.println(d%f);
	
}

@Override
public void multiplication() {
	int m=10;
	byte b=20;
	System.out.println(m*b);
	
}
public static void main(String[] args) {	
 abstractnormalclass obj=new abstractnormalclass();   //normal class obj creation
 obj.add();   //will declare from parent class and implement from child class
 obj.add1();
 obj.add1(100);
 obj.module();
 obj.multiplication();
 obj.subract();
 obj.division();
}
	}

