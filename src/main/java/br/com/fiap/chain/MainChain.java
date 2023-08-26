package br.com.fiap.chain;

public class MainChain {

  public static void main(String[] args) {
    SupportHandler refundHandler = getSupportHandler();

    SupportRequest refundRequest = new SupportRequest(SupportRequest.Type.REFUND);
    refundHandler.handleRequest(refundRequest);

    SupportRequest exchangeRequest = new SupportRequest(SupportRequest.Type.EXCHANGE);
    refundHandler.handleRequest(exchangeRequest);

    SupportRequest technicalRequest = new SupportRequest(SupportRequest.Type.TECHNICAL);
    refundHandler.handleRequest(technicalRequest);

    SupportRequest otherRequest = new SupportRequest(SupportRequest.Type.OTHER);
    refundHandler.handleRequest(otherRequest);

    SupportRequest financialSupportRequest = new SupportRequest(SupportRequest.Type.FINANCIAL_SUPPORT);
    refundHandler.handleRequest(financialSupportRequest);
  }

  private static SupportHandler getSupportHandler() {
    SupportHandler refundHandler = new RefundHandler();
    SupportHandler exchangeHandler = new ExchangeHandler();
    SupportHandler technicalSupportHandler = new TechnicalSupportHandler();
    SupportHandler financialHandler = new FinancialSupportHandler();
    refundHandler.setSucessor(financialHandler);
    financialHandler.setSucessor(exchangeHandler);
    exchangeHandler.setSucessor(technicalSupportHandler);
    return refundHandler;
  }
}
