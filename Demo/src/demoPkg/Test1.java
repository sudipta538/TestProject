package demoPkg;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {


	public static void main(String[] args) {
		
		//int x= Addition.add(10, 20);
		//System.out.println("Output is:" + x);
		
		Date d=new Date();
		
		SimpleDateFormat xyz=new SimpleDateFormat("HH_mm_ss_dd_MMM_yyy");
		
		//xyz.format(d);
		
		System.out.println(xyz.format(d));
	

	}

}
