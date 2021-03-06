package pck_personaje;

public class Elfo extends Personaje {
	
	int cantidadDeAtaques;
	
	@Override
	protected void despuesDeAtacar() {
		cantidadDeAtaques++;
	}
	
	@Override
	protected int calcularPuntosDeAtaque() {
		return 10 + cantidadDeAtaques;
	}

	@Override
	protected boolean puedeAtacar() {
		return energia >= calcularPuntosDeAtaque();
	}
	
	@Override
	public int obtenerPuntosDeDefensa() {
		return 50;
	}
}