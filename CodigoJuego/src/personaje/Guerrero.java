package personaje;

public class Guerrero extends Especialidad{
	
	protected int efectoFuerza=0;
	protected int efectoDefensa=0;
	
	public Guerrero(){
		
		this.energia=6;
		this.salud=6;
		this.agilidad=-6;
		
		
		this.nombre="Guerrero";
		
		this.descripcion="\nLos Guerreros sobresalen en combate derrotando a sus enemigos, controlando el flujo de la batalla, y sobreviviendo a incursiones."
				+ 		 " Si bien sus armas y métodos específicos les conceden una amplia variedad de tácticas, pocos pueden igualar a los guerreros en la destreza de la pura batalla."
				+ 		 " Pueden optar por una postura defensiva o agresiva en cualqueir batalla.";
	}
	
	public void posicionAgresiva(){ //si se escoge la habilidad 1//
		
		this.efectoFuerza=6;
		this.efectoDefensa=-6;
	}
	
	public void posicionDefensiva(){ //si se escoge la habilidad 2//
		
		this.efectoFuerza=-6;
		this.efectoDefensa=6;
	}
	
	public void posicionNormal(){ //si se escoge la habilidad 0//
		
		this.efectoDefensa=0;
		this.efectoFuerza=0;
	}
	
	@Override
	public int calcularPuntosDeAtaque() {
		
		return (20 + efectoFuerza);
	}

	@Override
	public int obtenerPuntosDeDefensa() {
		
		return (10 + efectoDefensa);
	}

}
