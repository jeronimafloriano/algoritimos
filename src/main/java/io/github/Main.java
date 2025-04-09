package io.github;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    BinarySearch binarySearch = new BinarySearch();
    var result = binarySearch.binarySearch(Arrays.asList(1,3,5,7,9,11,13,15), 5);
    System.out.println(result);

    int[] array = {7, 3, 6, 2, 4, 1, 10, 8};
    var arrayOrdenado = OrdenacaoSimples.ordenacaoPorSelecao(array);
    for(int i : arrayOrdenado) {
      System.out.println(i);
    }

    Recursao.contagemRegressiva(5);
  }
}