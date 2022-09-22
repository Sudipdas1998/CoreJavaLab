/*
Program: RemoveDuplicateArray & Short
@uthor: Sudip Das
@Date:   22th Sep
*/

import java.util.Scanner;
import java.util.Arrays;

// declaring a class
class SrortRemoveDuplicateArray
{
	static void inputArray()
	{
		// Scanner object for input of elements
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int rows= sc.nextInt();
		
		// creating an array
		int arr[]= new int[rows];
		
		// loop to enter elements
		System.out.println("Enter the elements:");
		
		
		for(int i=0;i<rows;i++)
		{
				
	     	arr[i]= sc.nextInt();// taking integer input
			
			
		}
		 // end of for
		
        Arrays.sort(arr); // sorting the elements		

		System.out.println();
		
		System.out.println("Array elements are:");
         displayArray(arr);
		
		System.out.println();
		
		System.out.println("Removing Duplicate elements:");
        removeDuplicate(arr);
		
		
		
		
	}
	 // calling display method
	static void displayArray(int myArray[])
	{
		
	   System.out.println();
	
		for(int myrow:myArray)
		{
		 System.out.print(myrow+ "  ");
					
		}
		
	}
    
	//remove duplicate entres
   static void removeDuplicate(int myArray[])
   {
	   int size= myArray.length;
	   int new_size;
	   if(size==0||size==1)
		   new_size=size;
	   
	   int temp[] = new int[size];
	   int j=0;
	   for(int i=0;i<size-1;i++)
	   {
		   if(myArray[i]!=myArray[i+1])
		   {
			   temp[j++]=myArray[i];
		   }
	   }
	   temp[j++]=myArray[size-1];
	   
	   //changing original array
	   for(int i=0; i<j;i++)
	   {
		   myArray[i]= temp[i];
	   }
	   
	   
	   //printing after removing duplicate entries
	   
	   for(int i=0;i<j;i++)
	   {
		   System.out.print(myArray[i]+"  ");
	   }
   }
   
   //main method
   public static void main(String ...args)
  {

     // calling method inputArray
     inputArray();

  }


}