/*
Foi solicitado a um programador que escrevesse um programa em Java 
para preencher um vetor com dez números inteiros digitados pelo usuário.

Depois, o programa deveria colocar em outro vetor
somente os números positivos do vetor de entrada e apresentá-los.

Nesta questão, escreva o método chamado vetor_positivos que está faltando no programa.

For example:

Input	Result
2       2
3       3
0
-8
-2
-6
0
4       4
7       7
-9




2       2
3       3
8       8
4       4
0
-9
-2
-7
-9
-5



-9
-2
-7
-9
-5
2       2
3       3
8       8
4       4
0

*/

package PROGSISI_A2_Aplicando_Conhecimento;
import java.util.Scanner;




public class Aplicando_Conhecimento_Vetor {
    
   public static int vetor_positivos(int[] vet, int[] positivo) {
   
       int counter = 0;
       
       for(int i=0; i<vet.length; i++) {
           
           if(vet[i] > 0) {
               positivo[counter] = vet[i];
               counter = counter + 1;
           }
           
       }
       
       
       return counter;
       
   }
    
    
   public static void main(String[] args) {
        int []vet = new int[10];
        int []positivo = new int[10];
        int x=0;
        Scanner input = new Scanner(System.in);
        for (int i=0; i<vet.length;i++)
            vet[i]= input.nextInt();
        x = vetor_positivos(vet, positivo);
        for (int i=0; i<x; i++)
            System.out.println(positivo[i]);
     }
    
}
