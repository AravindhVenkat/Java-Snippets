package com.array.demo;

import java.util.Arrays;
import java.util.Scanner;

public class SortStrings
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the size of the array");
		
		int n=sc.nextInt();
		
		
		int a[]=new int[n];
		int i,r;
		
		System.out.println("Enter the elements of the array");
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}		
		
		for(i=0;i<n;i++)
		{
			int rev=0;
			while(a[i]!=0)
			{
				r=a[i]%10;
				rev=rev*10+r;
				a[i]=a[i]/10;
			}
			a[i]=rev;
		}
		
		System.out.println("Reversed NRS: ");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		Arrays.sort(a);
		System.out.println("In Sorted order: ");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+a[i]);
		}
		

	}
}
