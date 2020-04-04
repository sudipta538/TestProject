package day22;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapExample3 {

	public static void main(String[] args) {
		
		Map<Integer,String> studentDatabase=new HashMap<>();
		
		studentDatabase.put(7, "Sujeet");
		studentDatabase.put(8, "Masiat");
		studentDatabase.put(1, "Amit");
		studentDatabase.put(2, "Anupama");
		studentDatabase.put(3, "Sudipta");
		studentDatabase.put(4, "Geeta");
		
		Set<Integer> allKeys=studentDatabase.keySet();
		
		Set<Entry<Integer, String>> allData=studentDatabase.entrySet();
		
		for(Entry<Integer,String> m:allData)
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		}
		}
