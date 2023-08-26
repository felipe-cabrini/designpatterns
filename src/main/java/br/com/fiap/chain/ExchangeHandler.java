package br.com.fiap.chain;

public class ExchangeHandler extends SupportHandler {
  @Override
  public void handleRequest(SupportRequest request) {
    if(request.getType() == SupportRequest.Type.EXCHANGE) {
      System.out.println("Solicitação de troca de produto sendo processada.");
    } else if( sucessor != null) {
        sucessor.handleRequest(request);
    }
  }
}
