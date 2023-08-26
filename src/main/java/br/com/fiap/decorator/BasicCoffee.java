package br.com.fiap.decorator;

public class BasicCoffee implements Coffee {
  @Override
  public double cost() {
    return 1.00;
  }
}
