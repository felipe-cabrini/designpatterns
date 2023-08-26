package br.com.fiap.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TemperatureSensor {

  private List<TemperatureObserver> observers = new ArrayList<>();

  private int temperature;

  public void addObserver(TemperatureObserver observer) {
    this.observers.add(observer);
  }

  public void removeObserver(TemperatureObserver observer) {
    this.observers.remove(observer);
  }

  public void generateTemperate() {
    Random random = new Random();
    temperature = random.nextInt(101);
    System.out.println("nova temperatura " + temperature);

    notifyObservers();
  }

  private void notifyObservers() {
      observers.forEach(o -> o.update(temperature));
  }
}
