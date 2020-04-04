package day19;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo5 {

	public static void main(String[] args) {
		
		TreeSet<String> set=new TreeSet<String>();
		
		set.add("Sudipta");
		set.add("Puspita");
		set.add("Durgaprasad");
		set.add("Santosh");
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
