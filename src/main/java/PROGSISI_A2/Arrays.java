/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGSISI_A2;

/**
 *
 * @author tiago
 */
public class Arrays {
   
    
    public static void main(String[] args) {
    
        int[] vet = {23, 45, 67, 10};
        
        // mapeia pelo elemento
        for (int x:vet) {
            System.out.println(x);
        }
        
        
        // mapeia pelo índice
        for(int i=0; i<vet.length; i++) {
            System.out.println(vet[i]);
        }
        
        
        
    
    }
    
    
    
    
}
