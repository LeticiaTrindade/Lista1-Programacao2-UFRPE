/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao5;

/**
 *
 * @author letic
 */

import java.util.Scanner;
public class Resposta5 {
    public static void main(String[] args) {
        
        int intervalo1 = 0;
        int intervalo2 = 0;
        int intervalo3 = 0;
        int intervalo4 = 0;
        int encerrar = 0;
        while (encerrar >= 0) {
            
            System.out.println("Digite um valor e para encerrar digite um valor negativo.");
            Scanner n = new Scanner(System.in);
            int numero = n.nextInt();
            
            if (numero >= 0 && numero <= 25){
                intervalo1 = intervalo1 +1;
            }
            
            else if (numero >= 26 && numero <= 50){
                intervalo2 = intervalo2 +1;
            }
            
            else if (numero >= 51 && numero <= 75){
                intervalo3 = intervalo3 +1;
            }
            
            else if (numero >= 76 && numero <= 100){
                intervalo4 = intervalo4 +1;
            } 
            
            else if (numero < 0){
                encerrar = numero;
            }
        } 
        
    System.out.println("\nO primeiro intervalo [0-25] tem "+ intervalo1+" números dentro dele.");
    System.out.println("O segundo intervalo[26-50] tem "+ intervalo2+" números dentro dele.");
    System.out.println("O terceiro intervalo [51-75] tem "+ intervalo3+" números dentro dele.");
    System.out.println("O quarto intervalo [76-100] tem "+ intervalo4+" números dentro dele.");
    }
}
