/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTSO_A2_Praticando;

/**
 *
 * @author tiago
 */
public class Praticando_Thread extends Thread {
    
    private final int time;
    private final int[] numbers;
    private int currentTotal = 0;
    private int sum;
    
    
    public Praticando_Thread(int[] numbers, int time) {
    
        this.numbers = numbers;
        this.time = time;
        
    }
    
    
    @Override
    public void run() {


        try {
        
            for ( int count = 0; count < numbers.length; count++) {

                sum = currentTotal + numbers[count];

                System.out.println(getName() + " somando: " + currentTotal + " + " + numbers[count] + " = " + sum);

                currentTotal = sum;

                Thread.sleep(time);
                
            }
        
            System.out.println(">>  RESULTADO FINAL da " + getName() + " : " + currentTotal );
            
            
        } catch (InterruptedException ex) {
         
             ex.printStackTrace();
         
         }
            
        
            
    
    }
    
    
}
