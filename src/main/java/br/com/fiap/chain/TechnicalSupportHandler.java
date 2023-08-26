package br.com.fiap.chain;

public class TechnicalSupportHandler  extends SupportHandler{
  @Override
  public void handleRequest(SupportRequest request) {
    if(request.getType() == SupportRequest.Type.TECHNICAL) {
      System.out.println("Solicitação de suporte tecnico sendo processada");
    } else {
        System.out.println("Nenhum manipulador disponivel para essa solicitação");
    }
  }
}
