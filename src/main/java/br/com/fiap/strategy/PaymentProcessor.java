package br.com.fiap.strategy;

public class PaymentProcessor {

  private PaymentStrategy paymentStrategy;

  public PaymentProcessor(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }


  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  //regra de negocio processa pagamento
  public void processPayment(double amount) {
    //regra de negocio
    //valida usuario
    //valida conta
    //salva no banco
    paymentStrategy.processPayment(amount);
  }
}
