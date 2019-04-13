package coursera_sem1_exo3;

import java.util.Scanner;

public class Geometrie {

	private static Scanner clavier = new Scanner(System.in);
	
	public static void main(String[] args) {

		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		Triangle t = new Triangle();
		
		initPoint(p1);
		initPoint(p1);
		initPoint(p1);
		
		
		t.setSommets(p1,  p2,  p3);
		
		double perimetre = t.calculerPerimetre();
		System.out.println("Perimetre : " + perimetre);
		
		boolean isocele = t.testerIsocele();
		if (isocele)
			System.out.println("Le triangle est isocèle.");
		else
			System.out.println("Le triangle n'est pas isocèle.");
	}
	
	
	
	static void initPoint(Point p) {
		double x=0, y=0;
		
		System.out.println("Construction d'un nouveau point");
		
		System.out.println("    Veuillez entrer x : ");
		x = clavier.nextDouble();
		
		System.out.println("    Veuillez entrer y : ");
		y = clavier.nextDouble();
		
		p.init(x,y);
	}
	
}
