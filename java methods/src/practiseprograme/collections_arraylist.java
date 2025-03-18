package practiseprograme;

import java.util.ArrayList;
import java.util.List;

public class collections_arraylist {

	public static void main(String[] args) {
		//single string element
		String name="Raziya";
		System.out.println(name);
		
		//store multiple or list of elements
		List<String> colors =new ArrayList<>();
		colors.add("pink");
		colors.add("green");
		colors.add("brown");
		colors.add("red");
		colors.add("white");
		colors.add("orange");
		colors.add("black");
		colors.add("blue");
		colors.add("yellow");
		colors.add("voilet");
		System.out.println(colors);
		System.out.println(colors.size());
		System.out.println(colors.getFirst());
		System.out.println(colors.getLast());
		System.out.println(colors.get(4));
colors.remove(7);
System.out.println(colors.get(7));
		//colors.removeAll(colors);
for (int i=0;i<=colors.size()-1;i++) {   //iterate loop process
	System.out.println(colors.get(i));
}System.out.println("for each loop");
for (String c:colors) {             //for each loop easy process will use in programe
	System.out.println(c);
}

	}

}
