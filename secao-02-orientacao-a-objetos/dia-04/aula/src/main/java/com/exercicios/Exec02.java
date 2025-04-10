package com.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exec02 {

  public static void main(String[] args) {
    List<String> nomes = Arrays.asList("Igor", "Arthur", "Joao", "Ariene");

    List<String> maisculo = nomes.stream().map(String::toUpperCase).toList();

    System.out.println(maisculo);
  }
}
