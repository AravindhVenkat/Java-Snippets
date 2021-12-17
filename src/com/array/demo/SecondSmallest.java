package com.array.demo;

import java.util.*;
public class SecondSmallest
{
	
	static int getSecondSmallest (int ar[])
	{		
		Arrays.sort(ar); 
		return ar[1]; //index 1 is the second element
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();		
		
		int arr[]=new int[n];
		System.out.println("Enter the array elements");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(getSecondSmallest(arr));
		sc.close();
	}
}