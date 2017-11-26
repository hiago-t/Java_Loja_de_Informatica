package lojaDeInformatica;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Produto {
	public ArrayList<Produto> listaDeProdutos;
	
	// Métodos Especiais
	
	// Método Construtor
	public Produto() {
		listaDeProdutos = new ArrayList<Produto>();
	}
	
	public void adicionarProdutos(Produto novoP) {
		listaDeProdutos.add(novoP);
	}
	
	public void imprimirListaDeCompras() {
		for (Produto p:listaDeProdutos) {
			System.out.println(p);
		}
	}
}
