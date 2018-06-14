 class Test2
{
 
	public void show(int i)
	{
		System.out.println("Parent show");
	}
}
 class Child5 extends Test2
	{
	   
		public  void show()
		{
			System.out.println("child show");
		}
	}

 class Test1
{
	public static void main(String[] args)
	{
		Test2 t=new Test2();
		t.show(10);
		//Test2 t2=new Child5();
		//t2.show();					
	}
}


			
	
		
 