package day19;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		
		set.add("Sudipta");
		set.add("10");
		set.add("75");
		set.add(14.52);
		set.add(14.52);
		set.add(null);
		set.add(null);
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		

	}

}
