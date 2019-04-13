package enumeration;

import java.util.EnumSet;

public class apples {

	public static void main(String[] args) {
		System.out.println("Name\tDesc\tAge");
		for (tuna element : tuna.values()) { // tuna is enum
			// tuna.values() is an array of tuna's constant variable
			System.out.printf("%s\t%s\t%s\n", element, element.getDesc(), element.getOld());
		}
		System.out.println("\n\n\n");
		// EnumSet class
		for (tuna e : EnumSet.range(tuna.imad, tuna.antoine)) {

			System.out.printf("%s\t%s\t%s\n", e, e.getDesc(), e.getOld());

		}

	}

}
