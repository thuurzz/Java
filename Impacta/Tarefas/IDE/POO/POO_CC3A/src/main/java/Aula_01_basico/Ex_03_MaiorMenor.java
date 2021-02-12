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
public class Ex_03_MaiorMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double n1;
        double n2;
        
        System.out.println("Digite um número: ");
        n1 = entrada.nextDouble();
     
        System.out.println("Digite outro número: ");
        n2 = entrada.nextDouble();
        
       if(n1 <= n2){
            System.out.println("O maior é: " + n2);
            System.out.println("O menor é: " + n1);
       } else {
            System.out.println("O maior é: " + n1);
            System.out.println("O maior é: " + n2);
       }
    }
}
