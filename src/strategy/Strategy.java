package strategy;

public class Strategy {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcular calcular = new Calcular();
		
		calcular.calcularConta(new CalculoY());
		calcular.calcularConta(new CalculoX());
		
	}

}
