package minitest;

import org.junit.Test;

public class TestFizzBuzz {
	/*
	 * print number from 1 to 100, 
	 * if the number can be divisible by 3, print Fizz 
	 * if the number can be divisible by 5, print Buzz 
	 */
	@Test
	public void testCase1()  {
		FizzBuzz myFizzBuzz1 = new FizzBuzz();
		myFizzBuzz1.myFizzBuzz1();
		
	}
	
	
	/*
	 * print number from 1 to 100, 
	 * if the number can be divisible by 3 or includes digit 3, print Fizz 
	 * if the number can be divisible by 5 or includes digit 5, print Buzz 
	 */
	@Test
	public void testCase2() {
		FizzBuzz myFizzBuzz2 = new FizzBuzz();
		myFizzBuzz2.myFizzBuzz2();
	}
}
