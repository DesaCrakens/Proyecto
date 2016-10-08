package pck_items;

import pck_personaje.Personaje;
import pck_personaje.PersonajeEquipado;

public class ConGranAlmaDelCoraje extends PersonajeEquipado {

	public ConGranAlmaDelCoraje(Personaje personajeDecorado) {
		super(personajeDecorado);
	}

	@Override
	public int obtenerPuntosDeAtaque() {
		return super.obtenerPuntosDeAtaque() * 2;
	}
	
}