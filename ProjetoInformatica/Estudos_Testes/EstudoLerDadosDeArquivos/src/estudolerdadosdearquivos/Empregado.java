package estudolerdadosdearquivos;
public class Empregado {
    private String nome;
    private String cargo;
    
    public void setNome(String n) {
        nome = n;
    }
    public String getNome() {
        return nome;
    }
    public void setCargo(String c) {
        cargo = c;
    }
    public String getCargo() {
        return cargo;
    }
    public void preencherCheque(double valorPago) {
        System.out.printf("Pago em nome de %s ", nome);
        System.out.printf("(%s) **$", cargo);
        System.out.printf("%,.2f\n", valorPago);
    }
}
