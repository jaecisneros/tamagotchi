package ar.edu.Tamagotchi;

import org.junit.Before;

public class testEstados {
	
	Mascota pepita;
	Hambrienta hambrienta;
	Aburrida aburrida;
	Contenta contenta;
	
	@Before
	public void setUp(){
		hambrienta = new Hambrienta();
		aburrida = new Aburrida();
		contenta = new Contenta();
		pepita = new Mascota(10, contenta);
	}
}