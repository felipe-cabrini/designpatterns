package br.com.fiap.state;

public class AuthenticationSystem {

  private AuthState state;

  public AuthenticationSystem() {
    state = new NotAuthenticateState();
  }

  public void setState(AuthState state) {
    this.state = state;
  }

  public void login(String userName, String password) {
    if(state.login(userName,password)) {
      setState(new AuthenticatedState());
    }
  }

  public void logout() {
    if(state.logout()) {
      setState(new NotAuthenticateState());
    }
  }

  public void block(String userName) {
    System.out.println("realizando bloqueio: " +userName);
    setState(new BlockedState());
  }

  public void checkStatus() {
    state.checkStatus();
  }
}
