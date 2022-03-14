/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiagodias;

/**
 *
 * @author tiago
 */
public class N_PROG_SIS_I_A3_TesteCliente {
    
    public static void main(String[] args) {
    
        N_PROG_SIS_I_A3_Cliente cliente = new N_PROG_SIS_I_A3_Cliente();
        
        cliente.depositar(200.00);
        cliente.depositar(2300.00);
        
        System.out.printf("Esse é o saldo atual %.2f", cliente.consultarSaldo() );
        
    }
        
}
