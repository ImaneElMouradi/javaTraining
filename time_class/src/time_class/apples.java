
package time_class;

import java.util.Scanner;

public class apples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		tuna tunaObject = new tuna();

		System.out.println("Insert hour: ");
		int h = scanner.nextInt();

		System.out.println("Insert minute: ");
		int m = scanner.nextInt();

		System.out.println("Insert second: ");
		int s = scanner.nextInt();

		tunaObject.setTime(h, m, s);
		String result = tunaObject.toMilitary();
		System.out.println(result);
		System.out.println(tunaObject.toNormal());
	}

}
