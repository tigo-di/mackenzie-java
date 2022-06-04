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
public class SumTwoNumbers {
    
    
    public static void main (String[] args) {
    
    /*
        (do/while) Faça um programa que receba dois números e apresenta a soma destes
números. Pergunte ao usuário se ele deseja (S/N) somar outros pares de números.
      */  
        
        int number1, number2, sum;
        char response;
    
        Scanner input = new Scanner(System.in);
        
        /* inicia do/while */
        do {
        
        /* coleta 2 números */
        System.out.println("Informe o primeiro número da soma: ");
        number1 = input.nextInt();
        
        System.out.println("Informe o segundo número da soma: ");
        number2 = input.nextInt();
        
        
        /* soma os 2 números */
        sum = number1 + number2;
        
        /* mostra o resultado */
        
        // System.out.println(number1 + " + " + number2 + " = " + sum);
        System.out.printf("%d + %d = %d \n", number1, number2, sum);
        
        
        /* pergunta se quer somar outros dois números ou encerrar o do/while */
        System.out.printf("Continuar somando ?\nS para Sim\nN para Não\n");
        
        response = input.next().charAt(0);
               
            
        } while (response == 's');
        
        
        
        
        
        
    
    }
    
    
}
