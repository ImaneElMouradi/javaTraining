package game1;

import java.util.Random;

public class TestRand {

	public static void main(String[] args) {
		Random rand = new Random();

		for (int c = 0; c < 100; c++) {
			System.out.println(Math.abs(rand.nextInt(100)));
		}
	}

}
