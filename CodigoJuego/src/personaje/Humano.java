package personaje;

public class Humano extends Personaje{
	
	public Humano(){
		
		 this.fatiga=10;
		 this.energia=50;
		 this.salud=60;
		 this.agilidad=7;
		 this.defensa=7; 
		 this.raza="Humano";
	}
	
	@Override
	public int calcularPuntosDeAtaque(){
		
		return 7 + casta.calcularPuntosDeAtaque();
	}
	
	@Override
	protected boolean puedeAtacar(){
		
		return energia>=fatiga;
	}

	@Override
	public int obtenerPuntosDeDefensa() {
		
		return defensa + casta.obtenerPuntosDeDefensa();
	}
	
		
}
