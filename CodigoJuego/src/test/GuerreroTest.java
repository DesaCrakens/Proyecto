package test;

import personaje.Elfo;
import personaje.Especialidad;
import personaje.Guerrero;
import personaje.Humano;
import personaje.Orco;
import personaje.Personaje;

public class GuerreroTest {
	
	public static void main(String[] args) {
		
		Personaje personaje=new Elfo(); //puede ser un Orco, un Humano o un Elfo//
		Especialidad casta=new Guerrero();
		personaje.setCasta(casta);
		personaje.bonificacionDeCasta(); //genero mi guerrero//
		
		System.out.println("El ataque en posicion normal del guerrero es :" + personaje.calcularPuntosDeAtaque());
		System.out.println("La defensa en posicion normal del guerrero es :" + personaje.obtenerPuntosDeDefensa());
		
		
		//posicion agresiva//
		
		System.out.println("\nEl guerrero adopta una posicion agresiva");
		
		personaje.getCasta().getGuerrero().posicionAgresiva(); //accedo desde la casta a la habilidad 1 que es la de posicion Agresiva//
		
		System.out.println("\nEl ataque del personaje cambia a " + personaje.calcularPuntosDeAtaque());
		System.out.println("\nLa defensa del personaje cambia a " + personaje.obtenerPuntosDeDefensa());
		
		//posicion defensiva//
		
		System.out.println("\nEl guerrero adopta una posicion defensiva");
		
		personaje.getCasta().getGuerrero().posicionDefensiva(); //accedo desde la casta a la habilidad 2 que es la de posicion defensiva//
		
		System.out.println("\nEl ataque del personaje cambia a " + personaje.calcularPuntosDeAtaque());
		System.out.println("\nLa defensa del personaje cambia a " + personaje.obtenerPuntosDeDefensa());
		
		//posicion normal//
		
		System.out.println("\nEl guerrero vuelve a su estado normal");
		
		personaje.getCasta().getGuerrero().posicionNormal();
		
		System.out.println("El ataque en posicion normal del guerrero es :" + personaje.calcularPuntosDeAtaque());
		System.out.println("La defensa en posicion normal del guerrero es :" + personaje.obtenerPuntosDeDefensa());
	}
}
