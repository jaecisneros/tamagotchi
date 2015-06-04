package tamagotchi.main;

public interface Estado {

	public void come(Mascota mascota);
	
	public void juga(Mascota mascota);
	
	public boolean podesJugar(Mascota mascota);
	
}
