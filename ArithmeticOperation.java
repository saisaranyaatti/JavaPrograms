package com.hello;
import java.util.*;

public class ArithmeticOperation {
	private int a;
	private int b;
	public ArithmeticOperation(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int add()
	{
		return this.a+this.b;
	}
	public int sub()
	{
		return this.a-this.b;
	}
	public int mul()
	{
		return this.a*this.b;
	}
	public int div()
	{
		return this.a/this.b;
	}
	public int mod()
	{
		return this.a%this.b;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		ArithmeticOperation ao = new ArithmeticOperation(x,y);
		System.out.println("Addition is "+ao.add());
		System.out.println("substraction is "+ao.sub());
		System.out.println("multiplication is "+ao.mul());
		System.out.println("division is "+ao.div());
		System.out.println("modulus is "+ao.mod());
		
	}

}
