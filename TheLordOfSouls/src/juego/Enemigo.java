package juego;


public abstract class Enemigo implements Atacable {

	protected int energia = 100;
	protected int salud = 100;
	
	public final void atacar(Atacable atacado) {
		if (puedeAtacar()) {
			atacado.serAtacado(calcularPuntosDeAtaque());
			energia -= calcularPuntosDeAtaque();		
		}
	}


	protected abstract boolean puedeAtacar();
	protected abstract int calcularPuntosDeAtaque();
	
	
	@Override
	public void serAtacado(int dano) {
		this.salud -= dano;
	}



}
