package minitest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest2 {

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
	public final void testMyFizzBuzz2Case1() {
		System.out.println("3:" + testObject.myFizzBuzz2(3));
		assertEquals(testObject.myFizzBuzz2(3), "Fizz");
	}
	
	//test number is divisible by 5
	@Test
	public final void testMyFizzBuzz2Case2() {

		System.out.println("5:" + testObject.myFizzBuzz2(5));
		assertEquals(testObject.myFizzBuzz2(5), "Buzz");

	}

	//test number is divisible by 3 and 5
	@Test
	public final void testMyFizzBuzz2Case3() {

		System.out.println("15:" + testObject.myFizzBuzz2(15));
		assertEquals(testObject.myFizzBuzz2(15), "FizzBuzz");

	}

	//test number with tens place is 3
	@Test
	public final void testMyFizzBuzz2Case4() {

		System.out.println("31:" + testObject.myFizzBuzz2(31));
		assertEquals(testObject.myFizzBuzz2(31), "Fizz");

	}

	//test number with tens place is 3 and divisible by 5
	@Test
	public final void testMyFizzBuzz2Case5() {

		System.out.println("35:" + testObject.myFizzBuzz2(35));
		assertEquals(testObject.myFizzBuzz2(35), "FizzBuzz");

	}

	//test number with tens place is 5
	@Test
	public final void testMyFizzBuzz2Case6() {

		System.out.println("52:" + testObject.myFizzBuzz2(52));
		assertEquals(testObject.myFizzBuzz2(52), "Buzz");

	}

	//test number with tens place is 5 and ones place is 3
	@Test
	public final void testMyFizzBuzz2Case7() {

		System.out.println("53:" + testObject.myFizzBuzz2(53));
		assertEquals(testObject.myFizzBuzz2(53), "FizzBuzz");

	}

	//test number with tens place is 5 and divisible by 3
	@Test
	public final void testMyFizzBuzz2Case8() {

		System.out.println("54:" + testObject.myFizzBuzz2(54));
		assertEquals(testObject.myFizzBuzz2(54), "FizzBuzz");

	}

	//test number is not divisible by 3 and 5 and don't have 3 or 5 in it
	@Test
	public final void testMyFizzBuzz2Case9() {

		System.out.println("1:" + testObject.myFizzBuzz2(1));
		assertEquals(testObject.myFizzBuzz2(1), "1");

	}

	//test minus number, border test
	@Test
	public final void testMyFizzBuzz2Case10() {

		System.out.println("-1:" + testObject.myFizzBuzz2(-1));
		assertEquals(testObject.myFizzBuzz2(-1), "-1");

	}

	//test number 0, border test
	@Test
	public final void testMyFizzBuzz2Case11() {

		System.out.println("0:" + testObject.myFizzBuzz2(0));
		assertEquals(testObject.myFizzBuzz2(0), "FizzBuzz");

	}
	
	//test number with ones place is 3
	@Test
	public final void testMyFizzBuzz2Case12() {

		System.out.println("13:" + testObject.myFizzBuzz2(13));
		assertEquals(testObject.myFizzBuzz2(13), "Fizz");

	}

	//test number with tens place is 3 and divisible by 5
	@Test
	public final void testMyFizzBuzz2Case13() {

		System.out.println("30:" + testObject.myFizzBuzz2(30));
		assertEquals(testObject.myFizzBuzz2(30), "FizzBuzz");

	}
}
