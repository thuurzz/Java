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
public class Ex_04_Combustivel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tipo de conbustível: [A]Álcool [D]Diesil [G]Gasolina ");
        char tipo = entrada.nextLine().charAt(0);

        System.out.println("Digite a quantidade de litros: ");
        double qtd = entrada.nextFloat();

        double total = 0;
        switch (tipo){
            case 'A':
            case 'a':
                total = qtd * 1.7997;
                break;
            case 'D':
            case 'd':
                total = qtd * 0.9798;
                break;
            case 'G':
            case 'g':
                total = qtd * 0.9798;
                break;
            default:
                System.out.println("Opção inválida!");
        }
        
        System.out.println("O valor total será:  " + total + "R$.");

    }
}
