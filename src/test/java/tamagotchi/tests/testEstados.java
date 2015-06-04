package tamagotchi.tests;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import tamagotchi.main.Aburrida;
import tamagotchi.main.Contenta;
import tamagotchi.main.Hambrienta;
import tamagotchi.main.Mascota;

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
		pepita = new Mascota(10, aburrida);
	}
	
	@Test
	public void testAburridaAContentaTypeTest(){
		pepita.juga();
		Assert.assertEquals(pepita.getEstado().getClass(), Contenta.class);
	}
}