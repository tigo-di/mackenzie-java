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
public class ProjetoBanco {
    
    public static void main (String[] args) {
        
        Cliente cliente = new Cliente("John Snow", "333.444.555-99", 119);
        
        double credito = cliente.ctaCorrente.calculaCredito();
                
                
    }
    
}
