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
public class PessoaMain {
    
    public static void main(String[] args) {
    
        Pessoa pessoa = new Pessoa("John", 25, (float) 1.82);
        
        pessoa.setNome("Luigi");
        pessoa.setIdade(28);
        pessoa.setAltura((float)1.92);
        
        
        System.out.printf("Nome: %s \n", pessoa.getNome());
        System.out.printf("Altura: %.2f \n" , pessoa.getAltura());
        System.out.printf("Idade: %d \n", pessoa.getIdade());
        
        
    }
    
}
