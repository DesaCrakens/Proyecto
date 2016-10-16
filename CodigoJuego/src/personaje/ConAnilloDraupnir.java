package personaje;

public class ConAnilloDraupnir extends PersonajeEquipado{
	private Personaje p;
	private int anillo=2;
	
	public ConAnilloDraupnir(Personaje p){
		
		this.p=p;
	}
	
	@Override
	public int calcularPuntosDeAtaque() {
		
		return (this.p.calcularPuntosDeAtaque()*anillo);
	}

	@Override
	public int obtenerPuntosDeDefensa() {
		
		return this.p.calcularPuntosDeAtaque();
	}

	@Override
	protected boolean puedeAtacar() {
		
		return this.p.puedeAtacar();
	}
	
	
}
