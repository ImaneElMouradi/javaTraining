import java.util.Scanner;

public class TestPileFinal {

	public static void main(String[] args) {
		int correct = 1;
		
		String ouvr ="(<[{", ferm = ")>]}", strInput;
		int indexOuvr=0, indexFerm=0;
		
		Pile p = new Pile();
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Entrer une expression: ");
		strInput = clavier.next();
		
		for(int i=0 ; i < strInput.length(); i++) {
			for(int j=0 ; j < ouvr.length(); j++) {
				if(strInput.charAt(i) == ouvr.charAt(j) ) {
					try {
						p.empiler(strInput.charAt(i));
					}
					catch(ExceptionPileOverflow e ) {
						System.out.println("Pile pleine");
						e.printStackTrace();
					}
					
				}
				
				if(strInput.charAt(i) == ferm.charAt(j)) {
					if(!p.estVide()) {
						try {
							if(p.sommet() == ouvr.charAt(j)) {
							p.depiler();
							}
						}
						catch(ExceptionPileUnderflow e ) {
							System.out.println("Pile vide");
							e.printStackTrace();
						}
						
					}
					else
						correct =0;
				}				
			}		
		}	
		if(p.estVide( ) && correct==1) {
			System.out.println("L'expression est bien parenthésée.");
		}
		else
			System.out.println("L'expression n'est pas bien parenthésée.");
	}
	
}




