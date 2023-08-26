package br.com.fiap.chain;

public abstract class SupportHandler {

  protected  SupportHandler sucessor;

  public  void setSucessor(SupportHandler sucessor) {
    this.sucessor = sucessor;
  }

  public abstract void handleRequest(SupportRequest request);
}
