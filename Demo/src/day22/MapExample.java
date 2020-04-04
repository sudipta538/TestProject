package day22;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
	Map obj=new HashMap();
	
	obj.put(1,"Sudipta");
	
	obj.put(2, "Santosh");
	
	obj.put(3, 1234);
	
	obj.put("tool", "Selenium");
	
	obj.put("Yes", "Interview");
	
	
	//System.out.println(obj);
	
	System.out.println(obj.get("tool"));
		

	}

}
