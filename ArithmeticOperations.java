package com.hello;

import java.util.*;

public class ArithmeticOperations {
	static int add(int a,int b)
	{
		return a+b;
	}
	static int sub(int a, int b)
	{
		return a-b;
	}
	static int mul(int a, int b)
	{
		return a*b;
	}
	static int div(int a, int b)
	{
		return a/b;
	}
	static int mod(int a, int b)
	{
		return a%b;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("addition is "+ add(a,b));
		System.out.println("substraction is "+ sub(a,b));
		System.out.println("multiplication is "+ mul(a,b));
		System.out.println("dividion is "+ div(a,b));
		System.out.println("modulus is "+ mod(a,b));	
	}

}
