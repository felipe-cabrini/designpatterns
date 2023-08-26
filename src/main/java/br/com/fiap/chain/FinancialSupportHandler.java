package br.com.fiap.chain;

public class FinancialSupportHandler extends SupportHandler{
  @Override
  public void handleRequest(SupportRequest request) {
      if(request.getType() == SupportRequest.Type.FINANCIAL_SUPPORT) {
        System.out.println("Suporte financeiro ativado");
      } else if ( sucessor != null) {
          sucessor.handleRequest(request);
      }
  }
}
