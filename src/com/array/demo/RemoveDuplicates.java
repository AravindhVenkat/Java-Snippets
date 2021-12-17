package com.array.demo;

import java.util.*;
public class RemoveDuplicates
{
	static void modifyArray(int []ar)
	{
		int len=ar.length;
		Arrays.sort(ar);  //sorted array so that, can easily remove the duplicates
		int temp[]=new int[len];
		int j=0;
		
		for(int i=0;i<len-1;i++)
		{
			if(ar[i]!=ar[i+1])
			{
				temp[j++]=ar[i];
			}
		}
		temp[j]=ar[len-1];
		
		for(int i=j;i>=0;i--)
		{
			System.out.print(temp[i]+" ");
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter array elements:");		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array after removing duplicates: ");
		modifyArray(arr);
		sc.close();
	}
}