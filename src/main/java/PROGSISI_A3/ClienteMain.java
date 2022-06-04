/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGSISI_A3;

/**
 *
 * @author tiago
 */
public class ClienteMain {
    
    public static void main(String[] args) {
    
        Cliente cliente = new Cliente();
        
        cliente.depositar(200.00);
        cliente.depositar(2300.00);
        
        System.out.printf("Esse é o saldo atual %.2f", cliente.consultarSaldo() );
        
    }
        
}
