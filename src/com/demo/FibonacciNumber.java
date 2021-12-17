package com.demo;

import java.util.*;
public class FibonacciNumber
{
	static int fibonacciNumberOfNthTerm(int number)
	{
		int firstTerm =1;
		int secondTerm =1;
		int thirdTerm =0;
		for(int i=3;i<=number;i++)
		{
			thirdTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
		}
		return thirdTerm;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number= sc.nextInt();
		sc.close();
		System.out.println(fibonacciNumberOfNthTerm(number));
	}
}
