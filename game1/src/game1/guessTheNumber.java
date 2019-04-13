package game1;

import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {

	/*
	 * a game where the pc choses a number then the user has to guess what number it
	 * is ( with some help ofc ) if he can do it in less than 10 tries then he wins
	 * !
	 */

	public static void main(String[] args) {
		Random random = new Random();
		int pc = random.nextInt(100);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to my first game in java, you'll have to guess the number I chose!");
		System.out.println(
				"So to make it easy the number is an integer and it doesn't exceed 100, and you have 10 tries to win!");

		int counter = 0;

		System.out.println("Let the game begin ! \n Now, choose a number between 0 and 100: ");

		int user = scanner.nextInt();
		while (counter < 9) {
			if (user == pc) {
				System.out.println(
						"Bravo! You got the right answer. You win... nothing. I'm too poor to offer anything. " + pc);
				break;
			} else if (user < pc) {
				System.out.println("Your number is inferior to the one I chose! You should be more generous. ");
				counter += 1;
				int chance = 10 - counter;
				if (chance > 1) {
					System.out.println("You still have " + chance + " chances. \nTry again: ");
					user = scanner.nextInt();
				} else {
					System.out
							.println("You still have " + chance + " chance. \nThis is your last chance, be careful! ");
					user = scanner.nextInt();
				}

			} else {
				System.out.println("Your number is superior to the one I chose! You're way too generous. ");
				counter += 1;
				int chance = 10 - counter;
				if (chance > 1) {
					System.out.println("You still have " + chance + " chances. \nTry again: ");
					user = scanner.nextInt();
				} else {
					System.out
							.println("You still have " + chance + " chance. \nThis is your last chance, be careful! ");
					user = scanner.nextInt();
				}

			}

		}
		if (counter == 9) {
			System.out.println("We're sorry to inform you that you suck. ");
			System.out.println("The number was: " + pc);
		}

	}

}
