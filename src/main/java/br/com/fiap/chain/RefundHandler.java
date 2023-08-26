package br.com.fiap.chain;

public class RefundHandler extends SupportHandler {
  @Override
  public void handleRequest(SupportRequest request) {
    if(request.getType() == SupportRequest.Type.REFUND) {
      System.out.println("processando reembolso");
    } else if (sucessor != null) {
      sucessor.handleRequest(request);
    }

  }
}
