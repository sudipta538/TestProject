package day22;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapTest {

	public static void main(String[] args) {
		
		Map<Integer, String> studentDatabase = new TreeMap<>();
		
		studentDatabase.put(1, "Sudipta");
		studentDatabase.put(2, "Puspita");
		studentDatabase.put(3, "DurgaPrasad");
		studentDatabase.put(4, "Santosh");
		studentDatabase.put(5,"Papu");
		studentDatabase.put(6, "Dhananjay");
		studentDatabase.put(7,"Geeta");
		
		Set<Integer> allkeys=studentDatabase.keySet();
		
		Set<Entry<Integer,String>>allData=studentDatabase.entrySet();
		
		for(Entry<Integer,String> m:allData)
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}

	}

}
