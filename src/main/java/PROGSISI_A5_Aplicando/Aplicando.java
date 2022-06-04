/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGSISI_A5_Aplicando;

/**
 *
 * @author tiago
 */

/*

classe Produto
+ codigo: int
+ descricao: String
- preco: double
- quantidade: int
+ calculaValor(): double


O método calculaValor() retorna o resultado do preço multiplicado pela quantidade.

Os atributos preco e quantidade são privados.


For example:

Test                                         Result
Produto prod1 = new Produto();
prod1.codigo = 12345;
prod1.descricao= "Produto de Teste 1";
prod1.setPreco(1000);
prod1.setQuantidade(50);
System.out.println(prod1.getPreco());        1000.0
System.out.println(prod1.getQuantidade());       50
System.out.println(prod1.calculaValor());   50000.0



Produto prod1 = new Produto();
prod1.codigo = 12345;
prod1.descricao= "Produto de Teste 2";
prod1.setPreco(0.50);
prod1.setQuantidade(200);
System.out.println(prod1.getPreco());           0.5
System.out.println(prod1.getQuantidade());      200
System.out.println(prod1.calculaValor());     100.0




*/

public class Aplicando {
        

public int codigo;
public String descricao;
private double preco;
private int quantidade;

    public double calculaValor() {
        return quantidade * preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }    

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }



}
