package practiseprograme;

public class methodoverloading {
public void add() {
	System.out.println("add two numbers");
}
private void add (int f,long g) {
	System.out.println(f-g);
}
void add(int d,short v,byte h) {
	System.out.println(d+v-h);
}
	public static void main(String[] args) {
		methodoverloading obj4=new methodoverloading();
		obj4.add();
obj4.add(50, 30);
obj4.add(20,(short)100,(byte)67);

	}

}
