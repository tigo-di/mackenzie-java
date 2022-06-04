/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGSISI_A4_Aplicando;

/**
 *
 * @author tiago
 */
public class Aplicando {
    

    String modelo;
    String marca;
    int nroChassi;
    String nroPlaca;
    String cor;
    int nroCilindradas;
    
    
    
    Aplicando(int nroChassi, String nroPlaca) {
        this.nroChassi = nroChassi;
        this.nroPlaca = nroPlaca;
    }
    

    Aplicando(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    Aplicando() { }
    
   public void mostraDados(){
       System.out.println("Modelo : " + modelo);
       System.out.println("Marca : " + marca);
       System.out.println("Número do chassi : " + nroChassi);
       System.out.println("Número da placa : " + nroPlaca);
       System.out.println("Cor : " + cor);
       System.out.println("Número de Cilindradas : " + nroCilindradas);
   }

    
}
