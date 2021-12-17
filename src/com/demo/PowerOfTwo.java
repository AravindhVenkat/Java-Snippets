package com.demo;

import java.util.Scanner;

public class PowerOfTwo
{
	static boolean checkNumber(int number)
	{
		return (int)(Math.ceil((Math.log(number) / Math.log(2)))) == (int)(Math.floor(((Math.log(number) / Math.log(2)))));
	}
	public static void main(String[] args)
	{
		System.out.println("Enter Number:");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		sc.close();
		
		{
			if (checkNumber(num))
				System.out.println(num +" is a power of 2");
			else
				System.out.println("No, it is not a power of 2");
		}			
	}
}
