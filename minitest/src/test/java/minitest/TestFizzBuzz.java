package minitest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFizzBuzz {
	/*
	 * test function myFizzBuzz1 
	 * if the number can be divisible by 3, print Fizz 
	 * if the number can be divisible by 5, print Buzz 
	 */
	@Test
	public void testCase1()  {
		FizzBuzz myFizzBuzz1 = new FizzBuzz();
		System.out.println(myFizzBuzz1.myFizzBuzz1(3));
		assertEquals(myFizzBuzz1.myFizzBuzz1(3),"Fizz");
		
		System.out.println(myFizzBuzz1.myFizzBuzz1(5));
		assertEquals(myFizzBuzz1.myFizzBuzz1(5),"Buzz");
		
		System.out.println(myFizzBuzz1.myFizzBuzz1(15));
		assertEquals(myFizzBuzz1.myFizzBuzz1(15),"FizzBuzz");
		
		System.out.println(myFizzBuzz1.myFizzBuzz1(1));
		assertEquals(myFizzBuzz1.myFizzBuzz1(1),"1");
		
		System.out.println(myFizzBuzz1.myFizzBuzz1(-1));
		assertEquals(myFizzBuzz1.myFizzBuzz1(-1),"-1");
		
		System.out.println(myFizzBuzz1.myFizzBuzz1(0));
		assertEquals(myFizzBuzz1.myFizzBuzz1(0),"FizzBuzz");
		
		
	}
	
	
	/*
	 * test function myFizzBuzz2 
	 * if the number can be divisible by 3 or includes digit 3, print Fizz 
	 * if the number can be divisible by 5 or includes digit 5, print Buzz 
	 */
	@Test	
	public void testCase2() {
		FizzBuzz myFizzBuzz2 = new FizzBuzz();
		System.out.println(myFizzBuzz2.myFizzBuzz2(3));
		assertEquals(myFizzBuzz2.myFizzBuzz2(3),"Fizz");
		
		System.out.println(myFizzBuzz2.myFizzBuzz2(5));
		assertEquals(myFizzBuzz2.myFizzBuzz2(5),"Buzz");
		
		System.out.println(myFizzBuzz2.myFizzBuzz2(15));
		assertEquals(myFizzBuzz2.myFizzBuzz2(15),"FizzBuzz");
		
		System.out.println(myFizzBuzz2.myFizzBuzz2(31));
		assertEquals(myFizzBuzz2.myFizzBuzz2(31),"Fizz");
		
		System.out.println(myFizzBuzz2.myFizzBuzz2(35));
		assertEquals(myFizzBuzz2.myFizzBuzz2(35),"FizzBuzz");
		
		System.out.println(myFizzBuzz2.myFizzBuzz2(52));
		assertEquals(myFizzBuzz2.myFizzBuzz2(52),"Buzz");
		
		System.out.println(myFizzBuzz2.myFizzBuzz2(54));
		assertEquals(myFizzBuzz2.myFizzBuzz2(54),"FizzBuzz");
		
		System.out.println(myFizzBuzz2.myFizzBuzz2(1));
		assertEquals(myFizzBuzz2.myFizzBuzz2(1),"1");
		
		System.out.println(myFizzBuzz2.myFizzBuzz2(-1));
		assertEquals(myFizzBuzz2.myFizzBuzz2(-1),"-1");
		
		System.out.println(myFizzBuzz2.myFizzBuzz2(0));
		assertEquals(myFizzBuzz2.myFizzBuzz2(0),"FizzBuzz");	
		
	}
}
