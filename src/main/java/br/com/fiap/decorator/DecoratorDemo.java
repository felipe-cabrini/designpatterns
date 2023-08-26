package br.com.fiap.decorator;

public class DecoratorDemo {

  public static void main(String[] args) {
    // cafe original
    Coffee myCoffee = new BasicCoffee();
    double price = myCoffee.cost();
    System.out.println("cafe basico custa: " + price);

    //cafe com novas funcionalidades

    Coffee newCoffee = new MilkDecorator(new ChocolateDecorator(new BasicCoffee()));

    double totalPriceNewCoffee = newCoffee.cost();

    System.out.println("Preco do novo cafe com leite e chocolate foi: " +totalPriceNewCoffee);

    Coffee coffeeWithCaramel = new CaramelDecorator(new BasicCoffee());

    double coffeeWithCaramelPrice = coffeeWithCaramel.cost();

    System.out.println("Preco do novo cafe com caramelo: " +coffeeWithCaramelPrice);


  }
}
