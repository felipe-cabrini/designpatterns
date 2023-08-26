package br.com.fiap.template;

public class Tea extends Beverage{
  @Override
  void brew() {
    System.out.println("Infundindo o chá");
  }

  @Override
  void addCondiments() {
    System.out.println("Adicionando limão");
  }
}
