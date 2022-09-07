package practica2;

public class Nat {
	private Integer numero;
	
	
	public Nat( Integer numero) {
		if(numero>=0) {
			this.numero=numero;	
			
		}else {
			throw new RuntimeException("Error:el valor tiener que ser mayor a 0");
		}
		
		
	}
	
	public String toString() {
		return ""+this.numero;
	}
	
	public void sumar(Nat n2) {
		this.numero=n2.getn()+this.numero;
		
	}
	
	
	public Integer getn() {	//Esto es lo que ellos llaman parte Integer
		return this.numero;
	}
	
	

}
