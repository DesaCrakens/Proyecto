package personaje;

public class Elfo extends Personaje{
	
	public Elfo(){
		
		 this.fatiga=10;
		 this.energia=60;
		 this.salud=50;
		 this.agilidad=10;
		 this.defensa=10; 
		 this.raza="Elfo";
	}
	
	@Override
	protected boolean puedeAtacar() {
		
		return energia >= fatiga;
		
	}

	@Override
	public int calcularPuntosDeAtaque() {
		
		return 5 + casta.calcularPuntosDeAtaque();
	}

	@Override
	public int obtenerPuntosDeDefensa() {
		
		return defensa + casta.obtenerPuntosDeDefensa();
	}

}
