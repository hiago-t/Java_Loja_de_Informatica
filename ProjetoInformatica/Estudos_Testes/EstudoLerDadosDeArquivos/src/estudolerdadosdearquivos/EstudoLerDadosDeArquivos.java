package estudolerdadosdearquivos;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class EstudoLerDadosDeArquivos {
    public static void main(String[] args)
                    throws java.io.IOException {
        Scanner diskScanner = 
                new Scanner(new java.io.File("C:\\DBJ\\EmpregadosInfo2.txt"));
        
        for (int empNum = 1; empNum <=3; empNum++) {
            pagarUmEmpregado(diskScanner);
        }
    }    
    static void pagarUmEmpregado(Scanner aScanner) {
        Empregado e1 = new Empregado();
        
        e1.setNome(aScanner.nextLine());
        e1.setCargo(aScanner.nextLine());
        e1.preencherCheque(aScanner.nextDouble());
        aScanner.nextLine();
    }
}
