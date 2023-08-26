package br.com.fiap.state;

public class MainState {

  public static void main(String[] args) {
    AuthenticationSystem system = new AuthenticationSystem();
    system.checkStatus();
    system.login("usuario1234","senha incorreta");
    system.checkStatus();
    system.logout();
    system.checkStatus();

    system.login("usuario1234","correctpassword");
    system.checkStatus();
    system.logout();
    system.checkStatus();


    system.login("usuario1234","correctpassword");
    system.checkStatus();

    system.block("usuario1234");
    system.checkStatus();
    system.logout();
    system.checkStatus();
    system.login("usuario1234","correctpassword");
    system.checkStatus();

    system.block("usuario1234");
    system.checkStatus();
    system.login("usuario1234","correctpassword");
    system.checkStatus();

  }
}
