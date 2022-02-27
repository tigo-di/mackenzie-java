/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiagodias;

/**
 *
 * @author tiago
 */
public class N_PROG_SIS_I_Aula1_Valores {
    
    
    static int somar(int x, int y) {
    
        int s;
        s = x + y;
        return s;
    
    }
    
    static double media(int n1, int n2) {
    
        double m;
        m = (double)(n1 + n2)/2;
        return m;
    
    }
    
    
    public static void main(String[] args) {
    
        int n1 = 6;
        int n2 = 7;
        System.out.println("Soma = " + somar(n1, n2));
        System.out.println("Media = " + media(n1, n2));
    
    }
     
    
}
