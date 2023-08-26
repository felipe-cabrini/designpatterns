package br.com.fiap.template;

public class Chocolate extends Beverage {
  @Override
  void brew() {
    System.out.println("Adicionando Chocolate em pó");
  }

  @Override
  void addCondiments() {
    System.out.println("Adicionando canela");
  }

  @Override
  void serveBeverage(){
    System.out.println("Servir xicará com gelo seco");
  }
}
