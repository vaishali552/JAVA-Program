package JavaPackage;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		 LinkedHashMap<String,String> lhm=new  LinkedHashMap<String,String>();
		lhm.put("one","hai");
		 lhm.put("two","heyy");
		 System.out.println(lhm);
		 System.out.println("Geting Key value"+lhm.get("one"));
		 System.out.println("Size of hash map"+lhm.size());
		 System.out.println("Is hashMap is Empy "+lhm.isEmpty());
		 System.out.println("contains key two"+lhm.containsKey("two"));
		 System.out.println("contains valeu key"+lhm.containsKey("heyy"));
		 System.out.println("Delete the  element"+lhm.remove("one"));
				 System.out.println(lhm);


		 


	}
	
	
	
}
