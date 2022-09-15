/*
program: Star Pattern
@author: Sudip Das
@date 15 sep 2022
*/

class StarsPattern
{

	static void starPattern(int noOfRows)
	{
		for(int i=1;i<=noOfRows;i++) // outer loop for every rows
		{
			System.out.println(); // new line after every row
			
			for(int spaces=noOfRows;spaces>i;spaces--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			
		}
		
		
	}
	
		
   public static void main(String... args)
   {
	  int number =Integer.parseInt(args[0]);
	  starPattern(number);
      
   }


}
