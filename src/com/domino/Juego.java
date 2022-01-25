package com.domino;

import java.util.Comparator;
import com.domino.olorin.gandalf.FichaExt;
import com.domino.olorin.gandalf.FichaImpl;
import com.domino.olorin.gandalf.FichaVocales;
import com.domino.olorin.gandalf.Mano;
import com.domino.olorin.gandalf.PilaDeFichas;


public class Juego {

  public static void main(String[] args) {
    int numeroMaxDominoEspa�ol = 6;
    PilaDeFichas dominoEspa�ol = new PilaDeFichas();
    for (int i = 0; i <= numeroMaxDominoEspa�ol; i++) {
      for (int j = 0; j <= i && j <= numeroMaxDominoEspa�ol; j++) {
        dominoEspa�ol.getFichasDomino().add(new FichaImpl(j, i));
      }
    }
    dominoEspa�ol.getFichasDomino().forEach(System.out::println);
    dominoEspa�ol.remover();
    dominoEspa�ol.getFichasDomino().forEach(System.out::println);
    System.out.println("\n \n");
    FichaImpl fichaEspa�ol = new FichaImpl(5, 6);
    System.out.println("�la ficha " + fichaEspa�ol + " esta en el juego? ==> "
        + dominoEspa�ol.contiene(fichaEspa�ol));
    System.out.println("Robo la ficha " + dominoEspa�ol.robar(fichaEspa�ol));
    dominoEspa�ol.getFichasDomino().forEach(System.out::println);
    dominoEspa�ol.getFichasDomino().sort(null);
    dominoEspa�ol.getFichasDomino().forEach(System.out::println);

    System.out.println("\n \n");
    int numeroMaxDominoBritish = 10;
    PilaDeFichas dominoBritish = new PilaDeFichas();
    for (int i = 0; i <= numeroMaxDominoBritish; i++) {
      for (int j = 0; j <= i && j <= numeroMaxDominoBritish; j++) {
        dominoBritish.getFichasDomino().add(new FichaExt(i, j));
      }
    }

    dominoBritish.getFichasDomino().forEach(System.out::println);
    System.out.println("\n \n");
    dominoBritish.remover();
    dominoBritish.getFichasDomino().forEach(System.out::println);


    System.out.println("\n \n");
    dominoBritish.getFichasDomino().sort(null);
    dominoBritish.getFichasDomino().forEach(System.out::println);
    System.out.println("\n \n");
    // i siempre tiene que ser mayor que j!!!!!!! si lo pones al reves siempre va a salir carta
    // erronea
    FichaExt fichaBritish = new FichaExt(10, 9);
    System.out.println("ATENCION fallo intencionado");
    System.out.println("�la ficha " + fichaBritish + " esta en el juego espa�ol? ==> "
        + dominoEspa�ol.contiene(fichaBritish));
    System.out.println("�la ficha " + fichaBritish + " esta en el juego britanico? ==> "
        + dominoBritish.contiene(fichaBritish));
    System.out.println("Robo la ficha " + dominoBritish.robar(fichaBritish));
    dominoBritish.getFichasDomino().forEach(System.out::println);
    System.out.println("\n \n");


    int numeroMaxDominoVocales = 4;
    PilaDeFichas dominoVocales = new PilaDeFichas();
    for (int i = 0; i <= numeroMaxDominoVocales; i++) {
      for (int j = 0; j <= i && j <= numeroMaxDominoVocales; j++) {
        dominoVocales.getFichasDomino().add(new FichaVocales(j, i));
      }
    }
    dominoVocales.getFichasDomino().forEach(System.out::println);


    Comparator<Mano> comparador = (mano1, mano2) -> {
      int resultado = 0;
      // algo que cuente las fichas que hay y que tenga los numeros maximos de puntos

      return resultado;
    };


  }

}


