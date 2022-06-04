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
public class N_INT_SO_A2_Thread {
    
    
    public static void main(String[] args) {
    
        System.out.println("Aula sobre Threads");
        
        // Criar uma nova thread dentro do programa
        
        N_INT_SO_A2_ClasseDaThread ta = new N_INT_SO_A2_ClasseDaThread();
        
        ta.start();
        
        
        for(int i=0; i<100; i++) {
        
            System.out.printf("Main - Oi número %d\n", i+1);

        }
        
    }
       
    
}
