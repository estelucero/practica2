package practica2;

public class main {

	public static void main(String[] args) {
		try {
//			Nat uno=new Nat(11);
//			Nat dos =new Nat(2);
//			uno.sumar(dos);
//			System.out.print(uno);
//			Conjunto<Integer> hola = new Conjunto<Integer>();
//			Conjunto<Integer> chau = new Conjunto<Integer>();
//			Conjunto<Integer> ok;
//			hola.agregar(2);
//			hola.agregar(3);
//			hola.agregar(4);
//			chau.agregar(1);
//			chau.agregar(2);
//
//			
//			hola.imprimir();
//			chau.imprimir();
//			hola.interseccion(chau);
//			hola.imprimir();
//			ok=hola.interseccion2(chau);
//			ok.imprimir();
			Diccionario<String,Integer> dic=new Diccionario<String,Integer>();
			dic.imprimir();
			dic.agregar("hola", 3);
			dic.imprimir();
			dic.agregar("cahu", 5);
			dic.imprimir();
			System.out.println(dic.eliminar("hola"));
			dic.imprimir();
			System.out.println(dic.eliminar("cahu"));
			dic.imprimir();
			System.out.println(dic.estaVacio());
			
		}catch(Exception e) {
			throw e;
		}
		
		

	}

}
