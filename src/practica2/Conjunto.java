package practica2;

import java.util.ArrayList;

public class Conjunto<T> {
	private ArrayList<T> conjunto;

	public Conjunto() {
		this.conjunto = new ArrayList<T>();

	}

	public Integer tamano() {
		return conjunto.size();
	}

	public void imprimir() {
		
		
		if(this.tamano()==0) {
			System.out.println("{}");
			return;
		}
		String cadena = "{";
		for (int i = 0; i < this.tamano() - 1; i++) {
			cadena += this.iesimo(i) + ",";
		}
		cadena += this.iesimo(this.tamano() - 1) + "}";
		System.out.println(cadena);
	}

	public boolean agregar(T n) {
		if (this.estaElemento(n)) {
			return false;
		} else {
			this.conjunto.add(n);
			return true;
		}
	}



	public boolean sacarObjeto(T obj) {
		if (this.estaElemento(obj)) {
			this.conjunto.remove(obj);

			return true;
		}
		return false;
	}

	public boolean estaElemento(T n) {
		return this.conjunto.contains(n);
	}

	public T iesimo(Integer i) {
		if (i < this.tamano() && i > -1) {
			return this.conjunto.get(i);
		} else {
			throw new RuntimeException("Indice invalido");
		}
	}

	public void union(Conjunto<T> c) {
		for (int i = 0; i < c.tamano(); i++) {
			this.agregar(c.iesimo(i));
		}

	}

	public Conjunto<T> union2(Conjunto<T> c) {
		Conjunto<T> salida = new Conjunto<T>();

		for (int i = 0; i < c.tamano(); i++) {
			salida.agregar(c.iesimo(i));
		}
		for (int i = 0; i < this.tamano(); i++) {
			salida.agregar(this.iesimo(i));
		}
		return salida;

	}

	public void interseccion(Conjunto<T> c) {
		ArrayList<T> salida =new ArrayList<T>();
		for (int i = 0; i < c.tamano(); i++) {
			if (this.estaElemento(c.iesimo(i))) {
				salida.add(c.iesimo(i));
			}
		}
		this.conjunto=(ArrayList<T>) salida.clone();

	}
	public Conjunto<T> interseccion2(Conjunto<T> c) {
		Conjunto<T> salida =new Conjunto<T>();
		for (int i = 0; i < c.tamano(); i++) {
			if (this.estaElemento(c.iesimo(i))) {
				salida.agregar(c.iesimo(i));
			}
		}
		return salida;

	}
	
}

//Si n1=n2 la complejidad te queda n1^2
