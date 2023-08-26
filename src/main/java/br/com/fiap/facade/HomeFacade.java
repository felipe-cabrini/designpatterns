package br.com.fiap.facade;

public class HomeFacade {

  private Lighting lighting;
  private ClimateControl climateControl;
  private SoundSystem soundSystem;

  public HomeFacade() {
    this.lighting = new Lighting();
    this.climateControl = new ClimateControl();
    this.soundSystem = new SoundSystem();
  }

  public void arriveHome() {
    lighting.turnOn();
    climateControl.setTemperature(16);
    soundSystem.playMusic("jazz");
  }
}
