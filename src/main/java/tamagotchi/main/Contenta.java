package tamagotchi.main;

public class Contenta implements Estado {

	@Override
	public void come(Mascota mascota) {
		mascota.incrementarFelicidad(1);
		
	}

	@Override
	public void juga(Mascota mascota) {
		
	}

	@Override
	public boolean podesJugar(Mascota mascota) {
		return true;		
	}

}
