/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGSISI_A5;

/**
 *
 * @author tiago
 */
public class RetanguloMain {
    
    
    public static void main (String[] args) {
    
    
        Retangulo retangulo = new Retangulo();
    
        retangulo.setAltura(2.10);
        
        retangulo.setLargura(5.00);
    
        
        System.out.printf("A área do retângulo: %.2f \n", retangulo.area());
        
        System.out.printf("O perímetro do retângulo: %.2f \n", retangulo.perimetro());
        
        
        System.out.printf("A altura: %.2f \n", retangulo.getAltura() );
        
        System.out.printf("A largura: %.2f \n", retangulo.getLargura() );
        
        
        
    
    }
    
    
}
