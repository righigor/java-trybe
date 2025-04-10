package com.betrybe.electronic;

public class Application {

  public static void main(String[] args) {
    System.out.println("Iniciando sistema...");
    TelevisionClass tv = new TelevisionClass("Samsung", "LCD", 42);

    tv.turnOn();
    tv.turnOff();
    System.out.println(tv.info());

    System.out.println("Finalizando sistema...");
    Carro hb20 = new Carro("Hyundai", "HB20", 2025);
    System.out.println(hb20.getCONTADOR());
    System.out.println(hb20.exibirInformacoes());
    Carro city = new Carro("Honda", "City", 2020);
    System.out.println(city.getCONTADOR());
    System.out.println(city.exibirInformacoes());
  }

}
