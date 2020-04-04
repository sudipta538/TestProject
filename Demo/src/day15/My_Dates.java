package day15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class My_Dates {

	public static void main(String[] args) {
		
		SimpleDateFormat myFormat=new SimpleDateFormat("HH_mm_ss_dd_MM_YYY");
		
		Date d= new Date();
		
		String date=myFormat.format(d);
		
		System.out.println(date);

	}

}
