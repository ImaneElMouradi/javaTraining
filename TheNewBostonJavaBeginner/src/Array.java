import java.util.Random;

public class Array {
	public static void main(String[] args) {

		Random r = new Random();
		int num;

		int tableau[] = new int[10];
		for (int counter = 0; counter < 10; counter++) {
			num = r.nextInt(200);
			tableau[counter] = num;
		}
		System.out.println(tableau[2]);

		// OOOORRRRR

		int tableau2[] = { 2, 5, 8, 17, 263, 89, 14 };
		System.out.println(tableau2[6]);

	}
}
