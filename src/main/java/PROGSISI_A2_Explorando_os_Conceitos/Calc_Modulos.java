/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGSISI_A2_Explorando_os_Conceitos;
import java.util.Scanner;
/**
 *
 * @author tiago
 */
public class Calc_Modulos {
    
    
        
    
    public static double somar(double number1, double number2) {
        return number1 + number2;
    }
    
    
    public static double subtrair(double number1, double number2) {
        return number1 - number2;
    }
    

    public static double multiplicar(double number1, double number2) {
        return number1 * number2;
    }


    public static double dividir(double number1, double number2) {
        return number1 / number2;
    }
    

    public static int menu() {
    
       Scanner entrada = new Scanner(System.in);
       System.out.println("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Sair\n");
       return (entrada.nextInt());
       
    
    }

    
    public static void main(String[] args) {
    
       Scanner entrada = new Scanner(System.in); 
       double number1, number2;
       int operacao;
       String resultado = "";
       
       System.out.println("Digite 2 números\n");
       
       number1 = entrada.nextDouble();
       number2 = entrada.nextDouble();
       
       
       do {
       
           operacao = menu();
           
           switch(operacao){
           
               case 1:
                   resultado = "Soma = " + somar(number1, number2);
               break;
               case 2:
                   resultado = "Subtração = " + subtrair(number1, number2);
               break;
               case 3:
                   resultado = "Multiplicação = " + multiplicar(number1, number2);
               break;
               case 4:
                   if( number2 == 0) {
                    resultado = "Não é possível dividir por zero";
                    break;
                   }
                   
                   resultado = "Divisão = " + dividir(number1, number2);
               break;
               
           }
           
           if(operacao>=1 && operacao <=4) {
           
               System.out.println(resultado);
               
           }
           
           
       } while (operacao != 5);
       
       
    
    }
    
    
    
}
