
import java.util.Scanner;

public class MenuEntrada {
    
    public static void menu(){
        System.out.println("0. Fim");
        System.out.println("1. Pesquisar Produto");
        System.out.println("2. Alterar Produto");
        System.out.println("3. Remover Produto");
        System.out.println("4. Consulta Produto");
        System.out.println("Opcao:");
    }

    public static void inclui(){
        System.out.println("Digite o nome do roduto a qual quer pesquisar.");
    }
    
    public static void altera(){
        System.out.println("Digite qual produto você deseja altera.");
    }
    
    public static void Remover(){
        System.out.println("Digite qual produto você deseja Remover.");
    }
    
    public static void consulta(){
        System.out.println("Digite qual produto você deseja Consulta.");
    }
    
    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                inclui();
                break;
                
            case 2:
                altera();
                break;
                
            case 3:
                Remover();
                break;
                
            case 4:
                consulta();
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
}
