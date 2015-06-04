package tamagotchi.tests;

import java.time.LocalDate;
import java.time.LocalTime;

import junit.framework.Assert;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import tamagotchi.main.Aburrida;
import tamagotchi.main.Contenta;
import tamagotchi.main.Estado;
import tamagotchi.main.Hambrienta;
import tamagotchi.main.Mascota;

public class testEstados {
	
	Mascota pepita;
	Hambrienta hambrienta;
	Aburrida aburrida;
	Contenta contenta;
	Mascota pepitaMock = mock(Mascota.class);
	
	@Before
	public void setUp(){
		hambrienta = new Hambrienta();
		aburrida = new Aburrida();
		contenta = new Contenta();
	}
	
	//Tests jugar TypeTest
	
	@Test
	public void testJugaAburridaAContentaTypeTest(){
		pepita = new Mascota(10, aburrida);
		pepita.juga();
		Assert.assertEquals(Contenta.class, pepita.getEstado().getClass());
	}
	
	@Test
	public void testJuegaContentaYAumentaFelicidad(){
		pepita = new Mascota(10, contenta);
		pepita.juga();
		Assert.assertEquals(12, pepita.cuanContentaEstas());
	}
	
	@Test
	public void testJuegaHambrientaYNoPasaNada(){
		pepita = new Mascota(10, hambrienta);
		pepita.juga();
		Assert.assertEquals(Hambrienta.class, pepita.getEstado().getClass());
	}
	
	//Tests come TypeTest
	
	@Test
	public void testComeHambrientaPasaContentaTypeTest(){
		pepita = new Mascota(10, hambrienta);
		pepita.come();
		Assert.assertEquals(pepita.getEstado().getClass(), Contenta.class);
	}
	
	@Test
	public void testComeContentaYAumentaFelicidad(){
		pepita = new Mascota(10, contenta);
		pepita.come();
		Assert.assertEquals(11, pepita.cuanContentaEstas());
	}
	
	@Test
	public void testComeAburridaYNoPasaNada(){
		pepita = new Mascota(10, aburrida);
		pepita.come();
		Assert.assertEquals(pepita.getEstado().getClass(), Aburrida.class);;
	}
	
	@Test
	public void testComeAburridaLuegoDeMasDe80Mis(){
		pepita = new Mascota(10, aburrida);
		LocalTime minutos = LocalTime.now().plusMinutes(90);
		aburrida.setTiempoAburrida(minutos);
		pepita.come();
		Assert.assertEquals(pepita.getEstado().getClass(), Contenta.class);;
	}
	
}