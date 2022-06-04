/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGSISI_A2;

/*
Faça um programa em Java com um método que retorna a soma de 2 números inteiros e
outro método que retorna a média destes números.
Faça o programa principal que atribui um valor para as variáveis n1 e n2 e apresente o
resultado das operações realizadas pelos métodos.
*/


/**
 *
 * @author tiago
 */

import java.util.Scanner;
public class Metodos {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        
        mostra("Soma = " + soma(n1, n2));

        mostra("Media = " + media(n1, n2));
        
        
        
    }
    
    static int soma(int n1, int n2) {
        return (n1 + n2);
    }

    static double media(int n1, int n2) {
        return (double)(n1 + n2) / 2;
    }
    
    static void mostra(String resultado) {
        System.out.println(resultado);
    }
    
}
