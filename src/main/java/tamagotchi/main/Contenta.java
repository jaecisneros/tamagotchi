package tamagotchi.main;

public class Contenta implements Estado {

  @Override
  public void come(Mascota mascota) {
    mascota.incrementarFelicidad(1);
  }

  @Override
  public void jugar(Mascota mascota) {
    mascota.incrementarFelicidad(2);
  }

  @Override
  public boolean podesJugar(Mascota mascota) {
    return true;
  }
}
