/*
 * - criar arquivo de produtos [C:\DBJ\arquivoDeProdutos]; [ok]
 * - criar classe "beta" de Produtos; [ok]
 * - ler arquivo de dados (diskScanner); [ok]
 * - armazenar em um ArrayList (ProdutoDAO); [ok]
 * - criar classe para venderProduto; (relação entre produto venda e vendedor)
 */

package betalojainformatica;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class BetaLojaInformatica {
    public static void main(String[] args) throws IOException {
        
        Produto p1 = new Produto();
        ProdutoDAO prodao = new ProdutoDAO();
        ArrayList<String> prod = new ArrayList<String>();
        Scanner diskScanner = new Scanner(new File("C:\\DBJ\\arquivoDeProdutos.txt"));
        
        while (diskScanner.hasNext()) {
            prod.add(diskScanner.nextLine());
        }
        
        for (String n : prod) {
            p1.setNome(n);
            prodao.adcProdutos(p1);
            //System.out.println(n);
        }
        prodao.imprimirListaDeCompras();
    }
}

/*  [ Resposta dúvida Array ]
 * Ok, you can take away the for loop and do it this way
 * 
 * System.out.println(Arrays.toString(myArray));
 * 
 * I would strongly recommend to do it with the for loop. It prints one 
 * element at the time every time the loop runs, and with your for loop it 
 * runs through every element. You need to change the println to this (inside 
 * you for loop)
 * 
 * System.out.println(myArray[counter]);
 * 
 * or if you want to have the array on the same line
 * 
 * System.out.print(myArray[counter]+ " ");
 * 
 * Later on when programming you are going to see how useful this is compared 
 * to Arrays.toString() method.
 */