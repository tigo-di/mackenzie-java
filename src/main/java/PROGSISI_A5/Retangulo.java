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
public class Retangulo {
    
    private double altura;
    private double largura;
    
    public double area(){
        return altura * largura;
    }
    

    public double perimetro(){
        return 2 * (altura + largura);
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }
    
    
}
