
public class Cuadrado {
	public int ID;  
	
	public Cuadrado() {
		this(176107);	
	}
	
	public Cuadrado(int val) {
		ID = val;		
	}
	
	
	public double calcularArea() {
		return ID*2; 
	}
	
	public double calcularPerimetro() {
		return ID*4; 
	}
	
	public double calcularDiagonal() {
		return Math.sqrt(Math.pow(ID, 2)+Math.pow(ID, 2));
	}
	
	public void cambiarlongitud(int r) {
		ID = r; 
	}
	
}
