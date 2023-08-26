package br.com.fiap.template;

public class MainTemplate {

  public static void main(String[] args) {
    Beverage coffee = new Coffee();
    coffee.prepareBeverage();

    Beverage tea = new Tea();

    tea.prepareBeverage();

    Beverage chocolate = new Chocolate();

    chocolate.prepareBeverage();
  }
}
