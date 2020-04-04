package demoPkg;

public class TestMultMain2 {

	int a = 50;
	static int b = 100;
	public static void main(String[] args) {
	
		TestMultMain2 tmm1 = new TestMultMain2();
		tmm1.a = 70;
		tmm1.b = 80;
		System.out.println("Values from 1st object: " +" " + tmm1.a + " " + tmm1.b );
		TestMultMain2 tmm2 = new TestMultMain2();
		System.out.println("Values from 2nd object: " +" " + tmm2.a + " " + tmm2.b );
		
	}

	/*
	public  void test()
	{
		TestMultMain2 tmm1 = new TestMultMain2();
		a = 10;
		b = 30;
		System.out.println("Value from test method: " + tmm1.a + tmm1.b);
	}
	
	public void test1()
	{
		TestMultMain2 tmm2 = new TestMultMain2();
		System.out.println("Value from test1 method: " + tmm2.a + tmm2.b);
	}
	*/
}
