package practica2;

public class TuplaDic<T1,T2> {
	private T1 key;
	private T2 value;
	
	public TuplaDic(T1 x,T2 y) {
		this.key=x;
		this.value=y;
	}
	
	public T1 getKey() {
		return this.key;
		
	}

	public void setValue(T2 y) {
		this.value=y;
	}
	
	public T2 getValue() {
		return this.value;
	}
	public void imprimir() {
		System.out.print("{"+this.getKey()+","+this.getValue()+"}");
	}
	
	 String cadenaTupla() {
		return "{"+this.getKey()+","+this.getValue()+"}";
	}
}
