package calc;
import java.util.ArrayList;
public class CalculaDAO {
	double maior=0;
	public ArrayList<Double> calculos;
	public ArrayList<Double> historico;
	
	public CalculaDAO() {
		calculos = new ArrayList<Double>();
		historico = new ArrayList<Double>();
	}
	
	public void adicionarCalc(Double novoCalc) {
		calculos.add(novoCalc);
	}
	
	public void adcParaHistorico(Double h) {
		historico.add(h);
	}
	
	public void imprimirCalculos() {
		for (Double c:calculos) {
			System.out.print("["+c+"]");
			if (c > maior) {
				maior = c;
			}
		}
		System.out.println("");
	}
	
	public void imprimirMaior() {
		System.out.println("O maior número armazenado é "+maior);
	}
	
	public void imprimirHistorico() {
		System.out.println("Historico da Calculadora: ");
		for (Double h : historico) {
			System.out.println(h);
		}
	}
}
