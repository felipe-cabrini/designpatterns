package br.com.fiap.observer;

public class MainObserver {

  public static void main(String[] args) {
    //classe sujeito sendo observada
    TemperatureSensor sensor = new TemperatureSensor();

    //objetos observadores
    TemperatureAlert alert = new TemperatureAlert();
    EmailAlertTemperatureObserver emailAlertTemperatureObserver = new EmailAlertTemperatureObserver();


    //adicionando na lista de objetos a serem notificados
    sensor.addObserver(alert);
    sensor.addObserver(emailAlertTemperatureObserver);

    sensor.generateTemperate();

    sensor.removeObserver(emailAlertTemperatureObserver);

    sensor.generateTemperate();

  }
}
