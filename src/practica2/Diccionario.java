package practica2;

import java.util.ArrayList;

public class Diccionario<C,V> {
	private Conjunto<TuplaDic<C,V>> diccionario;
	
	public Diccionario(){
		diccionario= new Conjunto<TuplaDic<C,V>>();
		
	}
	
	public void agregar(C c,V v) {
		TuplaDic<C, V> entrada= new TuplaDic<C,V>(c,v);
		if(!this.estaKey(c)) {
		this.diccionario.agregar(entrada);
		}else {
			this.diccionario.iesimo(this.indiceKey(c)).setValue(v);
		}
	}
	
	public void imprimir() {
		String salida="[";
		
		if(this.diccionario.tamano()>0) {
		for(int i =0;i<this.diccionario.tamano()-1;i++) {
			salida+=this.diccionario.iesimo(i).cadenaTupla()+",";
		}
		salida+=this.diccionario.iesimo(this.diccionario.tamano()-1).cadenaTupla()+"]";
		System.out.println(salida);
		}else {
			salida+="]";
			System.out.println(salida);
			
		}
	}
	public boolean estaKey (C key) {
		
		for(int i =0;i<this.diccionario.tamano();i++) {
			if(this.diccionario.iesimo(i).getKey()==key) {
				return true;
			}
		}
		return false;
		
	}
	
	private Integer indiceKey(C key) {
		for(int i =0;i<this.diccionario.tamano();i++) {
			if(this.diccionario.iesimo(i).getKey()==key) {
				return i;
			}
		}
		return null;	
		}
	public V obtener(C key) {
		if(this.estaKey(key)) {
			return this.diccionario.iesimo(this.indiceKey(key)).getValue();
		}else {
			return null;
		}
	}
	
	public boolean eliminar(C key) {
		if(this.estaKey(key)) {
			this.diccionario.sacarObjeto(this.diccionario.iesimo(this.indiceKey(key)));
			return true;
		}
		return false;
	}
	
	public boolean estaVacio() {
		return this.diccionario.tamano()==0?true:false;
	}
	

}
