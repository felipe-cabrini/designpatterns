package br.com.fiap.observer;

public class EmailAlertTemperatureObserver  implements TemperatureObserver{
  @Override
  public void update(int temperature) {
    System.out.println("Email enviado com alerta de criticidade de temperatura:" + temperature);
  }
}
