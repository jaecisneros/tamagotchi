package ar.edu.Tamagotchi;

public class Aburrida implements Estado{

	int tiempoAburrida;
	
	@Override
	public void come(Mascota mascota) {
		if (tiempoAburrida > 80)
			mascota.setEstado(new Contenta());
	}

	@Override
	public void juga(Mascota mascota) {
		mascota.setEstado(new Contenta());
		
	}

	@Override
	public boolean podesJugar(Mascota mascota) {
		return true;
		
	}

}
