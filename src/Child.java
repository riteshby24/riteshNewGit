
 public class Child extends Parent 

 {
	 Child(String s2)   // (1-Args Constructor)
	   {
			super("Ritesh", 40);   //call Parent Class 2-args Constructor	
		}
	 Child(String s3,int i)    // (2-Args Constructor)
	   {
			super("Ritesh");     //call Parent Class 1-args Constructor 
    	}
	 void m2()     //Instance Method
	   {
		   super.m1();   //Call Parent class Method  
	   }
  
      int a=1;     //Instance Variable
      static int b=2;     //static Variable
  
       void add()     //NSM  If we Use static the Gives CTE.  Super and This never in use static method.
     {
	   System.out.println(this.a+this.b);    
	   System.out.println(this.b+super.y);  //call Super varialbe and add Child class variab
	   System.out.println(super.x+super.y);  
	  
     }
   
	public static void main(String[] args) {
		Child c=new Child("Raj");    //1-args COnstructor Call
		Child c1=new Child("Ritesh",50);   //2-args Constructor Call
		//c1.m1();
		//c.m1();
		c1.m2();   //method call
		c.add();
	}

}
