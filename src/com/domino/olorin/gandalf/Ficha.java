package com.domino.olorin.gandalf;


// la interfaz comparable es a mano!!!!!
// empezamos a poner T e integer comenzamos desde aki a liarla parda
public interface Ficha<T extends Comparable<T>> extends Comparable<Ficha<T>> {

  T getNumero1();

  T getNumero2();

  String getToStringNumero1();

  String getToStringNumero2();


  default int compareTo(Ficha<T> otraFicha) {
    int resultado = getNumero1().compareTo(otraFicha.getNumero1());
    if (resultado == 0) {
      resultado = getNumero2().compareTo(otraFicha.getNumero2());
    }
    return resultado;
  }



}
