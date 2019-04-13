package finalVar;

public class tuna {
	private int sum;
	private final int NUMBER; // final means that it's a CONSTANT VAR ( we usually put in CAPS )
								// "C"onstant|"C"aps

	public tuna(int x) {
		NUMBER = x;
	}

	public void addNum() {
		sum += NUMBER;
	}

	public String toString() {
		return String.format("sum = %d\n", sum);

	}
}
