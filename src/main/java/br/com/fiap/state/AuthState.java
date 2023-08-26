package br.com.fiap.state;

public interface AuthState {

  boolean login(String userName, String password);

  boolean logout();

  void checkStatus();
}
