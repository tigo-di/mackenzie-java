/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGSISI_A1_Aplicando;
import java.util.Scanner;

/**
 *
 * @author tiago
 */
/*
Faça um programa em Java que receba de entrada:

- a opção desejada pelo usuário (conforme menu abaixo);

- dois números reais.

Calcule e mostre o resultado da operação solicitada pelo usuário, em função da opção desejada.

Menu de opções:

Opção	Operação
1	média entre os números digitados
2	diferença do maior pelo menor
3	multiplicação dos números digitados
4	divisão do primeiro pelo segundo
5	sair



Observações:

- Cada vez que o usuário escolher uma opção do menu válida, serão solicitados os dois números de entrada, e o programa apresentará o resultado.

- Na Opção 2, não deverá ser apresentado um valor de saída negativo, já que o programa irá subtrair o maior número de entrada pelo menor número de entrada.

- Na Opção 4, caso o segundo número de entrada seja igual a zero, emitir mensagem NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO.

- O menu será repetido até que o usuário escolha a Opção 5.

- Caso o usuário escolha uma opção do menu inválida, o programa deverá emitir a mensagem OPÇÃO INVÁLIDA e apresentar o menu novamente.







For example:

Input	Result
7       OPÇÃO INVÁLIDA
5

1
2
7       4.5
5

2
9
12      3.0
5


2
12      3.0
9
5

3
2
3       6.0
5


4
5
0       NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO
5

4
2
3       0.6666666666666666
5



*/


public class MenuOpcoes {
    public static void main(String[] args) {
        
       int operationCode;
       double number1 = 0.0;
       double number2 = 0.0;
       double result = 0.0;
       String done = "no", error;
       
       
       Scanner input = new Scanner(System.in);
       
       while(true){
           
           error = "";
           operationCode = input.nextInt();
           
           
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
                   result = (number1 + number2)/2;
                   
               break;

               case 2:  //  diferença do maior pelo menor
                   
                   int fator = 1;
                   
                   if(number1 < number2) {
                       fator = -1;
                   }
                   
                   result = (number1 - number2) * fator;
                   
               break;
               
               case 3:  //  multiplicação dos números digitados

                   result = number1 * number2;
                   
               break;

               case 4:  //  divisão do primeiro pelo segundo

                   if (number2 != 0) {
                   
                       result = number1 / number2;
                       
                   }
                   else
                   {
                       error = "NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO";
                   }

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
