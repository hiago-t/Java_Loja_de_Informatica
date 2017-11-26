Na linha 11, ou a que aparecer: 
	new Scanner(new java.io.File("C:\\DBJ\\EmpregadosInfo2.txt")); 

 1 - Substitua o local específico onde você salvar o arquivo (EmpregadosInfo2.txt) que acompanha o diretório.
 2 - Substitua observando também as "barras duplas" \\ se usar normalmente ocorrerá erro.

Reparem também aqui nas importações:
import java.util.Scanner;
import java.io.File;
import java.io.IOException;