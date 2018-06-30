package minitest;

public class FizzBuzz {

	/*
	 * print number from 1 to 100, 
	 * if the number can be divisible by 3, print Fizz 
	 * if the number can be divisible by 5, print Buzz 
	 */	
	public void myFizzBuzz1()  {
		int i = 0;
		boolean isDivBy3or5 = false;

		//loop from 1 to 100
		for (i = 1; i <= 100; i++) {
			isDivBy3or5 = false;

			//if the number can be divisible by 3, print Fizz 
			if (i % 3 == 0) {
				System.out.print("Fizz");
				isDivBy3or5 = true;
			}

			//if the number can be divisible by 5, print Buzz
			if (i % 5 == 0) {
				isDivBy3or5 = true;
				System.out.print("Buzz");
			}

			//println normal number or switch to next line 
			if (isDivBy3or5) {
				System.out.println("");
			} else {
				System.out.println(i);
			}

		}
		
	}
	
	
	/*
	 * print number from 1 to 100, 
	 * if the number can be divisible by 3 or includes digit 3, print Fizz 
	 * if the number can be divisible by 5 or includes digit 5, print Buzz 
	 */	
	public void myFizzBuzz2() {
		int i = 0;
		String digits = "";
		boolean isDivBy3or5 = false;

		//loop from 1 to 100
		for (i = 1; i <= 100; i++) {
			digits = String.valueOf(i);
			isDivBy3or5 = false;

			//if the number can be divisible by 3 or have 3 in it, print Fizz 
			if (i % 3 == 0 || digits.indexOf("3") != -1) {
				isDivBy3or5 = true;
				System.out.print("Fizz");
			}

			//if the number can be divisible by 5 or have 5 in it, print Buzz
			if (i % 5 == 0 || digits.indexOf("5") != -1) {
				isDivBy3or5 = true;
				System.out.print("Buzz");
			}
			
			//println normal number or switch to next line 
			if (isDivBy3or5) {
				System.out.println("");
			} else {
				System.out.println(i);
			}

		}
	}
}
