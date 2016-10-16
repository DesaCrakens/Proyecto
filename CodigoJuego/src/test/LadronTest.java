package test;

import personaje.Elfo;
import personaje.Especialidad;
import personaje.Ladron;
import personaje.Personaje;

public class LadronTest {

	public static void main(String[] args) {
		
		Personaje personaje=new Elfo(); //puede ser un Orco, un Humano o un Elfo//
		Especialidad casta=new Ladron();
		personaje.setCasta(casta);
		personaje.bonificacionDeCasta(); //genero mi guerrero//
		
		System.out.println("El ataque en posicion normal del ladron es :" + personaje.calcularPuntosDeAtaque());
		System.out.println("La defensa en posicion normal del ladron es :" + personaje.obtenerPuntosDeDefensa());
		
		
		//daño critico//
		
		System.out.println("\nEl ladron utiliza dañoCritico");
		
		personaje.getCasta().getLadron().dañoCritico(personaje.getDefensa()); //accedo desde la casta a la habilidad 1 que es la de daño critico//
		
		System.out.println("\nEl ataque del personaje cambia a " + personaje.calcularPuntosDeAtaque());
		System.out.println("\nLa defensa del personaje cambia a " + personaje.obtenerPuntosDeDefensa());
	}
	
}
