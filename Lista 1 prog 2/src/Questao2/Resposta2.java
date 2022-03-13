/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao2;

import java.util.Scanner;

public class Resposta2 {
    public static void main(String[] args) {
        
        System.out.println("Digite o número que deseja ver a tabuada: ");
        Scanner n = new Scanner(System.in);
        int numero = n.nextInt();
        System.out.println("Tabuada do "+numero);
        
        for (int cont = 0; cont <= 10; cont++) {
            
            System.out.println(numero + " * "+ cont + " = " + (cont*numero));
           
        }
        
    }
    
}
