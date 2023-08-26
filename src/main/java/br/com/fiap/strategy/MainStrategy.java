package br.com.fiap.strategy;

public class MainStrategy {



  public static void main(String args[]) {
    PaymentStrategy creditCardPayment = new CreditCardPayment("123456798","rick");
    PaymentProcessor processor = new PaymentProcessor(creditCardPayment);
    // pagando com cartao de credito rick
    processor.processPayment(100.00);
    // pagando com paypal homer
    PaymentStrategy payPalStrategy = new PayPalPayment("homer@gmail.com");
    processor.setPaymentStrategy(payPalStrategy);
    processor.processPayment(50.00);

    PaymentStrategy boletoPayment = new BoletoPayment("123456");
    processor.setPaymentStrategy(boletoPayment);

    processor.processPayment(70.00);

    processor.setPaymentStrategy(creditCardPayment);

    processor.processPayment(10.00);

  }

}
