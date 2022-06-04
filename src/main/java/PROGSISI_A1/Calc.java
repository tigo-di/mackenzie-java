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
O enunciado do exercício é:

Faça uma calculadora básica em Java, 
capaz de receber dois números reais, digitados pelo usuário, 
e realizar as operações básicas de soma, subtração, multiplicação e divisão.


Este programa deve ter a seguinte sequência:

- Solicite ao usuário os dois números de entrada.

- Apresente um menu com as opções (1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão, 5-Sair).

- Apresente o resultado da operação solicitada.

Obs.: o menu deve ser repetido até que o usuário escolha a opção Sair.
*/

public class Calc {
    
    public static void main (String[] args){

        
        // - Solicite ao usuário os dois números de entrada.

        int codeOperation;
        double number1, number2, result = 0;
        String error = "", response, operator = "";
        
        
        Scanner input = new Scanner(System.in);
        
        
        while (true) {
        
            System.out.println("Escolha a operação:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Sair");
            codeOperation = input.nextInt();
            
            if (codeOperation == 5) {
                break;
            }
            
            
        
        
        
        
        System.out.println("Informe o primeiro número: ");
        number1 = input.nextDouble();
        
        System.out.println("Informe o Segundo número: ");
        number2 = input.nextDouble();
        
        
        switch(codeOperation) {
            case 1: // Soma
                result = number1 + number2;
                operator = "+";
            break;
            case 2: // Subtração
                result = number1 - number2;
                operator = "-";
            break;
            case 3: // Multiplicação
                result = number1 * number2;
                operator = "*";
            break;
            case 4: // Divisão
            
                if (number2 != 0) {
                    result = number1 / number2;
                    operator = "/";
                }
                else
                {
                    error = "Não é possível realizar a divisão por zero";
                }
                
            break;
        
        
        }
        
        
        if (error != "") {
           response = error;
        }
        else {
           response = number1 + " " + operator + " " + number2 + " = " + String.format("%.2f", result);
           
        }
        
       
        System.out.println(response);
        
                
        
        }
        
// - Apresente um menu com as opções (1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão, 5-Sair).

// - Apresente o resultado da operação solicitada.

//Obs.: o menu deve ser repetido até que o usuário escolha a opção Sair.

        
        
        
    }
    
}
