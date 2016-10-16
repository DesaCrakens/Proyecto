package personaje;

public abstract class Personaje implements Atacable {
	
	protected String nombrePersonaje;
	protected int energia;
	protected int salud;
	protected int agilidad;
	protected int defensa;
	protected int fatiga;
	protected Especialidad casta; //Guerrero, Hechicero, Ladron ...etc// //modificado//
	protected String raza; //Humano, Orco, Elfo //
	public int altura;

	public final void atacar(Atacable atacado){
		
		if(puedeAtacar()){
			
			atacado.serAtacado(calcularPuntosDeAtaque()); //modificado//
			energia-= fatiga; //sugiero metodo aparte para calcular la energia que gasta//
			despuesDeAtacar();
		}
	}
	
	protected void despuesDeAtacar(){ }
	
	protected abstract boolean puedeAtacar();
	
	public abstract int calcularPuntosDeAtaque();
	
	public abstract int obtenerPuntosDeDefensa();
	
	protected boolean estaVivo(){
		
		if(this.salud<=0)
			return false;
		
		return true;
	}
	
	public void serAtacado(int daño){
		
		if((daño - defensa) > 0)
			this.salud-=(daño - defensa); //el daño de reduce en base a la defensa del personaje//
		else
			this.salud-= 3; //daño por defecto//
	}
	
	public void serCurado(){ //se usaria cuando el Hechicero cura o cuando se este en la posada descansando//
		this.salud=100;
	}
	
	public void serEnergizado(){ //se usaria al finalizar cada batalla//
		this.energia=100;
	}
	
	public Especialidad getCasta() {
		return casta;
	}
	
	public void setCasta(Especialidad casta) {
		this.casta = casta;
	}
	
	public int getSalud(){
		
		return this.salud;
	}
	
	public int getEnergia() {
		return energia;
	}
	
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public String getNombrePersonaje() {
		return nombrePersonaje;
	}

	public void setNombrePersonaje(String nombrePersonaje) {
		this.nombrePersonaje = nombrePersonaje;
	}
	
	public void bonificacionDeCasta(){
		
		this.salud+=this.casta.salud;
		this.defensa+=this.casta.defensa;
		this.energia+=this.casta.energia;
		this.agilidad+=this.casta.agilidad;
	}

	@Override
	public String toString() {
		return "nombrePersonaje=" + nombrePersonaje + "\nCaracteristicas [energia="
				+ energia + ", salud=" + salud + ", agilidad=" + agilidad
				+ ", defensa=" + defensa + ", magia=" + casta.magia + ", casta=" + casta.nombre + ", raza="
				+ raza + "]" + "\nDescripcion Casta: " + casta.descripcion;
	}
}
