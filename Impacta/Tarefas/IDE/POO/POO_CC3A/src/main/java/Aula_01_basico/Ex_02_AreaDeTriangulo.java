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
public class Ex_02_AreaDeTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double base;
        double altura;
        
        System.out.println("Digite a base do trinângulo: ");
        base = entrada.nextDouble();
     
        System.out.println("Digite a altura do trinângulo: ");
        altura = entrada.nextDouble();
        
        double area = (base * altura) / 2;
        
        System.out.println("A área do triângulo é: " + area); // ponto
        System.out.printf("A área do triângulo é: %f\n", area); // usa vírgula na saída
        System.out.printf("A área do triângulo é: %.2f", area); // usa vírgula na saída com 2 casas        
    }
}
