package practiseprograme;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap_hashtable_hashset_iterator {

	public static void main(String[] args) {
		
		HashMap<Integer,String> mapdata =new HashMap<Integer,String>();
mapdata.put(1,"Raziya");
mapdata.put(2,"Raziya");
mapdata.put(3,"sulthana");
mapdata.put(4,"Raziya");
mapdata.put(5,"Raziya");
mapdata.put(6,"Raziya");
mapdata.put(7,"Raziya");
System.out.println(mapdata);   //output {1=Raziya, 2=Raziya, 3=sulthana, 4=Raziya, 5=Raziya, 6=Raziya, 7=Raziya}

mapdata.remove(4);
System.out.println(mapdata);  //output {1=Raziya, 2=Raziya, 3=sulthana, 5=Raziya, 6=Raziya, 7=Raziya}

mapdata.replace(6,"mohammed");
System.out.println(mapdata);  //output {1=Raziya, 2=Raziya, 3=sulthana, 5=Raziya, 6=mohammed, 7=Raziya}

//print data entire record in for each loop
for(Map.Entry<Integer,String>  e:mapdata.entrySet()) {
	System.out.println("key:" +e.getKey()+"Value:" +e.getValue());
	//System.out.println(+e.getKey()+e.getValue());
}
//print data only particular record
for(Map.Entry<Integer,String>  e:mapdata.entrySet()) {
if(e.getKey().equals(3))	{
	System.out.println(+e.getKey()+e.getValue());
}
	
	}


Hashtable <Integer,String> mapsdata =new Hashtable<Integer,String>();
mapsdata.put(1,"Raziya");
mapsdata.put(2,"Raziya");
mapsdata.put(3,"sulthana");
mapsdata.put(4,"Raziya");
mapsdata.put(5,"Raziya");
mapsdata.put(6,"Raziya");
mapsdata.put(7,"Raziya");
System.out.println(mapsdata);  //output in reverse order {7=Raziya, 6=Raziya, 5=Raziya, 4=Raziya, 3=sulthana, 2=Raziya, 1=Raziya}

//print data entire record in for each loop
for(Map.Entry<Integer,String>  e:mapsdata.entrySet()) {
	System.out.println("key:" +e.getKey()+"Value:" +e.getValue());
}

//print data only particular record
for(Map.Entry<Integer,String>  e:mapsdata.entrySet()) {
if(e.getKey().equals(3))	{
	System.out.println(+e.getKey()+e.getValue());
}
}

HashSet<String> s=new HashSet<>();

s.add("Raziya");
s.add("salma");
s.add("nasreen");
s.add("amreen");
s.add("zohaib");
s.add("Raziya");  //duplicate values will not consider
System.out.println(s);  //output [salma, nasreen, amreen, Raziya, zohaib]

//print entire record will print
	for(String R:s) {
		System.out.println(R);
	}
	//particular record will print
	for(String R:s) {
				if (R.equals("nasreen")) {
					System.out.println(R);
				}
	}	
	Iterator<String> it =s.iterator();
	while (it.hasNext()){
		String data=it.next();
		System.out.println(data);
	}
	
	}

	}
