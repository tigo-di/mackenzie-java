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
public class Corrente {
    
    public int numero;
    public double saldo;
    public double credito;
    
    
    public double calculaCredito() {
    /*
        double percentual = .5;
                
        if (saldo > 50000.00) {
            percentual = .7;
        }
        else if (saldo > 10000.00) {
            percentual = .6;        
        }
         
        return saldo * percentual;
      */  
        return 10.0;
    }
    
    
}
