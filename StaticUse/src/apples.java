
public class apples {

	public static void main(String[] args) {
		tuna member1 = new tuna("Imane", "El mouradi");
		tuna member2 = new tuna("Imane", "El mouradi");
		tuna member3 = new tuna("Imane", "El mouradi");
		tuna member4 = new tuna("Imane", "El mouradi");
		tuna member5 = new tuna("Imane", "El mouradi");
		tuna member6 = new tuna("Imane", "El mouradi");

		System.out.println(tuna.getMembers()); // with a static method, you can use it directly by using the
		// class name
		// no need for objects unlike normal methods ( and constructors )

	}

}
