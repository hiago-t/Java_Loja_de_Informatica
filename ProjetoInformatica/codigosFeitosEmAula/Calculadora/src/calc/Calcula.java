package calc;

public class Calcula {
	private double resultado;
	
	public void somar(double valor1, double valor2) {
		resultado = (valor1+valor2);
	}
	
	public void subtrair(double valor1, double valor2) {
		resultado = (valor1-valor2);
	}
	
	public void multiplicar(double valor1, double valor2) {
		resultado = (valor1*valor2);
	}

	public void dividir(double valor1, double valor2) {
		resultado = (valor1/valor2);
	}
	
	public double getResultado() {
		return resultado;
	}
}
