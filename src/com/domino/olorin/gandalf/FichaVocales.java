package com.domino.olorin.gandalf;

public class FichaVocales extends FichaImpl {

  static {
    FichaImpl.numeros1 = new String[] {"A", "E", "I", "O", "U"};
    FichaImpl.numeros2 = new String[] {"A", "E", "I", "O", "U"};
  }


  public FichaVocales(int numero1, int numero2) {
    super(numero1, numero2);
  }

  @Override
  public String getToStringNumero1() {
    return String.valueOf(getNumeros1()[getNumero1()]);
  }

  @Override
  public String getToStringNumero2() {
    return String.valueOf(getNumeros2()[getNumero2()]);

  }



}
