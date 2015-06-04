package tamagotchi.main;

import java.time.LocalTime;

public class Aburrida implements Estado{

	LocalTime tiempoAburrida;
	
	public Aburrida(){
		this.tiempoAburrida = LocalTime.now();
	}
	
	@Override
	public void come(Mascota mascota) {
		if (tiempoAburrida.minusMinutes(80).isAfter(LocalTime.now()))
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

	public void setTiempoAburrida(LocalTime minutos) {
		this.tiempoAburrida = minutos;
		
	}

	public LocalTime getMinutos() {
		return tiempoAburrida;
	}

}
