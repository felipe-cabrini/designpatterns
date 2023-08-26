package br.com.fiap.strategy;

public class CreditCardPayment implements PaymentStrategy {

  private String cardNumber;

  private String cardHolder;

  public CreditCardPayment(String cardNumber, String cardHolder) {
    this.cardNumber = cardNumber;
    this.cardHolder = cardHolder;
  }

  @Override
  public void processPayment(double amount) {
    System.out.println("Processando pagamento de R$: " + amount + " via cartão de crédito: " + cardNumber);
  //logica de pagamento por cartao de credito
  }
}
