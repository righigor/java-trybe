package com.tech;

public class Laptop extends ComputerDevice implements Chargeable {
  private double size;

  public Laptop(String brand, double storageCapacity, double size) {
    super(brand, storageCapacity);
    this.size = size;
  }

  @Override
  public void bootUp() {
    System.out.println("Iniciando laptop de tamanho " + size + "...");
  }

  @Override
  public void charge() {
    System.out.println("Carregando laptop...");
  }

  @Override
  public int getBatteryLevel() {
    return 85;
  }
}
