package tamagotchi.main;

import java.time.LocalTime;

public class Aburrida implements Estado{

	LocalTime tiempoAburrida;
	
	public Aburrida(){
		this.tiempoAburrida = LocalTime.now();
	}
	
	@Override
	public void come(Mascota mascota) {
		if (tiempoAburrida.getMinute() > 80)
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
