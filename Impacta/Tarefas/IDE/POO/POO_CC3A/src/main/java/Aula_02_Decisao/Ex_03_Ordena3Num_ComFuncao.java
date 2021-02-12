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
public class Ex_03_Ordena3Num_ComFuncao {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro n1: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite um número inteiro n2: ");
        int n2 = entrada.nextInt();
        System.out.println("Digite um número inteiro n3: ");
        int n3 = entrada.nextInt();
        
        // Colocar o meor de todos em n1
        if (n1 > n2 || n1 > n3)
            if (n2 < n3)
                // trocar n1 com n2
                troca(n1, n2);
            else
                // trocar n1 com n3
                troca(n1, n3);
            
        
        // Intermediário em n2 é o mairo de todos em n3
        if (n2 > n3)
            // trocar n1 com n3
            troca(n1, n3);

        // Exibe resultado
        System.out.printf("%d, %d, %d", n1, n2, n3);
    }
        
        
        // Método(função para troca de variáveis)

        /**
         *
         * @param a inteiro para troca
         * @param b inteiro para troca
     * @return 
         */
        public static int[] troca(int a, int b){
        // Troca 2 numeros
        int aux;
        aux = a;
        a = b;
        b = aux;
        
        int num[] = {a, b};
        return num;
    }
}
