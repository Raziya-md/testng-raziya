package practiseprograme;

public class Datatype_convertingforstring {

	public static void main(String[] args) {
		int salary=1000;
		int deduction=200;
		String tax="20";
		System.out.println(salary+deduction);  //1200
		System.out.println(deduction+tax);     //output 20020 due to as variable in int+string
  //how to convert int to String
		int covn=Integer.parseInt(tax);
		System.out.println(deduction+covn);
		
		byte obj=Byte.parseByte(tax);
		Long obj1=Long.parseLong(tax);
		Short obj2=Short.parseShort(tax);
		System.out.println(salary+obj);
		System.out.println(deduction+obj2);
		System.out.println(salary+obj1);
		
				
	}

}
