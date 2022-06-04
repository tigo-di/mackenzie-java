/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGSISI_A1;
import java.util.Scanner;
/**
 *
 * @author tiago
 */
/*
Faça um programa que leia 10 números.
Calcule e mostre a soma e a média dos números digitados.
*/

public class For {

    public static void main (String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int sum = 0, parcel;
        double average;
        
        for (int count = 0; count < 10; count++) {
        
            parcel = input.nextInt();
            sum = sum + parcel;
            
        }
        
        average = (double) sum / 10;
        
        System.out.printf("Total da soma: %d\n", sum);
        
        System.out.printf("Média: %f", average);
        
        
        
    }
    
}
