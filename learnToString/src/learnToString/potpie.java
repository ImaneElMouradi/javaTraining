package learnToString;

public class potpie {
	private int day;
	private int month;
	private int year;

	public potpie(int d, int m, int y) { // a constructor
		day = d;
		month = m;
		year = y;

		System.out.printf("%s", this); // this call the constructor, it also needs to replace %s
										// which is a string, so it looks for toString method
	}

	public String toString() { // our method here overrides
		return String.format("%02d/%02d/%d", day, month, year);

	} // so everytime we need a string, java is gonna use this one!

}
