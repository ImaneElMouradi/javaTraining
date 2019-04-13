import java.util.Scanner;

public class basic_calculator {

	public static void main(String[] args) {
		Scanner stock = new Scanner(System.in);
		float fnum, snum;
		System.out.println("Inserez le premier numero: ");
		fnum = stock.nextFloat();
		System.out.println("Inserez le deuxieme numero: ");
		snum = stock.nextFloat();

		System.out.println("Please choose an operation by tiping the number associated: \n 1 + \n 2- \n 3 x \n 4 /");
		int op;
		op = stock.nextInt();
		if (op == (int) op) {
			switch (op) {
			case 1:
				System.out.println(fnum + snum);
				break;
			case 2:
				System.out.println(fnum - snum);
				break;
			case 3:
				System.out.println(fnum * snum);
				break;
			case 4:
				System.out.println(fnum / snum);
				System.out.println("And the rest is: " + fnum % snum);
				break;
			default:
				System.out.println("Please choose a number from 1 to 4.");
			}
		} else {
			System.out.println("Please choose a number from 1 to 4.");
		}

	}
}