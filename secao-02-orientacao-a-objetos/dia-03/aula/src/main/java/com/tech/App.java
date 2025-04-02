package com.tech;

public class App {

  public static void main(String[] args) {
    Laptop laptop = new Laptop("Acer", 512, 18);
    Desktop desktop = new Desktop("Dell", 500);

    PowerBank powerBank = new PowerBank();

    checkDevice(laptop);
    checkDevice(desktop);

    plugDevice(laptop);
    plugDevice(powerBank);
  }

  public static void checkDevice(ComputerDevice device) {
    System.out.println("Verificando dispositvo de marca " + device.getBrand());
    device.bootUp();
  }

  public static void plugDevice(Chargeable chargeable) {
    System.out.println("A bateria atual é " + chargeable.getBatteryLevel());
    chargeable.charge();
  }
}
