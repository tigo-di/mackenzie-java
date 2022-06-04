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
public class Funcionario {
    
    String nome;
    double salario;
    
    
    Funcionario (String nome, double salario) {
    
        this.nome = nome;
        this.salario = salario;
    
    }
    
    public double calculaImposto() {
    
        return this.salario * 0.05;
    }
    
    
        
}
