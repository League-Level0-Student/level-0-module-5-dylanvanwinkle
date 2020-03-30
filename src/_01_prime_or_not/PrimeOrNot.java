package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog(null, "Choose a number.");
	int an = Integer.parseInt(a);
	for(int i = 2; i < an; i++) {
		if(an % i == 0) {
		 JOptionPane.showMessageDialog(null, an + " is not a prime number.");
		 System.exit(0);
		}
	}
JOptionPane.showMessageDialog(null, an + " is a prime number.");
}
}
