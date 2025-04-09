package io.github;

public class Recursao {

  public static void contagemRegressiva(int valor) {
    System.out.println(valor);
    if(valor == 0 ) {
      return;
    }
    contagemRegressiva(valor-1);
  }
}
