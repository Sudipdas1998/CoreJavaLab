/*
Program: SimpleInterest
@author:Sudip Das
@Date: 8sept2022

*/

//declaring class
class SimpleInterest
{
     //calling main method
	 public static void main(String[] args)
	 {
	   
	   int time=5;
	   int priciple= Integer.parseInt(args[0]);
	   int rate= Integer.parseInt(args[1]);
	   int simpleinterest=(((Integer.parseInt(args[0]))*(Integer.parseInt(args[1]))*5)/100);
	   

	   System.out.println("Simple Interest is :"+simpleinterest);
	 }
	 
	 //end of main
	 
}
//end of class SimpleInterest