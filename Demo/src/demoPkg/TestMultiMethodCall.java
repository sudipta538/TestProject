package demoPkg;

public class TestMultiMethodCall {

	public static void main(String[] args) {
		
		TestMultiMethodCall tmmc = new TestMultiMethodCall();
		tmmc.m2();
	}

	public void m1(int a, int b)
	{
		int c = a*b;
		System.out.println("Addition is: " + c);
	}
	public void m2()
	{
		m1(10, 20);
	}
}
