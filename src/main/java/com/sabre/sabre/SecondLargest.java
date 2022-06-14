package com.sabre.sabre;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a = {100,95,87,102,11,0,5};
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<first)
			{
				second = first;
				first = a[i];
			}
			else if(a[i]<second && a[i]>first)
			{
				second = a[i];
			}
		}
		
		System.out.println("Second largest value:" + second);

	}

}
