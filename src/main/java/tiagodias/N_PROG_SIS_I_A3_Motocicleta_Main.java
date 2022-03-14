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
public class N_PROG_SIS_I_A3_Motocicleta_Main {
    
    public static void main(String[] args) {
      N_PROG_SIS_I_A3_Motocicleta m1 = new N_PROG_SIS_I_A3_Motocicleta();
      /*

        m1.cor= "vermelha";
        m1.marca= "BMW";
        m1.modelo= "CB700";
        m1.nroChassi= 123456;
        m1.nroCilindradas= 700;
        m1.nroPlaca= "EMR4074";
        System.out.println("Mês licenciamento = " +m1.licenciar());
        int nro = 1234;
        if (m1.checaChassi(nro))
            System.out.println("Chassi verdadeiro");
       else
           System.out.println("Chassi falso");
        
        
      resposta
            Mês licenciamento = julho
            Chassi falso
        */
      
      /*
      
        m1.cor= "azul";
        m1.marca= "Honda";
        m1.modelo= "TITAN";
        m1.nroChassi= 121212;
        m1.nroCilindradas= 160;
        m1.nroPlaca= "DER2406";
        System.out.println("Mês licenciamento = " +m1.licenciar());
        int nro = 121212;
        if (m1.checaChassi(nro))
            System.out.println("Chassi verdadeiro");
       else
           System.out.println("Chassi falso");
        */
        /*
        
        resposta
        
        Mês licenciamento = agosto
Chassi verdadeiro
        */
     
        m1.cor= "azul";
        m1.marca= "BMW";
        m1.modelo= "CB400";
        m1.nroChassi= 123456;
        m1.nroCilindradas= 400;
        m1.nroPlaca= "EMR4070";
        System.out.println("Mês licenciamento = " +m1.licenciar());
        int nro = 123456;
        if (m1.checaChassi(nro))
            System.out.println("Chassi verdadeiro");
       else
           System.out.println("Chassi falso");
        
        /*
        Mês licenciamento = dezembro
Chassi verdadeiro
        */
        
    }
}
