package br.com.fiap.observer;

public class TemperatureAlert implements TemperatureObserver {
  @Override
  public void update(int temperature) {
    System.out.println("ALERTA DE TEMPERATURA: temperatura critica detectada: " + temperature);
  }
}
