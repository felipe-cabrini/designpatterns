package br.com.fiap.strategy;

public class BoletoPayment implements PaymentStrategy {

  private String barCode;

  public BoletoPayment(String barCode) {
    this.barCode = barCode;
  }
  @Override
  public void processPayment(double amount) {
    System.out.println("Pagando com Boleto no valor:" + amount + " com o codigo de barras: "+ barCode);
  }
}
