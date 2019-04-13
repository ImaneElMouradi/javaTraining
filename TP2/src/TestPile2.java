/* import java.util.Scanner;

public class TestPile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d=1;
		Pile p = new Pile();
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Entrer une expression : ");
		String str = clavier.next();
		
		
		int i = 0;
				
		while(str.charAt(i) != '#') {
			//or while(i<str.length())
			
			
			if(str.charAt(i) == '(') {
				try {
					p.empiler(str.charAt(i));
				}
				catch(ExceptionPileOverflow e) {
					System.out.println("Pile pleine");
					e.printStackTrace();
				}
				
			}
			if(str.charAt(i) == ')') {
				if(!p.estVide()) {
					try {
						p.depiler();
					}
					catch(ExceptionPileUnderflow e) {
						System.out.println("Pile vide");
						e.printStackTrace();
					}
					
				}
				else 
					d=0;
					
			}
			i++;
			
		}
		
		if(p.estVide( ) && d==1) {
			System.out.println("L'expression est bien parenthésée.");
		}
		else
			System.out.println("L'expression n'est pas bien parenthésée.");
	
		
		
		
	}

}
*/