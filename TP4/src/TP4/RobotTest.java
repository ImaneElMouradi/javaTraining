package TP4;

import java.util.Scanner;

public class RobotTest {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int d;
		
		Robot robot = new Robot();
		System.out.println(robot);
		
		/* robot.deplacer(5, 3);
		System.out.println(robot); */
		
		robot.avancer();
		System.out.println(robot);

		System.out.println("Choisissez une direction de 1 a 4:");
		d = clavier.nextInt();
				
		robot.setDirection(d);
		robot.avancer();
		System.out.println(robot);
		
		
		Point p = new Point(6,7);
		System.out.println(p);
		p=robot;
		System.out.println(p);

	}

}
