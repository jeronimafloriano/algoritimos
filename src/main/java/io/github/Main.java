package io.github;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    BinarySearch binarySearch = new BinarySearch();
    var result = binarySearch.binarySearch(Arrays.asList(1,3,5,7,9,11,13,15), 5);
    System.out.println(result);
  }
}