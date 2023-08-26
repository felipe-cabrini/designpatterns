package br.com.fiap.template;

public class Coffee extends Beverage {
  @Override
  void brew() {
    System.out.println("Filtrando o café moído");
  }

  @Override
  void addCondiments() {
      System.out.println("Adicionando açucar");
  }
}
