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
public class Ex_03_IMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o seu peso: ");
        float peso = entrada.nextFloat();
        
        System.out.println("Digite sua altura: ");
        float altura = entrada.nextFloat();

        float imc = peso/(altura * altura);
        System.out.println("IMC = " + imc);
        
        
        
        
        
        
    }
}
