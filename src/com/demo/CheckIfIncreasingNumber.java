package com.demo;

import java.util.*;
public class CheckIfIncreasingNumber
{
	static boolean checkNumber(int number)
	{
		int currentdigit = number%10;
		boolean flag = false;
		number = number/10;
		while (number>0)
		{
			if(currentdigit<=number%10)
			{
				flag = true;
				break;
			}
			currentdigit = number%10;
			number=number/10;
		}
		return flag;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		sc.close();
		
		//ternary operator
		String str = checkNumber(num)?"NOT an Increasing number":"Increasing number"; 
		//123 - Increasing number ; 412 - Not Increasing number
		
		System.out.println(str);
	}
}
