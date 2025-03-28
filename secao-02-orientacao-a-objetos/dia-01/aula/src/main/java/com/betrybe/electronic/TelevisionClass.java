package com.betrybe.electronic;

public class TelevisionClass {
  private static int MAX_VOLUME = 30;
  private boolean isOn = false;
  private int volume = 0;

  private String brand;
  private String model;
  private int size;

  public TelevisionClass(String brand, String model, int size) {
    this.brand = brand;
    this.model = model;
    this.size = size;
  }

  public void turnOn() {
    System.out.println("Ligando televisão...");
    this.isOn = true;
  }

  public void turnOff() {
    System.out.println("Desligando televisão...");
    this.isOn = false;
  }

  public String info() {
    return "Marca: %s\nModelo: %s\nTamanho: %d\nLigada: %b".formatted(brand, model, size, isOn);
  }

  public void increaseVolume() {
    if (volume < MAX_VOLUME) {
      volume++;
    }
  }

  public void decreaseVolume() {
    if (volume > 0) {
      volume--;
    }
  }

  public int getVolume() {
    return volume;
  }

  public boolean isOn() {
    return isOn;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }
}
