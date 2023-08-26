package br.com.fiap.state;

public class NotAuthenticateState implements AuthState{
  @Override
  public boolean login(String userName, String password) {
    if("correctpassword".equals(password)) {
      System.out.println("login bem-sucedido para o usuário: "+ userName);
      return true;
    } else {
      System.out.println("falha no login para o usuário: "+ userName);
      return false;
    }
  }

  @Override
  public boolean logout() {
    System.out.println("Não é possível fazer logout, usuário não estaá autenticado");
    return false;
  }

  @Override
  public void checkStatus() {
    System.out.println("Estado: não autenticado");
  }
}
