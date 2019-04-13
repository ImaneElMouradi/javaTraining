
public class TestImplement {

	public static void main(String[] args) {
		/*MonImplement o = new MonImplement();
		
		o.f();
		System.out.println(o.x);
		*/
		
		MonImplement o = new MonImplement();
		o.f();
		System.out.println(o.x);
		
		// pour la g on ne peut pas use MonInterface, car la fct
		// n'est pas declare dans linterface MonInterface
		o.g();

	}

}
