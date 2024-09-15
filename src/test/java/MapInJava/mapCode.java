package MapInJava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class mapCode {
	
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(123, "sumit");
		hm.put(129, "shivam");
		hm.put(127, "Raj");
		hm.put(130, "naveen");
		hm.put(121, "string");
		hm.put(128, "rohit");
		hm.put(143, "samit");
		hm.put(103, "Amit");
		
		//System.out.println(hm.get(123));
		
		//System.out.println(hm.containsKey(121));
		
		//System.out.println(hm.containsValue("rohit"));
	
//		Set s=hm.keySet();
//		System.out.println(s);
//	
//		
		
		
//		Collection c=hm.values();
//		System.out.println(c);
//		
		
		
      //Set<Entry<Integer,String>> s1= hm.entrySet();
     // System.out.println(s1);
		
		
		System.out.println(hm.entrySet());
		
		
	}

}
