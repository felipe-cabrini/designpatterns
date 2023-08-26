package br.com.fiap.decorator;

public class MilkDecorator  extends CoffeeDecorator {
  public MilkDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public double cost() {
    return super.cost() + 0.50;
  }
}
