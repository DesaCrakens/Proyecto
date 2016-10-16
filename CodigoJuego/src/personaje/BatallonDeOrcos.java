package personaje;

public class BatallonDeOrcos extends Batallon{
	
	private int ultimoIndice = -1;
	
	@Override
	public void atacar(Batallon otro){
		
		Atacable victima = otro.obtenerProximaVictima();
		
		for(Personaje atacante : batallon){
			atacante.atacar(victima);
		}
		
	}
	
	public boolean agregar(Orco personaje){
		
		return batallon.add(personaje);
	}
	
	@Override
	public Atacable obtenerProximaVictima(){
		depurarBatallon();
		
		if(batallon.isEmpty()){
			throw new RuntimeException("El batallon de orcos esta vacio");
		}
		
		this.ultimoIndice = (this.ultimoIndice + 1) % this.batallon.size(); //no entiendo el %//solo con this.ultimoIndice+1 tendria que andar// 
		
		return batallon.get(this.ultimoIndice);
	}
}
