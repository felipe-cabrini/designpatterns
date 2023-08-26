package br.com.fiap.decorator;

public class CaramelDecorator extends CoffeeDecorator {

  public CaramelDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public double cost() {
    return super.cost() + 0.60;
  }
}
