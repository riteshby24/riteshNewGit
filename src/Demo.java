
public class Demo extends SuperKey
{
	 
		int a=15;
		int b=25;
		static String s="Raj";
		void m4()
		{
			System.out.println("Display Super Class Method");
			System.out.println(super.a);
			System.out.println(super.b);
			System.out.println(s);
		}
		void m5()
		{
			System.out.println("super class method3");
			
		}
		void m6()
		{
			super.m1();
			super.m2();
			super.m3();
			System.out.println("super class method4");
			
		}
		 static void m7()
		{
			 
			System.out.println("static super class method2");
			
		}
		

	public static void main(String[] args) {
		Demo d=new Demo();
		//d.m1();
		//d.m2();
		//SuperKey.m3();
		d.m4();
		d.m5();
		d.m6();
		m7();
		
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(SuperKey.s);
		

	}

}
