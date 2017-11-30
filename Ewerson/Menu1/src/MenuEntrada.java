
	import java.util.Scanner;
	public class MenuEntrada {

		public static void main(String[] args) {
			int opt=0;
			int PesquisarProduto;
			int IncluirProduto;
			int AlterarProduto;
			int ExcluirProduto;
			
			String menu;
			// Objetos
			Scanner tec = new Scanner(System.in);
			
			
			do {
				menu = ("Escolha uma operação:\n0 - Pesquisar Produto;\n1 -Incluir Produto;\n"
	                    + "2 - Alterar Produto;\n3 - Remover Produto;"
	                    + "\n5 - HISTÓRICO");
				System.out.println(menu);
				opt = tec.nextInt();
				Object dao;
				switch (opt) {
					case 1:
						System.out.println("Informe o Nome Produto que Deseja Pesquisar: ");
						PesquisarProduto = tec.nextInt();
						dao.adcParaHistorico(c.getResultado());
						System.out.println("Resultado = "+c.getResultado());
						break;
					case 2:
						System.out.println("Informe o Produto que deseja incluir: ");
						IncluirProduto = tec.nextInt();
						dao.adcParaHistorico(c.getResultado());
						System.out.println("Resultado = "+c.getResultado());
						break;
					case 3:
						System.out.println("Informe qual produto deseja Alterar: ");
						AlterarProduto = tec.nextInt();
						dao.adcParaHistorico(AlterarProduto);
						dao.adcParaHistorico(c.getResultado());
						System.out.println("Resultado = "+c.getResultado());
						break;
					case 4:
						System.out.println("Informe qual produto que deseja Excluir: ");
						ExcluirProduto = tec.nextInt();
						dao.adcParaHistorico(ExcluirProduto);
						dao.adcParaHistorico(c.getResultado());
						System.out.println("Resultado = "+c.getResultado());
						break;
					case 5:
						dao.imprimir();
						dao.imprimirMaior();
						dao.imprimirResults();
				}
			} while(opt!=0);
			System.out.print("Encerrando...");
		}
	}