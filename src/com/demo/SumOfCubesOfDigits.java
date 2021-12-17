package com.demo;
import java.util.*;

public class SumOfCubesOfDigits
{
	static int sumCubesofDigits(int number)
	{
		int resultant=0;
		while(number!=0)
		{
			int digit = number%10;				//performs on one digit
			resultant += digit*digit*digit; 	//incrementing cube of digits 
			number=number/10;					//gets next digit
		}
		return resultant;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	//Scanner object for input 
		System.out.println("Enter a number: ");
		int a=sc.nextInt();						//obtains user entered values
		sc.close();
		
		System.out.println(sumCubesofDigits(a)); //calling the method
		
	}
}
