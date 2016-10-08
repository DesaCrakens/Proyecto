package pck_items;

import pck_personaje.Personaje;
import pck_personaje.PersonajeEquipado;

public class ConGranAlmaCorrupta extends PersonajeEquipado {

	public ConGranAlmaCorrupta(Personaje personajeDecorado) {
		super(personajeDecorado);
	}

	@Override
	public int obtenerPuntosDeAtaque() {
		return Math.floorDiv(super.obtenerPuntosDeAtaque(), 2);
	}
	
}