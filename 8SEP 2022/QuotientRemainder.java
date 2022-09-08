/*
Program: Finding Quotient and Reminder
@author:Sudip Das
@Date: 8sept2022

*/

//declaring class
class QuotientRemainder
{
     //calling main method
	 public static void main(String[] args)
	 {
	   float number1=Float.parseFloat(args[0]);
	   float number2=Float.parseFloat(args[1]);
	   float quotient=number1/number2;
	   float reminder=number1%number2;
	   
	   
	   System.out.println("The quotient is:"+quotient);
	   System.out.println("The reminder is:"+reminder);
	 }
	 
	 //end of main
	 
}
//end of class QuotientRemainder