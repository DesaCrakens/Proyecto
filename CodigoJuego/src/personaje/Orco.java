package personaje;

public class Orco extends Personaje{
	
	int cantidadDeAtaques;
	
	public Orco(){
		
		 this.fatiga=10;
		 this.energia=40;
		 this.salud=70;
		 this.agilidad=5;
		 this.defensa=7; 
		 this.raza="Orco";
	}
	
	
	@Override
	public void despuesDeAtacar() {
		
		cantidadDeAtaques++;
	}
	
	@Override
	public int calcularPuntosDeAtaque() {
		
		return 10 + cantidadDeAtaques + casta.calcularPuntosDeAtaque();
	}

	@Override
	protected boolean puedeAtacar() {
		
		return energia >= fatiga;
}


	@Override
	public int obtenerPuntosDeDefensa() {
		
		return defensa + casta.obtenerPuntosDeDefensa();
	}
	
}
