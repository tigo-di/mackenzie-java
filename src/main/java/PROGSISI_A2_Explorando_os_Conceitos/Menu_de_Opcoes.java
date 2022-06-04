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
public class Menu_de_Opcoes {
    
    
    public static int menu() {
       Scanner input = new Scanner(System.in); 
       
       
       System.out.println("Opções\n" + 
               "1 - Média\n" + 
               "2 - Diferença do Maior pelo Menor\n" + 
               "3 - Produto\n" + 
               "4 - Divisão\n" +  
               "5 - Sair\n"
               
               
               );
       
       return input.nextInt();
    }


    public static double media(double number1, double number2) {
        return (number1 + number2)/2;
    }
    
    public static double diferenca(double number1, double number2) {

        int fator = 1;

        if(number1 < number2) {
            fator = -1;
        }

        return (number1 - number2) * fator;
    }
    
    
    public static double divisao(double number1, double number2) {
            
//        String result;
//        
//        if (number2 != 0) {

            return number1/number2;

//        }
//        else
//        {
//            result = "NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO";
//        }
//        
        

    }
    
    
    
    public static double multiplicacao(double number1, double number2) {
        return number1 * number2;
    }
    
    
    public static void main(String[] args) {
        
       int operationCode;
       double number1 = 0.0;
       double number2 = 0.0;
       double result = 0.0;
       String done = "no", error;
       
       
       Scanner input = new Scanner(System.in);
       
       while(true){
           
           error = "";
           operationCode = menu();
           
           
           if(operationCode <1 || operationCode >5) {
               System.out.println("OPÇÃO INVÁLIDA");
               continue;
           }


           if(operationCode != 5) {
                number1 = input.nextDouble();
                number2 = input.nextDouble();
           }           
           
           switch (operationCode) {
           
               
               case 1:  //  média entre os números digitados
                   result = media(number1, number2);
                   
               break;

               case 2:  //  diferença do maior pelo menor
                   
                   result = diferenca(number1, number2);
                   
               break;
               
               case 3:  //  multiplicação dos números digitados

                   result = multiplicacao(number1, number2);
                   
               break;

               case 4:  //  divisão do primeiro pelo segundo


                    if (number2 == 0) {
                        error = "NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO";
                        break;
                    }
                    
                    result = divisao(number1, number2);

                   
               break;

               case 5:
                   done = "yes";
               break;
                          
           }
           
           
           if (done == "yes") {
               break;
           }


           if (error != "") {
               System.out.println(error);
               continue;
           }
                      
           System.out.println(result);
           
         
           
       
       }
        
        
    }
}
