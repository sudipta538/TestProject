package demoPkg;

public class TestMutltMethod {

	public static void main(String[] args) {
		
		TestMutltMethod tmm = new TestMutltMethod();
		tmm.multiply(20, 30);
		tmm.multiply(10, 40);

	}

	public void multiply (int a, int b)
	{
		int c= a*b;
		System.out.println("Multi is: " + c);
	}
	
	
}
