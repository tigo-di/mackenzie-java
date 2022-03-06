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


/*
Após a aula, você deverá fazer e entregar um programa em Java,
criando duas threads
para somar os elementos de um vetor de inteiros de 100 posições. 
*/
public class N_INT_SO_A2_Praticando {
        
    public static void main(String[] args) {

        
        int[] numbers = new int[100];
        
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        
        
        
        N_INT_SO_A2_Praticando_Thread thread_0 = new N_INT_SO_A2_Praticando_Thread(numbers, 150);
        thread_0.start();



        N_INT_SO_A2_Praticando_Thread thread_1 = new N_INT_SO_A2_Praticando_Thread(numbers, 50);
        thread_1.start();
        
      
    }
    
}
