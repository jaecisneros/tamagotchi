package tamagotchi.main;

public interface Estado {

  public void come(Mascota mascota);

  public void jugar(Mascota mascota);

  public boolean podesJugar(Mascota mascota);
}
