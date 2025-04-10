package com.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exec03 {

  public static void main(String[] args) {
    List<Integer> numeros = new ArrayList<Integer>();
    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(4);
    numeros.add(5);
    numeros.add(6);

    long soma = numeros.stream().mapToInt(Integer::intValue).sum();

    System.out.println(soma);
  }
}
