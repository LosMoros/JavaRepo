package minitest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz testObject;

	@Before
	public void setUp() throws Exception {
		testObject = new FizzBuzz();
	}

	@After
	public void tearDown() throws Exception {
	}

	//test number is divisible by 3
	@Test
	public final void testMyFizzBuzz1Case1() {

		System.out.println("3:" + testObject.myFizzBuzz1(3));
		assertEquals(testObject.myFizzBuzz1(3), "Fizz");
	}

	//test number is divisible by 5
	@Test
	public final void testMyFizzBuzz1Case2() {

		System.out.println("5:" + testObject.myFizzBuzz1(5));
		assertEquals(testObject.myFizzBuzz1(5), "Buzz");
	}

	//test number is divisible by 3 and 5
	@Test
	public final void testMyFizzBuzz1Case4() {

		System.out.println("15:" + testObject.myFizzBuzz1(15));
		assertEquals(testObject.myFizzBuzz1(15), "FizzBuzz");
	}

	//test minus number, border test
	@Test
	public final void testMyFizzBuzz1Case5() {

		System.out.println("-1:" + testObject.myFizzBuzz1(-1));
		assertEquals(testObject.myFizzBuzz1(-1), "-1");
	}

	//test number 0, exception test
	@Test
	public final void testMyFizzBuzz1Case6() {

		System.out.println("0:" + testObject.myFizzBuzz1(0));
		assertEquals(testObject.myFizzBuzz1(0), "FizzBuzz");
	}

	

}
