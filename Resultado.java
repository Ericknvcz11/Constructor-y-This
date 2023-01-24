
public class Resultado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado A = new Cuadrado(); 
			System.out.println(A.calcularArea()); 
		Cuadrado B = new Cuadrado ();
			System.out.println(B.calcularPerimetro()); 
		Cuadrado C = new Cuadrado(); 
			System.out.println(C.calcularDiagonal()); 
			
			A.cambiarlongitud(100);
		System.out.println(A.calcularArea());
			B.cambiarlongitud(100);
		System.out.println(B.calcularPerimetro()); 
			C.cambiarlongitud(100);
		System.out.println(C.calcularDiagonal()); 
			
	}

}
