package lojaDeInformatica;
import java.util.ArrayList;

public class VendasDAO {
	public ArrayList<Produto> vendas;
	
	// M�todos Especiais
	
	// M�todo Construtor
	public VendasDAO() {
		vendas = new ArrayList<Produto>();
	}
	
	public void adicionarProdutos(Produto novoP) {
		vendas.add(novoP);
	}
	
	public void imprimirListaDeCompras() {
		for (Produto p:vendas) {
			System.out.println(p);
		}
	}
}
