/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROGSISI_A3;

/**
 *
 * @author tiago
 */
public class Motocicleta {

  public String modelo,
      marca,
      nroPlaca,
      cor;

  int nroChassi,
      nroCilindradas;

  String[] mes = {
      "dezembro",
      "abril",
      "maio",
      "junho",
      "julho",
      "agosto",
      "agosto",
      "setembro",
      "outubro",
      "novembro"
  };

  public String licenciar() {

    int tamanho = nroPlaca.length();

    int mesPlaca = Integer.parseInt(nroPlaca.substring(tamanho - 1));

    return mes[mesPlaca];

  }

  public boolean checaChassi(int nro) {

    boolean statusChassi = false;

    if (nro == nroChassi) {
      statusChassi = true;
    }

    return statusChassi;

  }

}
