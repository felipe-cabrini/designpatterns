package br.com.fiap.decorator;

public abstract class CoffeeDecorator implements Coffee {

  protected Coffee coffee;

  public CoffeeDecorator(Coffee coffee) {
    this.coffee = coffee;
  }

  public double cost() {
    return coffee.cost();
  }
}
