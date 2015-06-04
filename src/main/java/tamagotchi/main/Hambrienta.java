package tamagotchi.main;

public class Hambrienta implements Estado {

	@Override
	public void come(Mascota mascota) {
		mascota.setEstado(new Contenta());
		
	}

	@Override
	public void juga(Mascota mascota) {
		
	}

	@Override
	public boolean podesJugar(Mascota mascota) {
		return false;
		
	}

}
