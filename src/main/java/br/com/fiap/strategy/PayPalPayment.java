package br.com.fiap.strategy;

public class PayPalPayment implements PaymentStrategy {

  private String email;

  public PayPalPayment(String email) {
    this.email = email;
  }

  @Override
  public void processPayment(double amount) {
      System.out.println("Processando pagamento de R$:" +amount+ " via PayPal para: " + email);
  }
}
