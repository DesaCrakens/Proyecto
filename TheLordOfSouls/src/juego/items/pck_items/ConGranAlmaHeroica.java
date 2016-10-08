package pck_items;

import pck_personaje.Personaje;
import pck_personaje.PersonajeEquipado;

public class ConGranAlmaHeroica extends PersonajeEquipado {

	public ConGranAlmaHeroica(Personaje personajeDecorado) {
		super(personajeDecorado);
	}

	@Override
	public int obtenerPuntosDeAtaque() {
		return super.obtenerPuntosDeAtaque() + 10;
	}
	
}