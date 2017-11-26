package calc;
import java.util.Scanner;
public class UsaCalculadora {

	public static void main(String[] args) {
		double valor1, valor2;
		int opt=0;
		String menu;
		// Objetos
		Scanner tec = new Scanner(System.in);
		Calcula c = new Calcula();
		CalculaDAO dao = new CalculaDAO();
		
		do {
			menu = ("Escolha uma operação:\n0 - SAIR;\n1 - SOMA;\n"
                    + "2 - SUBTRAÇÃO;\n3 - MULTIPLICAÇÃO;\n4 - DIVISÃO;"
                    + "\n9 - HISTÓRICO");
			System.out.println(menu);
			opt = tec.nextInt();
			switch (opt) {
				case 1:
					System.out.println("Informe os dois valores: ");
					valor1 = tec.nextInt();
					dao.adcParaHistorico(valor1);
					valor2 = tec.nextInt();
					dao.adcParaHistorico(valor2);
					c.somar(valor1, valor2);
					dao.adicionarCalc(c.getResultado());
					dao.adcParaHistorico(c.getResultado());
					System.out.println("Resultado = "+c.getResultado());
					break;
				case 2:
					System.out.println("Informe os dois valores: ");
					valor1 = tec.nextInt();
					valor2 = tec.nextInt();
					c.subtrair(valor1, valor2);
					dao.adicionarCalc(c.getResultado());
					System.out.println("Resultado = "+c.getResultado());
					break;
				case 3:
					System.out.println("Informe os dois valores: ");
					valor1 = tec.nextInt();
					valor2 = tec.nextInt();
					c.multiplicar(valor1, valor2);
					dao.adicionarCalc(c.getResultado());
					System.out.println("Resultado = "+c.getResultado());
					break;
				case 4:
					System.out.println("Informe os dois valores: ");
					valor1 = tec.nextInt();
					valor2 = tec.nextInt();
					c.dividir(valor1, valor2);
					dao.adicionarCalc(c.getResultado());
					System.out.println("Resultado = "+c.getResultado());
					break;
				case 9:
					dao.imprimirCalculos();
					dao.imprimirMaior();
					dao.imprimirHistorico();
			}
		} while(opt!=0);
		System.out.print("Encerrando...");
	}
}
