package br.com.fiap.state;

public class BlockedState implements AuthState {
  @Override
  public boolean login(String userName, String password) {
    System.out.println("Conta bloqueada. não é possível fazer login.");
    return false;
  }

  @Override
  public boolean logout() {
    System.out.println("realizando logout.");
    return true;
  }

  @Override
  public void checkStatus() {
    System.out.println("Estado: Bloqueado");
  }
}
