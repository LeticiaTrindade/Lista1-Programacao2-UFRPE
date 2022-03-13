/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao6;

/**
 *
 * @author letic
 */
public class Estoque {
    public String nome;
    public int qtdAtual;
    public int qtdMinima;
   
    public Estoque(){}
    public Estoque(String nome, int qtaAtual,int qtdMinima){
        this.nome = nome;
        this.qtdAtual = qtaAtual;
        this.qtdMinima = qtdMinima;
    }
    
    public void mudarNome(String nome){
    this.nome = nome;
    }
    
    public void mudarQtdMinima(int qtdMinima){
    this.qtdMinima = qtdMinima;
    }
    
    public void repor(int qtd){
    this.qtdAtual = qtdAtual + qtd;
    }
    
    public void darBaixa(int qtd){
    this.qtdAtual = qtdAtual - qtd;
    }
        
    public void mostrar (){
        System.out.println("Nome: "+this.nome);
        System.out.println("Quantidade Atual: "+this.qtdAtual);
        System.out.println("Quantidade Mínima: "+this.qtdMinima+"\n");
    }
    
    public void precisaRepor(){
        
        if (qtdMinima >= qtdAtual){
            
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}

