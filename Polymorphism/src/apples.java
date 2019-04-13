
public class apples {
	public static void main(String[] args) {
		// food tunaObj = new tuna();
		food bucky[] = new food[2]; // array that holds objects ( polymorphic array )
		bucky[0] = new potpie();
		bucky[1] = new tuna();

		for (int x = 0; x < 2; ++x) { // it's easier to call method upon objects this way, than doing it one by one
			bucky[x].eat();

		}

	}

}
