/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao7;

import Questao6.Estoque;

/**
 *
 * @author letic
 */
public class UsaEstoque {
    public static void main(String[] args){
    
    Estoque estoque1 = new Estoque("Impressora Jato de Tinta", 13, 6);
    Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas", 11, 13);
    Estoque estoque3 = new Estoque("Mouse Ótico",6, 2);
    
    estoque1.darBaixa(5);
    estoque2.repor(7);
    estoque3.darBaixa(4);
    
    estoque1.precisaRepor();
    estoque2.precisaRepor();
    estoque3.precisaRepor();
    
    estoque1.mostrar();
    estoque2.mostrar();
    estoque3.mostrar();
}
}
