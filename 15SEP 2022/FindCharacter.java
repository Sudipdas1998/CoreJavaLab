/*
program : To find a character
@author: Sudip Das
@Date: 15 sep 2022
*/

//declaring a class 
class FindCharacter
{
	// declaring method printAsciiValue
	static void printAsciiValue(char cValue)
	{
	  int asciiVal = cValue; // computing Ascii value
	  System.out.println("The ascii value of "+ cValue +" is :"+ asciiVal );// printing
		
	}
	// end of method
	
	static void checkChar(char cValue)
	{
		int asciiVal= cValue;
		if((asciiVal>=65)&&(asciiVal<=90))
		{
			System.out.println("Its a capital(uppercase) letter");
			
			if((cValue=='A')||(cValue=='E')||(cValue=='I')||(cValue=='O')||(cValue=='U'))
			{
				System.out.println("Its a vowel"); //printing
			}
			else
			{
				System.out.println("Its a consonant");  //printing
			}	
			
		    
		}
		else if((asciiVal>=97)&&(asciiVal<=122))
		{
			System.out.println("Its a small(lowercase) letter");
			if((cValue=='a')||(cValue=='e')||(cValue=='i')||(cValue=='o')||(cValue=='u'))
			{
				System.out.println("Its a vowel"); //printing
			}
			else
			{
				System.out.println("Its a consonant");
			}	
		}
			System.out.println("Its a number");  //printing
		else if((asciiVal>=48)&&(asciiVal<=57))
		{
		}
		else
			System.out.println("Its a special character");
			 
		
	}
	
   public static void main(String args[])
   {
	   char value = args[0].charAt(0);// taking a character input
	   
	   // calling method printAsciiValue
      //printAsciiValue
	
    
    }

   // end of main

}

// end of class