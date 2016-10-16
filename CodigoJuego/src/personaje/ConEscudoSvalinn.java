package personaje;

public class ConEscudoSvalinn extends PersonajeEquipado{
	private Personaje p;
	private int escudo=10;
	
	public ConEscudoSvalinn(Personaje p){
		
		this.p=p;
	}
	
	public int obtenerPuntosDeDefensa(){
		
		return (this.p.obtenerPuntosDeDefensa()+this.escudo);
	}
	
	@Override
	protected boolean puedeAtacar() {
		
		return this.puedeAtacar();
	}

	@Override
	public int calcularPuntosDeAtaque() {
		
		return this.p.calcularPuntosDeAtaque();
	}
}
