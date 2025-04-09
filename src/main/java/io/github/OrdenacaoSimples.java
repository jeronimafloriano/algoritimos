package io.github;

public class OrdenacaoSimples {

  /**
   * A ordenação por seleção recebe um array.
   * Em cada iteração, o menor elemento é identificado.
   * O menor elemento encontrado é trocado com o primeiro elemento
   * O processo é repetido para o restante do array, até que todos os elementos estejam ordenaos.
   *
   * @param array Itens para ordenação
   * @return O array com os itens ordenados
   */
  public static int[] ordenacaoPorSelecao(int[] array) {
    for (int i = 0; i < array.length; i++) {
      int menorIndice = i;

      // Encontra o menor elemento
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[menorIndice]) {
          menorIndice = j;
        }
      }

      // Troca o menor elemento com o primeiro elemento da parte não ordenada
      int temp = array[i]; //valor da posição atual na iteração
      array[i] = array[menorIndice]; //posição atual recebe o valor do menor índice
      array[menorIndice] = temp; //a posição que estava o menor índice agora recebe o valor da posição atual
    }
    return array;
  }

}
