/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Decisao;

import java.util.Scanner;

/**
 *
 * @author megazord
 */
public class Ex_04_Combustivel2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tipo de conbustível: [A]Álcool [D]Diesil [G]Gasolina ");
        String tipo = entrada.nextLine();
        tipo = tipo.toLowerCase();                

        System.out.println("Digite a quantidade de litros: ");
        double qtd = entrada.nextFloat();

        double total = 0;
        switch (tipo){
            case "alcool":
                total = qtd * 1.7997;
                break;
            case "diesel":
                total = qtd * 0.9798;
                break;
            case "gasolina":
                total = qtd * 0.9798;
                break;
            default:
                System.out.println("Opção inválida!");
        }
        
        System.out.printf("O valor total será: %.2f R$.", total);

    }
}
