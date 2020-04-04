package demoPkg;

public class TestMultMain {

	int a;
	public static void main(String[] args) {
	
		TestMultMain tmm = new TestMultMain();
				tmm.test();
				tmm.test1();
				tmm.test2();
	}

	
	public  void test()
	{
		
		a = 10;
		System.out.println("Value from test method: " + a);
	}
	
	public void test1()
	{
		a = 20;
		System.out.println("Value from test1 method: " + a);
	}
	
	public void test2()
	{
		System.out.println("Value from test2 method: " + a);
	}
	
	
}
