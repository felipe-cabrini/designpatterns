package br.com.fiap.facade;

public class FacadeDemo {

  public static void main(String[] args) {
    //sem facade
    //ClimateControl climateControl = new ClimateControl();
    //Lighting lighting = new Lighting();
    //SoundSystem soundSystem = new SoundSystem();
   // lighting.turnOn();
   // climateControl.setTemperature(23);
    //soundSystem.playMusic("forro");

    //com facade
    HomeFacade home = new HomeFacade();
    home.arriveHome();
  }
}
