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
public class FuncionarioMain {
 
    public static void main(String[] args){
    
        Funcionario funcionario = new Funcionario("Jaspion", 5000);
    
        double imposto = funcionario.calculaImposto();
    
        System.out.println(imposto);
    
    }
    
}
