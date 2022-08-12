package com.hello;
import java.util.*;

public class DigitsSum {
	public int digitSumRecursion(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else
		{
			return n%10+digitSumRecursion(n/10);
		}
	}
	public int digitSumWithoutRecursion(int n)
	{
		int sum =0;
		int rem;
		while(n>0)
		{
		 rem = n%10;
		 sum = sum+rem;
		 n = n/10;
		}
		return sum;
	}
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	DigitsSum ds = new DigitsSum();
	System.out.println("Sum of Digits of given number is "+ds.digitSumRecursion(x));
	System.out.println("Sum of Digits of given number without recursion is  "+ds.digitSumWithoutRecursion(x));
	}

}
