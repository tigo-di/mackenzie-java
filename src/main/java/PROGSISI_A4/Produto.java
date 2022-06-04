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
public class Produto {
    
    int codigo;
    String descricao;
    boolean ativo;
    
    Produto(String descricao, boolean ativo) {
    
        this.descricao = descricao;
        this.ativo = ativo;
    }
    
        
    public Produto(int codigo, String descricao) {
    
        this.codigo = codigo;
        descricao = descricao;
        
    }
    
    
}
