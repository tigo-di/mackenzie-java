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
public class Pessoa {
    
    private String nome;
    private int idade;
    private float altura;
    
    Pessoa(String nome, int idade, float altura) {
    
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
            
    }
    
    
    public String getNome() {
       return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public double getAltura() {
        return altura;
    }
    
    
    public void setNome(String nome) {
        this.nome = nome;        
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
