package practica2;

public class main {

	public static void main(String[] args) {
		try {
//			Nat uno=new Nat(11);
//			Nat dos =new Nat(2);
//			uno.sumar(dos);
//			System.out.print(uno);
			Conjunto<Integer> hola = new Conjunto<Integer>();
			Conjunto<Integer> chau = new Conjunto<Integer>();
			Conjunto<Integer> ok;
			hola.agregar(2);
			hola.agregar(3);
			hola.agregar(4);
			chau.agregar(1);
			chau.agregar(2);

			
			hola.imprimir();
			chau.imprimir();
			hola.interseccion(chau);
			hola.imprimir();
			ok=hola.interseccion2(chau);
			ok.imprimir();
		}catch(Exception e) {
			throw e;
		}
		
		

	}

}
