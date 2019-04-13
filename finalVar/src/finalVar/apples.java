package finalVar;

public class apples {

	public static void main(String[] args) {
		tuna tunaObj = new tuna(10);

		for (int i = 0; i < 100; i++) {
			tunaObj.addNum();
			System.out.printf("%s", tunaObj); // it's gonna look for the "toString" method in the tuna class

		}

	}

}
