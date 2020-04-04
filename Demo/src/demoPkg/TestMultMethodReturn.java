package demoPkg;

public class TestMultMethodReturn {

	public static void main(String[] args) {
		
		TestMultMethodReturn tmmr = new TestMultMethodReturn();
		float x = tmmr.multiplicaion(40, 50);
		System.out.println("Result from Main Method: " + x);
		float d = x+500;
		System.out.println("Final Result: " + d);

	}
	
	public int multiplicaion (int a, int b)
	{
		int c= a*b;
		//System.out.println("Result from Inst Method: " + c);
		return c;
	}

}
