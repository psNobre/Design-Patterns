package strategy;

public class Calcular {
	Calculo calculo;
	
	public void calcularConta(Calculo calculo){
		this.calculo = calculo;
		calculo.calcula();	
	}

}
