package day19;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo3 {

	public static void main(String[] args) {
		
		Set<String> set=new LinkedHashSet<String>();
		
		set.add("Jenkins");
		set.add("Selenium");
		set.add("Maven");
		set.add("TestNG");
		set.add("AutoIT");
		set.add("Git");
		set.add("GitHub");
		 
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		

	}

}
