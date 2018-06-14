
public class Child1 extends Parent1
{
	Child1(int a)
	{
		super(1);
		System.out.println("Child class 1-args constructor");
	}
	Child1(int a,int b)
	{
		super(1,2);
		System.out.println("Child class 2-args constructor");
	}
	Child1()
	{
		this(10);
		
		System.out.println("Child Class o-args Constructor");
	}
	
	
	

	public static void main(String[] args) {
		//Child1 c1=new Child1();
		 new Child1(1);
		 new Child1(1,2);
		 new Child1();
		 //new Child1(10,20,2);
		 
	}

}
