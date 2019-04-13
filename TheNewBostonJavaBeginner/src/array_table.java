
public class array_table {

	public static void main(String[] args) {
		int tableau[] = { 32, 25, 89, 17, 56, 32, 1, 15, 64, 7 };
		int sum = 0;
		System.out.println("Index\tValue");
		for (int counter = 0; counter < tableau.length; counter++) {

			sum += tableau[counter];
			System.out.println(counter + "\t" + tableau[counter]);

		}
		System.out.println("The sum is " + sum);
	}

}
