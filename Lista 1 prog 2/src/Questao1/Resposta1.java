/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Questao1;

/**
 *
 * @author letic
 */
public class Resposta1 {
    public static void main(String[] args) {
        double populacaoA = 55000;
        double populacaoB = 160000;
        int meses = 0;
        
        while (populacaoA <= populacaoB) {
            
            meses++;
            populacaoA = populacaoA + (populacaoA * 0.003);
            populacaoB = populacaoB + (populacaoB * 0.0018);
            
        }
        System.out.println("Para a população A ultrapassar ou se igualar à população do país B será necessário "+meses+" meses.");
        System.out.println("Após "+meses+" meses a população A tem "+ populacaoA+" habitantes");
        System.out.println("Após "+meses+" meses a população B tem "+ populacaoB+" habitantes");
    }
    
}
