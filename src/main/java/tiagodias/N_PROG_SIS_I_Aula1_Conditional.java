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

(if/else) Faça um programa que receba 3 notas de um aluno, calcule e mostre a média
aritmética e a mensagem que segue na tabela abaixo. Para alunos de exame, calcule e
mostre a nota que deverá ser tirada no exame para aprovação, considerando que a média
no exame é 6,0.


*/

public class N_PROG_SIS_I_Aula1_Conditional {
        
    
    public static void main(String[] args) {
    
    
        Scanner input = new Scanner(System.in); 
        
        double grade_1, grade_2, grade_3, average;
        
    // receber 3 notas
    System.out.println("Digite a nota 1 de 3: ");
    grade_1 = input.nextDouble();
    
    System.out.println("Digite a nota 2 de 3: ");
    grade_2 = input.nextDouble();
    
    System.out.println("Digite a nota 3 de 3: ");
    grade_3 = input.nextDouble();

    // calcule a média
    average = ( grade_1 + grade_2 + grade_3 ) / 3;
            
    // mostre a média aritmética
    System.out.println("Média: " + average);
    
    
    /*
        de acordo com média mostre uma mensagem:
    
        média < 3 = Reprovado
        média < 7 = Exame
        7 <= média <= 10 = Aprovado
    
    */
    
    String message;
    
    if(average >=7) {
    
        message = "Aprovado";
    
    } else {
    
        if(average >=3) {
            message = "Exame";
        }
        else
        {
            message = "Reprovado";
        }
        
    }
    
    
    System.out.println("Status do aluno: " + message);
    
    
    }
    
}
