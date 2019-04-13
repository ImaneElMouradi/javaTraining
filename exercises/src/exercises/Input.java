package exercises;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = in.nextInt();

		System.out.print("Input second number: ");
		int num2 = in.nextInt();

		System.out.println(num1 + " x " + num2 + " = " + num1 * num2);

	}

}

/*
 * TRAIN INPUT 1/ you should import the scanner class ; 2/ In the general
 * method, write "Scanner in = new Scanner(System.in);" 3/then we can gather the
 * infos from inputs by : " int numberInput = in.nextInt()"
 */