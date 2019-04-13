import java.util.Random;

public class DicePlay {

	public static void main(String[] args) {
		Random r = new Random();
		int number;
		for (int counter = 1; counter <= 10; counter++) {
			number = 1 + r.nextInt(6);
			System.out.println(number);
		}

	}

}
