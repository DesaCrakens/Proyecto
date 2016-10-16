package test;

import org.junit.Assert;
import org.junit.Test;
import personaje.BatallonDeHumanos;
import personaje.BatallonDeOrcos;
import personaje.Humano;
import personaje.Orco;

public class BatallonTest {
	
	@Test
	public void queOrcosSeTurnanParaRecibirPaliza(){
		
		BatallonDeHumanos humanos = new BatallonDeHumanos();
		Humano primerHumano = new Humano();
		humanos.agregar(primerHumano);
		Humano segundoHumano = new Humano();
		humanos.agregar(segundoHumano);
		Humano tercerHumano = new Humano();
		humanos.agregar(tercerHumano);
		
		BatallonDeOrcos orcos = new BatallonDeOrcos();
		Orco primerOrco = new Orco();
		orcos.agregar(primerOrco);
		Orco segundoOrco = new Orco();
		orcos.agregar(segundoOrco);
		
		Assert.assertEquals(100, primerOrco.getSalud());
		Assert.assertEquals(100, segundoOrco.getSalud());
		
		humanos.atacar(orcos);
		
		Assert.assertEquals(70, primerOrco.getSalud()); //los humanos atacan los 3 al primer orco//
		Assert.assertEquals(100, segundoOrco.getSalud());
		
		humanos.atacar(orcos);
		
		Assert.assertEquals(70, primerOrco.getSalud()); //los humanos atacan los 3 al segundo orco//
		Assert.assertEquals(70, segundoOrco.getSalud());
		
	}
	
	@Test
	public void queHumanosSeRecibirPalizaDeAUno(){
		
		BatallonDeOrcos orcos = new BatallonDeOrcos();
		Orco primerOrco = new Orco();
		orcos.agregar(primerOrco);
		Orco segundoOrco = new Orco();
		orcos.agregar(segundoOrco);
		Orco tercerOrco = new Orco();
		orcos.agregar(tercerOrco);
		
		BatallonDeHumanos humanos = new BatallonDeHumanos();
		Humano primerHumano = new Humano();
		humanos.agregar(primerHumano);
		Humano segundoHumano = new Humano();
		humanos.agregar(segundoHumano);
		
		Assert.assertEquals(100, primerHumano.getSalud());
		Assert.assertEquals(100, segundoHumano.getSalud());
		
		orcos.atacar(humanos);
		
		Assert.assertEquals(70, primerHumano.getSalud()); //los orcos atacan los 3 al primer humano//
		Assert.assertEquals(100, segundoHumano.getSalud());
		
		orcos.atacar(humanos);
		
		Assert.assertEquals(37, primerHumano.getSalud()); //los orcos atacan los 3 nuevamente al mismo humano...hasta quese muera//
		Assert.assertEquals(100, segundoHumano.getSalud());
		
		orcos.atacar(humanos);
		
		Assert.assertEquals(1, primerHumano.getSalud()); //los orcos atacan los 3 nuevamente al mismo humano...hasta quese muera//
		Assert.assertEquals(100, segundoHumano.getSalud());
		
		orcos.atacar(humanos);
		
		Assert.assertEquals(-38, primerHumano.getSalud()); //los orcos atacan los 3 nuevamente al mismo humano...hasta quese muera//
		Assert.assertEquals(100, segundoHumano.getSalud());
	}

}
