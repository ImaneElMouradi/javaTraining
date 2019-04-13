import java.util.Scanner;

public class Celsius {

   public static void main(String args[]) {
      int c;
      double f;
      
      Scanner clavier = new Scanner(System.in);

      System.out.println("Donnez la temperature en celsius a convertir :");
      c = clavier.nextInt();
      

      //f = (9./5)*c + 32;
      //f = c2f(c);

      //Celc obj = new Celc();
      //f = obj.c2f(c);

      f= Celc.c2f(c);

      System.out.format("%d celsius = %.1f fahrenait \n", c, f);
      };



	static double c2f(int c){
		double f = 9.5/5 * c + 32;
		return f;
	};

}


//utilsier une classe externe 
class Celc {

	static double c2f(int c){
		double f = 9.5/5 * c + 32;
		return f;
	}


};

