package day19;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo4 {

	public static void main(String[] args) {
		
		TreeSet<Integer> T=new TreeSet<Integer>();
		
		T.add(5);
		T.add(52);
		T.add(83);
		T.add(63);
		T.add(57);
		T.add(95);
		
		Iterator itr=T.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
