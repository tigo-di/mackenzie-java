/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGSISI_A4;

/**
 *
 * @author tiago
 */
public class ProdutoTeste {
    
    public static void main(String[] args){
    
        Produto produto1 = new Produto(22, "Ball");
    
        System.out.println(produto1.codigo); // esperado: 22
        
        System.out.println(produto1.descricao); // esperado valor default null
        
        System.out.println(produto1.ativo); // esperado valor default false
        
        
        
        Produto produto2 = new Produto("Puzzles", true);
        
        System.out.printf("Produto 2\n Código: %d\n Descrição: %s\n Ativo: %s", produto2.codigo, produto2.descricao, produto2.ativo);
        
 
    }
        
}
