/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_01_basico;

import java.util.Scanner;

/**
 *
 * @author megazord
 */
public class Ex_01_EntradaESaida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        // Cria Scanner para obter dados de entrada
        // a partir de uma janela de comando 
        int idade;
        double peso;
        String nome;
        boolean resp;
        char opcao;
        
        //lê o inteiro para idade
        System.out.println("Digite a sua idade: ");
        idade = entrada.nextInt(); 
        System.out.println("A idade é: " + idade + "anos.");
        
        //lê o número real para peso
        System.out.println("Digite seu peso: ");
        peso = entrada.nextDouble(); 
        System.out.println("O seu peso é: " + peso + "kg");
        
        //lê uma String para o nome
        entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("O seu nome é: " + nome);
        System.out.println("A primeira letra do nome: " + nome.charAt(0));
        System.out.println("A última letra do nome: " + nome.charAt(nome.length()-1));
        
        //lê um caractér para opção
        entrada = new Scanner(System.in);
        System.out.println("Digite [a/b]: ");
        opcao = entrada.nextLine().charAt(0);
        System.out.println("A sua opção é: " + opcao);
        
        //lê um caractér para opção para alterar, usa-se '' aspas simples
        opcao = 'b';
        System.out.println("A sua opção é: " + opcao);
        
        // lê valor booleano sempre com letra minúscula
        resp = true;
    }
            
}
