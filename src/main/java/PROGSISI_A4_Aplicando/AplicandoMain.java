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
public class AplicandoMain {
    
    public static void main (String[] args) {
        
        /*
 Agora que você já sabe utilizar construtores, na classe Motocicleta,
        inclua três métodos construtores:

1 - Recebe como parâmetro o número do chassi e o número da placa e
        armazena os valores recebidos nos devidos atributos.

2 - Recebe o modelo e a marca e armazena os valores recebidos nos devidos atributos.

3- Construtor default: não recebe parâmetros e não tem código de implementação.
        */
        
    
        Aplicando m1 = new Aplicando();
        m1.mostraDados();
    /*
        
        Modelo : null
Marca : null
Número do chassi : 0
Número da placa : null
Cor : null
Número de Cilindradas : 0
      */  
    
        Aplicando m2 = new Aplicando(1234566,"EMR4965");
        m2.mostraDados();
    
    /*
        Modelo : null
Marca : null
Número do chassi : 1234566
Número da placa : EMR4965
Cor : null
Número de Cilindradas : 0
        */
    
Aplicando m3 = new Aplicando("Kawasaki","KLX 450R");
m3.mostraDados();
    /*
Modelo : Kawasaki
Marca : KLX 450R
Número do chassi : 0
Número da placa : null
Cor : null
Número de Cilindradas : 0
*/
    
    }
    
    
}
