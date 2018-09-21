package com.emma.week4;

public class Exercise8 {

	public static void main(String[] args) {
		new Exercise8().run();
	}

	public void run() {
		// Your code goes below this line.

		// Remember charAt(..) ?
		System.out.print("Input your sentence: ");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		int len = str.length();
		String result = "";
		for (int i = len - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		System.out.print("In reverse: " + result);
		// End of code.
	}

}
