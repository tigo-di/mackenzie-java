/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGSISI_A6_Aplicando_Conhecimento;

/**
 *
 * @author tiago
 */
public class Pedido {
    
public int numero;
  public Produto item;
  public int quantidade;
  public double valor = 0.0;

  Pedido(int numero, Produto item, int quantidade) {

    this.numero = numero;
    this.quantidade = quantidade;
    this.item = item;

  }

  public void calculaPedido() {
    valor = quantidade * item.preco;
  }


   @Override
  public String toString() {

    String informacoesDoPedido = String.format("Número do pedido: %d \n", numero);

    informacoesDoPedido += String.format("Código do produto: %d \n", item.cod);

    informacoesDoPedido += String.format("Descrição: %s \n", item.descricao);

    informacoesDoPedido += String.format("Preço do Produto: %.2f \n", item.preco);

    informacoesDoPedido += String.format("Quantidade: %d \n", quantidade);

    informacoesDoPedido += String.format("Valor total do pedido: %.2f \n", valor);

    return informacoesDoPedido;

  }

    
}
