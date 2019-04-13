package enumeration;

//here we're gonna declare a bunch of constants!

public enum tuna {
	imane("bitch", "19"), // these are constants but also objects!
	// you can also get a build in array with nameenum.values() here tuna.values().
	imad("childish", "19"), 
	clerc("horny", "30"), 
	thomas("kind", "22"), 
	antoine("colle", "21"), 
	nikolai("love", "25");

	// now let's define what's inside or java is gonna go crazy

	private final String desc; // as in description of the character
	private final String old; // how old is the person

	// enum constructor

	tuna(String description, String yearOld) {
		
		desc = description;
		old = yearOld;
	}

	public String getDesc() {
		return desc;
	}

	public String getOld() {
		return old;
	}

}
