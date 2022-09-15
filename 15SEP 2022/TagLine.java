/*
Program:TAG LINE
@author: Sudip Das
@Date: 15 sep 2022
*/

//declaring a class
class TagLine
{
	//calling main
	
  public static void main(String[] args)
  {

	
	String brands =args[0].toLowerCase();   // TAKING INPUT
    		 
	switch(brands)
	
	{
	   case "puma" -> System.out.println("Forever Faster Is Always First");  // PRINTING
                           
	   case "nike" -> System.out.println("Just Do It");  // PRINTING
	                    
	   case "adidas" -> System.out.println("Impossible Is Nothing"); //PRINTING
	                      
		case "jordan" -> System.out.println("Yes, it's Jordan");  //PRINTING
	                      
		case "reebok" -> System.out.println("Be More Human");  //PRINTING
	                      
	   default -> System.out.println("Wrong Input");  //PRINTING
	         
							        		
	}
	// end of switch
		 
  }
 // end of main

}