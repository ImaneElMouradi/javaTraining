package learnToString;

public class tuna {
	private String name;
	private potpie birthday; // a reference to a class WE made, wohoo it's called composition

	public tuna(String theName, potpie theDate) {
		name = theName;
		birthday = theDate;

	}

	public String toString() {
		return String.format("My name is %s , and my birthday is %s .", name, birthday);
		// here birthday is an object from potpie ( which isn't necessarily a string )
		// BUT because we need a string
		// it will look for it in the toString method!
	}

}
