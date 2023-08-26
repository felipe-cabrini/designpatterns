package br.com.fiap.decorator;

public class ChocolateDecorator extends CoffeeDecorator {
  public ChocolateDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public double cost() {
    return super.cost() + 0.75;
  }

}
