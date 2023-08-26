package br.com.fiap.state;

public class AuthenticatedState implements AuthState {
  @Override
  public boolean login(String userName, String password) {
    System.out.println("Não é possível fazer login, usuário jaá está autenticado");
    return false;
  }

  @Override
  public boolean logout() {
    System.out.println("Logout com sucesso");
    return true;
  }

  @Override
  public void checkStatus() {
    System.out.println("Estado: Autenticado");
  }
}
