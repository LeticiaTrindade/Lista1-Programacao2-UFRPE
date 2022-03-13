/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao4;

import java.util.Scanner;

public class Resposta4 {
    public static void main(String[] args) {
      
        double maiorAltura = -99999999;
        double menorAltura = 9999999;
        
        for (int cont = 1; cont <16; cont++) {
            
            System.out.println("Digite a altura da pessoa numero "+cont+" :");
            Scanner alt = new Scanner(System.in);
            double altura = alt.nextDouble();
            
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            
        }
        
        System.out.println("\nA pessoa mais alta tem "+maiorAltura+" de altura");
        System.out.println("A pessoa mais baixa tem " +menorAltura+ " de altura");
    }
}
