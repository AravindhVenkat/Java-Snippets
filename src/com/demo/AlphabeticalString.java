package com.demo;

import java.util.Scanner;

public class AlphabeticalString
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str= sc.next();

		char[] ch = str.toCharArray();
		boolean flag=true;

		for(int i=0;i<str.length()-1;i++)
		{
			if(ch[i]>ch[i+1])
			{
				flag=false;
				break;
			}			
		}

		sc.close();

		if(flag==true)
		{
			System.out.println("Positive String"); //abc
		}
		else
		{
			System.out.println("Not positive"); //cba, acb, bca
		}		
	}	
}