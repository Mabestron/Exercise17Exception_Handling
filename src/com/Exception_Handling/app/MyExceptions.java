package com.Exception_Handling.app;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MyExceptions 
{

	public static void main(String[] args) 
	{
		int [] numbers = {1,2,3,4,5,6,7,8,9,10};
		int number1=0;
		
		Scanner input = new Scanner(System.in);
		
		try
		{
			System.out.println("Element 1 is: "+numbers[0]);
			System.out.println("Element 2 is: "+numbers[1]);
			System.out.println("Element 3 is: "+numbers[2]);
			System.out.println("Element 4 is: "+numbers[3]);
			System.out.println("Element 5 is: "+numbers[4]);
			System.out.println("Element 6 is: "+numbers[5]);
			System.out.println("Element 7 is: "+numbers[6]);
			System.out.println("Element 8 is: "+numbers[7]);
			System.out.println("Element 9 is: "+numbers[8]);
			System.out.println("Element 10 is: "+numbers[9]);
			System.out.println("Element 11 is: "+numbers[10]);//Exception
			
			System.out.println("Element 1 is: "+numbers[0]);
			System.out.println("Element 2 is: "+numbers[1]);
			System.out.println("Element 3 is: "+numbers[2]);	
				
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Hey, be careful.You are not directing to a valid index");
		}
		
		//Se ejecuta haya o no haya error
		finally
		{
			System.out.println("This finally statement will be executed anyway.");
		}
		
		for (int i=0;i<10;i++)
		{
			try
			{
				System.out.println("Input a number between 0-10: ");
				numbers[i]= input.nextInt();	
				System.out.println("Element in position "+i+" is = "+numbers[i]);
			}
			
			catch(NumberFormatException e)
			{
				System.out.println("Hey the number you input is wrong!");
				input.next();// se limpia el buffer
				i--;// para que siga en el mismo index del for para que lo vuelva a introducir
			}
			
			catch (InputMismatchException e)
			{
				System.out.println("Hey the number you input is wrong!2222");
				input.next();// se limpia el buffer
				i--;
			}
			
			finally
			{
			//	
			}
			
			
			
		}
		

	}

}
