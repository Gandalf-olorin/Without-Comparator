package com.domino.olorin.gandalf;

import com.github.cards.Card;

public class FichaExt extends Card implements Ficha<Integer> {

  public FichaExt(int suit, int rank) {
    super(suit, rank);
  }

  @Override
  public Integer getNumero1() {
    return getSuit();
  }

  @Override
  public Integer getNumero2() {
    return getRank();
  }

  // hago �apa para que no me aparezcan los palos de las cartas francesas, si no ser�a
  // getSuitString()
  @Override
  public String getToStringNumero1() {
    return getSuit() + "";
  }

  @Override
  public String getToStringNumero2() {
    return getRankString();
  }

  @Override
  public String toString() {
    String toString1;
    if (getNumero1() == getNumero2()) {
      toString1 = "pair of " + getToStringNumero1();
    } else
      toString1 = getToStringNumero1() + " (|) " + getToStringNumero2();
    return toString1;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    return true;
  }

  // no a�ado el compare to porque lo he subido a la interfaz


}
