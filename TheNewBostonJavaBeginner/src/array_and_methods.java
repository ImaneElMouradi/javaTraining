
public class array_and_methods {
	public static void main(String[] args) {
		int tableau[] = { 5, 6, 7, 8, 9 };
		add5(tableau);
		for (int element : tableau) {
			System.out.println(element);
		}

	}

	public static void add5(int array[]) {
		for (int c = 0; c < array.length; c++) {
			array[c] += 5;
		}

	}

}
