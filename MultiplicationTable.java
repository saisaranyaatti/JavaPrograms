package com.hello;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter a number");
	 int n = sc.nextInt();
	 System.out.println("enter starting range");
	 int start= sc.nextInt();
	 System.out.println("enter ending range");
	 int end = sc.nextInt();
	 for(int i = start; i<=end; i++)
	 {
		 System.out.println(n+"*"+i+"="+n*i);
	 }
	}

}
