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
public class N_PROG_SIS_I_A3_Cliente {
    
    String nome;
    int agencia,
        conta;
    double saldo = 0;
    
    public void depositar(double valor) {
        saldo += valor;
    }
    
    public double consultarSaldo() {
        return saldo;
    }
    
}
