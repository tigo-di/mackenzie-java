/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTSO_A2;

/**
 *
 * @author tiago
 */
public class N_INT_SO_A2_ClasseDaThread extends Thread {
    
    public void run() {

        
        for(int i=0; i<100; i++) {
        
            System.out.printf("Classe da Thread - Oi número %d\n", i+1);

        }
        
    }
    
}
