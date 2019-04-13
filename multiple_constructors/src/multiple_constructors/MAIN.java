package multiple_constructors;

public class MAIN {

	public static void main(String[] args) {
		method methObj = new method();
		method methObj1 = new method(15);
		method methObj2 = new method(14, 58);
		method methObj3 = new method(19, 47, 36);

		System.out.println(methObj + "\n" + methObj1 + "\n" + methObj2 + "\n" + methObj3);

	}

}
