package personaje;

public class Engorgio implements Hechizo{
	
	int gastaMagia=30; //el valor de energia que reduce realizar este hechizo//
	
	public void afectar(Personaje personaje) {
		personaje.altura *= 2;
	}

	public int getGastaEnergia() {
		
		return gastaMagia;
	}
	
}
