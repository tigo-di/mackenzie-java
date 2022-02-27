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

(switch) Faça um programa que receba o código correspondente ao cargo de um funcionário
e seu salário atual e mostre o cargo, o valor do aumento e seu novo salário. Os cargos estão
na tabela a seguir:

CÓDIGO CARGO PERCENTUAL
1 Escriturário 50%
2 Secretário 35%
3 Caixa 20%
4 Gerente 10%
5 Diretor Não tem aumento


*/

public class N_PROG_SIS_I_Aula1_SalaryIncrease {

    public static void main(String[] args) {
    
    double factor = 0, currentWage, newWage, increase;
    int codePost;
    String post = "";


    
        
        
    Scanner input = new Scanner(System.in);

        
    /*  Receber código do funcionário */
        System.out.println("Informe o código do cargo: ");
        codePost = input.nextInt();

    
    /*  Atribuições de valores para post e factor de acordo com codePost */    
            
    switch(codePost) {

        case 1:    //     1 Escriturário 50%
            factor = .5;
            post = "Escriturário";
        break;
    
        case 2:    //     2 Secretário 35%
            factor = .35;
            post = "Secretário";
        break;

        case 3:    //     3 Caixa 20%
            factor = .2;
            post = "Caixa";
        break;
        
        case 4:    //     4 Gerente 10%
            factor = .1;
            post = "Gerente";
        break;
        
        case 5:    //     5 Diretor Não tem aumento
            factor = .0;
            post = "Diretor";
        break;
       
    }
        
        
    /*  receber salário atual do funcionário */
        System.out.println("Informe o salário atual: ");
        currentWage = input.nextDouble();
    
    
    /*  mostre o cargo */
        System.out.printf("O funcionário  possui o cargo de %s \n", post);
    
    
    /*  mostre o valor do aumento */
        increase = currentWage * factor;
        System.out.printf("O aumento é de %.2f \n", increase);
       
    
    /*  mostre o novo salário */    
        newWage = currentWage + increase;
        System.out.printf("O novo salário é de %.2f \n", newWage);
    
    }
    
}
