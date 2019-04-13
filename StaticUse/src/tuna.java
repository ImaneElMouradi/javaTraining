
public class tuna {
	private String first;
	private String last;
	private static int members = 0; // static means it's the same for all objects, if we change it
	// it changes for all objects

	public tuna(String fn, String ln) {
		first = fn;
		last = ln;
		members++; // we increase the number of members each time someone register

		System.out.printf("New member : %s %s. Number of members : %d\n", first, last, members);
	}

	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}

	public static int getMembers() { // this a static method, you can use it in other classes WITHOUT OBJECTS
		return members;
	}
}
