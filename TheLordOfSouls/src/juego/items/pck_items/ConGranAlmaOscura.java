package pck_items;

import pck_personaje.Personaje;
import pck_personaje.PersonajeEquipado;

public class ConGranAlmaOscura extends PersonajeEquipado {

	public ConGranAlmaOscura(Personaje personajeDecorado) {
		super(personajeDecorado);
	}

	@Override
	public int obtenerPuntosDeAtaque() {
		return super.obtenerPuntosDeAtaque() - 10;
	}
	
}