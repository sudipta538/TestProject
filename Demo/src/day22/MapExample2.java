package day22;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		
		Map<Integer,String> studentDatabase=new HashMap<>();
		
		studentDatabase.put(1,"Amit");
		studentDatabase.put(2,"Anupama");
		studentDatabase.put(3,"Durgapasad");
		studentDatabase.put(4,"Sudipta");
		studentDatabase.put(5,"Dhanjay");
		studentDatabase.put(6,"Geetanjali");
		studentDatabase.put(null,"Puspita");
		studentDatabase.put(null,"Kabita");
		
		System.out.println(studentDatabase);
		
		
		
		

	}

}
