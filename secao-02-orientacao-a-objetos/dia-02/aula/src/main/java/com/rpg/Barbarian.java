package com.rpg;

public class Barbarian extends Character {
  @Override
  public void move() {
    System.out.println("O bárbaro pega impulso...");
    super.move();
  }
}
