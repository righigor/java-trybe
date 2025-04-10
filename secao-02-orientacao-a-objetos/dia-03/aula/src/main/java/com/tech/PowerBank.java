package com.tech;

public class PowerBank implements Chargeable {
  @Override
  public void charge() {
    System.out.println("Carregando powerbank...");
  }

  @Override
  public int getBatteryLevel() {
    return 85;
  }
}
