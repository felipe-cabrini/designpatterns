package br.com.fiap.chain;

public class SupportRequest {

  enum Type { REFUND, EXCHANGE, TECHNICAL , OTHER, FINANCIAL_SUPPORT}

  private Type type;

  public SupportRequest(Type type) {
    this.type = type;
  }

  public Type getType() {
    return type;
  }
}
