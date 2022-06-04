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
public class ProdutoPerecivel extends Produto {
    
    private int validade;
    
    
    
    ProdutoPerecivel(String nome, int quantidade, double preco, int validade) {
    
        super(nome, quantidade, preco);
        this.validade = validade;
                
    }
            
    
    @Override
    public void retiraEstoque(int quantidadeVendida) {
        
        
        if ( validade < 2 ) {
            quantidade = 0;
        }
        else
        {
            super.retiraEstoque(quantidadeVendida);
        }

        
    
    }
    
    
    @Override
    public void entraEstoque(int quantidadeComprada) {
        
        if (quantidade == 0) {
            super.entraEstoque(quantidadeComprada);
        }
            
    }
    
    
    @Override
    public String toString(){
        return super.toString() + "\n"+ this.validade;
            
        
        
    }
    
    
}
