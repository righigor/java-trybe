package com.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exec01 {

  public static void main(String[] args) {
    List<Integer> numeros = new ArrayList<Integer>();
    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(4);
    numeros.add(5);
    numeros.add(6);

    List<Integer> pares = numeros.stream().filter(par -> par % 2 == 0).toList();

    System.out.println(pares);
  }
}
