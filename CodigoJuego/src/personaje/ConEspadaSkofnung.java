package personaje;

public class ConEspadaSkofnung extends PersonajeEquipado {
	private Personaje p;
	private int espada=5;
	
	
	public ConEspadaSkofnung(Personaje p){
		
		this.p=p;
	}

	@Override
	public int calcularPuntosDeAtaque() {
		
		return (this.p.calcularPuntosDeAtaque()+this.espada);
	}

	protected boolean puedeAtacar() {
		
		return this.p.puedeAtacar();
	}

	@Override
	public int obtenerPuntosDeDefensa() {
		
		return this.p.obtenerPuntosDeDefensa();
	}
}
