/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao3;

/**
 *
 * @author letic
 */
public class Resposta3 {
    public static void main(String[] args) {
        
        int soma = 0;
        
        for (int numero = 1; numero <= 500; numero++ ) {
            
            if (numero % 3 == 0 && numero %2 == 1) {
                
                System.out.println(numero);
                soma = soma + numero;
                
            }
        }
        System.out.println(soma);
    }
    
}
