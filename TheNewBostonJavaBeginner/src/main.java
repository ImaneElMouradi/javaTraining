import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		method1 Obj = new method1();
		System.out.println("Please, enter your name: ");
		String Name = input.nextLine();
		Obj.msg(Name);

	}

}
