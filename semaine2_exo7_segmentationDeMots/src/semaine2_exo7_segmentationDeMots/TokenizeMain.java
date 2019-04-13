package semaine2_exo7_segmentationDeMots;

import java.util.Scanner;

public class TokenizeMain {

	public static void main(String[] args) {
		String phrase;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrez une chaine :");
		phrase = scanner.nextLine();
		
		
		TokenizableString toToken = new TokenizableString(phrase);
		toToken.tokenize();
		

	}

}
