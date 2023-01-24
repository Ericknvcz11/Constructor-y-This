
public class Circulo {
	public int ID;  
	
	public Circulo() {
		this(176107);	
	}
	
	public Circulo(int val) {
		ID = val;		
	}
	
	public double calcularCircunferencia() {
		return ID*(2*3.1416); 
	}
	
	public double calcularAreac() {
		return Math.pow(ID, 2)*3.1416; 
	}
	
	public void cambialongitud(int r) {
		ID = r; 
	}
	
	
}
