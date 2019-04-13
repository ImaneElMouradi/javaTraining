package coursera_sem1_exo2;

import java.util.Scanner;

public class Spectateur {
	private final static Scanner clavier = new Scanner(System.in);

	private int age, argent;
	
	
	public void arriver() {
		System.out.println("[SPECTATEUR] (j'entre en scène )");
	
		System.out.println("Quel âge ai-je ? ");
		age = clavier.nextInt();
		
		do {
			System.out.println("Combien d'argent ai-je en poche (<100) ? ");
			argent = clavier.nextInt();
		}while(argent>100);
		System.out.println("[SPECTATEUR] ( j'ai un montant qui convient )");
		
		
		
	}
	
	
	
	public void ecrire(Papier billet) {
		System.out.println("[SPECTATEUR] (j'écris le papier)");
	
		billet.ecrire(age, argent);
	}
	
	

	
}
