package ar.edu.Tamagotchi;

public class Mascota {

	int nivelContenta;
	Estado estado;
	
	public Mascota(int nivelContenta, Estado estado){
		this.nivelContenta = nivelContenta;
		this.estado = estado;
	}
	
	public void come(){
		this.estado.come(this);
	}
	
	public void podesJugar(){
		this.estado.podesJugar(this);
	}
	
	public void juga(){
		this.estado.juga(this);
	}
	
	public Estado getEstado(){
		return this.estado;
	}
	
	public void incrementarFelicidad(int cant){
		this.nivelContenta += cant;
	}
	
	public int cuanContentaEstas(){
		return nivelContenta;
	}
	
	public void setEstado(Estado estado){
		this.estado = estado;
	}

}
