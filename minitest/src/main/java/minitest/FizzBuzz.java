package minitest;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		String printContent = "";
		FizzBuzz myFizzBuzz = new FizzBuzz();

		// Case 1:loop from 1 to 100
		for (i = 1; i <= 100; i++) {
			// Call myFizzBuzz1 to judge if the number can be divisible by 3 or 5
			printContent = myFizzBuzz.myFizzBuzz1(i);
			System.out.println(printContent);

		}
		
		// Case 2: loop from 1 to 100
		for (i = 1; i <= 100; i++) {
			// Call myFizzBuzz2 to judge if the number can be divisible by 3 or 5, and have digit 3 or 5
			printContent = myFizzBuzz.myFizzBuzz2(i);
			System.out.println(printContent);

		}
	}

	/*
	 * This method returns string "Fizz" if the input number can be divisible by 3, 
	 * return "Buzz" if the number can be divisible by 5.
	 * 
	 * @param number The number to be judged
	 * @return printResult returns input nubmer or Fizz Buzz.
	 */
	public String myFizzBuzz1(int number) {
		boolean isDivBy3or5 = false;
		String printResult = "";

		// if the number can be divisible by 3, print Fizz
		if (number % 3 == 0) {
			isDivBy3or5 = true;
			printResult = "Fizz";
		}

		// if the number can be divisible by 5, print Buzz
		if (number % 5 == 0) {
			isDivBy3or5 = true;
			printResult = printResult + "Buzz";
		}
		
		if (!isDivBy3or5) {
			printResult = String.valueOf(number);
		}

		return printResult;

	}

	/*
	 * This method returns string "Fizz" if the input number can be divisible by 3 or includes
	 * digit 3, return "Buzz" if the number can be divisible by 5 or includes digit 5.
	 * 
	 * @param number The number to be judged
	 * @return printResult returns input nubmer or Fizz Buzz.
	 */
	public String myFizzBuzz2(int number) {
		boolean isDivBy3or5 = false;
		String printResult = "";
		String digits = String.valueOf(number);

		// if the number can be divisible by 3 or have 3 in it, print Fizz
		if (number % 3 == 0 || digits.indexOf("3") != -1) {
			isDivBy3or5 = true;
			printResult = "Fizz";
		}

		// if the number can be divisible by 5 or have 5 in it, print Buzz
		if (number % 5 == 0 || digits.indexOf("5") != -1) {
			isDivBy3or5 = true;
			printResult = printResult + "Buzz";
		}

		if (!isDivBy3or5) {
			printResult = String.valueOf(number);
		}

		return printResult;
		
		
	}
}
