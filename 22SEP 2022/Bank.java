/*
Program: Creat bank account
@Author: Sudip Das
@Date: 22SEP
*/

import java.util.*
class Bank

{
   int ac-no;
   string name,type;
   float amount;
   void details( int n, string nm, string nm, string t, float a)
   {   
   
        ac-no=n;
		name=nm;
		type=t;
		amount=;
   }
      void show()
	  {
	     system.out.println(ac-no+" "+name+"  "+type+" "+ amount);
		 
	  }
        void display()
	{
	   if(amount<1000)
	   {
	      system.out.println(ac-no+" "+name+" "+type+" "+amount);
		  
	   }
	)
	
	class test
	{
	  public static void main (string args[])
	  
	  {
	     bank b=new bank();
		 bank b1=new bank();
		 bank b2=new bank();
		 bank b3=new bank();
		 
		 b.details(123456,"Ankit", "Savings", 1200);
		 b1.details(23467,"Arnab","Savings", 800);
		 b2.details(82367,"Ankita","Savings", 2000)
		 b3.details(28976,"Kiran","Savings", 600);
	  }
	  
	  b.display();
	  b1.display();
	  b2.display();
	  b3.display();
	}
}
