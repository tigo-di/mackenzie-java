/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGSISI_A7;

/**
 *
 * @author tiago
 */
public class Produto {
    String nome;
    int quantidade;
    double preco;
    
    Produto (String nome, int quantidade, double preco){
        this.nome=nome;
        this.quantidade=quantidade;
        this.preco=preco;
    }
    
    public void retiraEstoque(int qtde){
        if (quantidade<qtde)
            System.out.println("Estoque insuficiente.");
        else
            quantidade-=qtde;
    }
  public void entraEstoque(int qtde){
      quantidade+=qtde;
  }
 
  @Override
  public String toString(){
      return "\n"+ nome +
              "\n"+ quantidade +
              "\n"+ preco;
  }
}
