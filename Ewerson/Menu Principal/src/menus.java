


import java.util.Scanner;
public class menus {

	public static void main(String[] args) {
		int opt=0;

		String menu;
		// Objetos
		Scanner tec = new Scanner(System.in);


		do {
			menu = ("Escolha uma operação:\n0 - Pesquisar Produto;\n1 -Incluir Produto;\n"
					+ "2 - Alterar Produto;\n3 - Remover Produto;"
					+ "\n5 - OPÇÕES");
			System.out.println(menu);
			opt = tec.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Informe o Nome Produto que Deseja Pesquisar: ");
				break;
			case 2:
				System.out.println("Informe o Produto que deseja incluir: ");
				break;
			case 3:
				System.out.println("Informe qual produto deseja Alterar: ");
				break;
			case 4:
				System.out.println("Informe qual produto que deseja Excluir: ");
				break;
			
			}
		} while(opt!=0);
		System.out.print("Encerrando...");
	}
}

