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
public class Venda {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1234,"caderno", 18.30);
        Pedido pedido1 = new Pedido(58763,produto1, 500);
        pedido1.calculaPedido();
        System.out.println("Informações do Pedido");
        System.out.println(pedido1.toString());
    }
}