package br.com.fiap.template;

public abstract class Beverage {

  final void prepareBeverage() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
    serveBeverage();
  }

  void boilWater() {
    System.out.println("Fervendo a água");
  }

  void pourInCup() {
    System.out.println("Despejando na xícara");
  }

  void serveBeverage() {
    System.out.println("Bebida foi servida.");
  }

  abstract void brew();

  abstract void addCondiments();


}
