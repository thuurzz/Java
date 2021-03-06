/**
 * Este programa mostra ao aluno:
 * 1) Um programa Java é construído dentro de um projeto Java.
 * 2) Todo programa Java deve ter uma classe com um método main.
 * 3) Como exibir informações no terminal (console) do Java.
 * 4) Como ler uma String do terminal (console) do Java.
 */
package meuPrimeiroProgramaJava;
import java.util.Scanner;

/**
 * @author megazord
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // Classe que contém o método principal.
		System.out.println("Olá Mundo!\nComo vai?\nQual é o seu nome?"); // Uso do println.
		
		// Ler uma String do console com a lib Scanner.
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		
		// Exibir uma String usando printf que pula linha ao final.
		System.out.printf("Olá %s!\n", nome);
		entrada.close();
		
		// Perguntar a idade
		System.out.printf("%s! qual é a sua idade?", nome);
		entrada.close();	
		
		//NOTA: Implementar leitura de idade e exibi-la.
	}

}
