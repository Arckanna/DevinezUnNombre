package com.ivray.find_a_number;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class App {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Declarative part
		int nbToFind = 0;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int nbEnter = 0;
		int nbTrial = 0;

		// Processing part
		System.out.println("Welcome ! ");
		nbToFind = random.nextInt(100) + 1;

		while (nbEnter != nbToFind) {
			nbTrial++;
			nbEnter = askNumber("Enter a number between 1 and 100", 1, 100);

			if (nbEnter > nbToFind) {
				System.out.println("Smaller");
			} else if (nbEnter < nbToFind) {
				System.out.println("Bigger");
			} else {
				System.out.println("GG! You win in " + nbTrial + " trial.");
			}
		}
		scanner.close();

	}

	private static int askNumber(String message, int min, int max) {
		int nbValue = min - 1;

		do {
			System.out.println(message);
			try {
				nbValue = scanner.nextInt();
			} catch (NoSuchElementException e) {
				System.out.println("Please enter a number");
				scanner.next();
			} catch (IllegalStateException e) {
				System.out.println("Please enter a number");
				System.exit(-1);
			}

		} while (nbValue < min || nbValue > max);
		return nbValue;

	}

}
