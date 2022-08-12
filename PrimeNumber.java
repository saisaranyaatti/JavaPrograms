package com.hello;
import java.util.*;


public class PrimeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int flag = 0;
		if(n==0 || n==1)
		{
			System.out.println(n+"is not prime number");
		}
		else {
		for(int i = 2; i<=(int)Math.sqrt(n); i++)
		{
			if(n%i == 0) {
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println(n+"is not prime number");
		}
		else
		{
			System.out.println(n+"is a prime number");
		}
	}
	}
}
