/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGSISI_A6;

/**
 *
 * @author tiago
 */
public class Cliente {
        
    public String nome;
    public String cpf;
    public int agencia;
    public Poupanca ctaPoupanca;
    public Corrente ctaCorrente;
     
    Cliente(String nome, String cpf, int agencia) {
       
        Corrente ctaCorrente = new Corrente();
        
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = agencia;
       
        ctaCorrente.numero = 1234;
        ctaCorrente.saldo = 0.0;
                
    }
    
}
