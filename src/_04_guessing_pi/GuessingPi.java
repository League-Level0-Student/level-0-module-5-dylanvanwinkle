package _04_guessing_pi;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class GuessingPi {
	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {

		String pi = "3.141592653589793238462643383279502884197169399375105820";
		// 2. Make a String variable to hold the value of Pi.
		// Get the first few digits from http://www.piday.org/million/.

		// 3. Print out the first 3 digits of Pi to the console.
		// The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
		// Run your program to see how this works.
		System.out.print(pi.charAt(0));
		System.out.print(pi.charAt(1));
		System.out.print(pi.charAt(2));
		System.out.println(pi.charAt(3));
		// 9. If you want to give the user more than one chance to guess,
		// put a for loop around steps 4-8.

		// 4. Create a for loop that will step through each digit of pi (steps 5-8)
		// NOTE: The number of digits in your string will be
		// yourStringVariable.length()
		Scanner s = new Scanner(System.in);
		int trys = 2;
		int score = 0;
		for (int i = 4; i < pi.length(); i++) {

			// 5. Ask the user for the NEXT digit of pi.
			System.out.println("What is the next digit of pi.");
			String Input = s.nextLine();
			if (Input.length() == 1) {

				// 6. Compare the user's input to the next digit of your pi variable
				// (look at step 3 for a clue).
				// HINT: use charAt(0) to get 1st char of user input String
				if (Input.charAt(0) == pi.charAt(i)) {
					System.out.println("correct");
					trys = 2;
					score++;
					if (score == 52) {
						System.out.println("You win!!!");
						break;
					}
				} else {
					System.out.println("incorrect");
					if (score > 0 && trys == 1) {
						score--;
					}
					if (trys > 1) {
						System.out.println("Do you want to keep trying(yes or no)");
						Input = s.nextLine();
						if (Input.equalsIgnoreCase("no")) {
							break;
						}
						i--;
						trys--;
						System.out.println("You have " + trys + " try left.");
					} else {
						break;
					}
				}
				// 7. If they are correct, print out "correct".

				// 8. If they are not, print out "incorrect" and tell them
				// to start over. Use 'break;' to break out of the loop.
			} else {
				i--;
				System.out.println("Invaid input try again.");
			}
		}
		System.out.println("Your score is " + score);
	}
}