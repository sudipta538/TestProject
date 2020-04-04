package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		
		
		Set<String> set=new HashSet<String>();
		
		set.add("Jenkins");
		set.add("Selenium");
		set.add("Maven");
		set.add("TestNG");
		 Iterator itr=set.iterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		
		

	}

}
