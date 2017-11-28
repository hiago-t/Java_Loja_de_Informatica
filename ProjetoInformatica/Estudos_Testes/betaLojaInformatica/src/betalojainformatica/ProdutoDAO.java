/*
   
*/
package betalojainformatica;

import java.util.ArrayList;

public class ProdutoDAO {
    public ArrayList<Produto> prod;
    
    public ProdutoDAO() {
        prod = new ArrayList<Produto>();
    }
    
    public void adcProdutos(Produto p) {
        prod.add(p);
    }
    
    public void imprimirListaDeCompras() {
        for (Produto p : prod) {
            System.out.println(p);
        }
    }
}

	/*
	public void adicionarProdutos(Produto novoP) {
		vendas.add(novoP);
	}
	
	public void imprimirListaDeCompras() {
		for (Produto p:vendas) {
			System.out.println(p);
		}
	}
