package inheritance;

public class classA {
  public void add(int a,long b,byte c) {
	  System.out.println(a+b-c);
	  System.out.println(a+b+c);
	  System.out.println(b-a-c);
  }
	public static void main(String[] args) {
		classA obj3=new classA();
		obj3.add(15, 8, (byte)10);

	}

}
