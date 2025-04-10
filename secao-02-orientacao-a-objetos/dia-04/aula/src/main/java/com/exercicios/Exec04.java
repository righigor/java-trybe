package com.exercicios;

import java.util.List;

public class Exec04 {

  public static void main(String[] args) {
    List<String> nomes = List.of("Cruzeiro", "Teste", "Alooou", "Oi");

    List<String> filtrados = nomes.stream().filter(nome -> nome.length() > 4).toList();

    System.out.println(filtrados);
  }
}
