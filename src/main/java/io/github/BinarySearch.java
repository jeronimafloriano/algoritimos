package io.github;

import java.util.List;

public class BinarySearch {

  /**
   * A pesquisa binária recebe um array ordenado e um item.
   * Se o item está no array, a função irá retornar a sua posição.
   *
   * @param itens Lista de inteiros ordenados.
   * @param item O item a ser procurado na lista.
   * @return A posição do item na lista, ou null se o item não for encontrado.
   */
  public Integer binarySearch(List<Integer> itens, Integer item) {
      int baixo = 0;
      int alto = itens.size() - 1;

      while (baixo <= alto) {
        int meio = (baixo + alto) / 2; // ou para evitar overflow: baixo + (alto - baixo) / 2
        int chute = itens.get(meio);
        if(chute == item) {
          return meio;
        }
        if(chute > item) {
          alto = meio - 1;
        } else {
          baixo = meio + 1;
        }
      }
    return -1; // Retorno quando o item não é encontrado
  }
}
