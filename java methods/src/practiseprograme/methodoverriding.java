package practiseprograme;

public class methodoverriding extends methodoverloading{
public void add1() {
	System.out.println("overriding method");
}

	public static void main(String[] args) {
	//	methodoverloading obj4=new methodoverloading();
	//	obj4.add();
//obj4.add(20,(short)100,(byte)67);
methodoverriding obj5=new methodoverriding();
obj5.add();
obj5.add(20,(short)30,(byte)87);
	}

}
