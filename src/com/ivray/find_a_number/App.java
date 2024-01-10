package com.ivray.find_a_number;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Declarative part
		int nbToFind = 0;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int nbEnter =0;
		int nbTrial = 0;
		
		//Processing part	
		System.out.println("Welcome ! Please enter a number between 1 and 100");
		nbToFind = random.nextInt(100) + 1;
		nbEnter = scanner.nextInt();
		
		if (nbEnter > nbToFind) {
			System.out.println("Smaller");
		}else if (nbEnter < nbToFind) {
			System.out.println("Bigger");
		}else {
			System.out.println("GG! You win in " + nbTrial + " trial.");
		}
		
	}

}
