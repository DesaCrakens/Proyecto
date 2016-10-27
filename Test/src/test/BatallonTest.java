package test;

import org.junit.Assert;
import org.junit.Test;

import Batallones.Batallon;
import personaje.Especialidad;
import personaje.Guerrero;
import personaje.Hechicero;
import personaje.Humano;
import personaje.Orco;

public class BatallonTest {
	
	@Test
	public void queOrcosSeTurnanParaRecibirPaliza(){
		
		Batallon humanos = new Batallon();
		Humano primerHumano = new Humano();
		Especialidad c=new Hechicero();
		primerHumano.setCasta(c);
		primerHumano.bonificacionDeCasta();
		humanos.agregar(primerHumano);
		Humano segundoHumano = new Humano();
		c=new Guerrero();
		segundoHumano.setCasta(c);
		segundoHumano.bonificacionDeCasta();
		humanos.agregar(segundoHumano);
		Humano tercerHumano = new Humano();
		c=new Guerrero();
		tercerHumano.setCasta(c);
		tercerHumano.bonificacionDeCasta();
		humanos.agregar(tercerHumano);
		
		Batallon orcos = new Batallon();
		Orco primerOrco = new Orco();
		c=new Hechicero();
		primerOrco.setCasta(c);
		primerOrco.bonificacionDeCasta();
		orcos.agregar(primerOrco);
		Orco segundoOrco = new Orco();
		c=new Guerrero();
		primerOrco.setCasta(c);
		primerOrco.bonificacionDeCasta();
		orcos.agregar(segundoOrco);
		
		Assert.assertEquals(76, primerOrco.getSalud());
		Assert.assertEquals(70, segundoOrco.getSalud());
		
		humanos.atacar(orcos);
		
		Assert.assertEquals(56, primerOrco.getSalud()); 
		Assert.assertEquals(70, segundoOrco.getSalud());
		
		humanos.atacar(orcos);
		
		Assert.assertEquals(36, primerOrco.getSalud()); 
		Assert.assertEquals(70, segundoOrco.getSalud());
		
	}

}
