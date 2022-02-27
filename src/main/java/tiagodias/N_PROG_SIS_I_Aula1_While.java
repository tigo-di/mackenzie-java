/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiagodias;

import java.util.Scanner;

/**
 *
 * @author tiago
 */

/*
Faça um programa que leia vários números, encerrando quando o usuário digitar -1. Calcule
e mostre a soma e a média dos números digitados.
*/
public class N_PROG_SIS_I_Aula1_While {
  
    public static void main (String[] args) {
    
    
    /* definir total para acumular valor de soma  */    
        
    /* while com a conde que se igual a um encerra */
        
    
    int amount = 0, parcel = 0, sum = 0;
    double average;
    Scanner input = new Scanner(System.in);
      
    
    parcel = input.nextInt();
    
        while(parcel != -1) {
                
            sum = sum + parcel;
            amount++;
            
            parcel = input.nextInt();        
        
        }
    
    
        if (amount != 0) {
        
            average = (double) sum / amount;
        
            System.out.println("Total da soma: " + sum);
            System.out.println("Média: " + average);
        
        }
        else
        {
            System.out.println("Não houve processamento");
        }
    
    }
    
    
}
