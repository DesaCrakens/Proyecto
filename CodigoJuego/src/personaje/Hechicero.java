package personaje;

import java.util.HashMap;
import java.util.Map;

public class Hechicero extends Especialidad{
	
private Map<String, Hechizo> hechizos = new HashMap<String, Hechizo>();


	public Hechicero(){
		
		this.hechizos=new HashMap<String, Hechizo>();
		this.magia=50;
		this.energia=-6;
		this.salud=0;
		this.agilidad=-6;
		
		this.nombre="Hechicero";
		this.descripcion="\nLos hechiceros son lanzadores de conjuros arcanos que manipulan la energía mágica con imaginación y talento, más que con una disciplina de estudio. "
				+ 		 "No tienen libros ni mentores ni teorías: sólo un poder en bruto que dirigen a voluntad."
				+        " Ya que los hechiceros ganan sus poderes sin pasar por los años de estudio riguroso, tienen más tiempo para aprender habilidades de lucha y son competentes con las armas sencillas";
	}
	
	
	public void agregarHechizo(String conjuro, Hechizo hechizo) {
		
		this.hechizos.put(conjuro, hechizo);
	}
	
	public int getCantidadDeHechizos() {
		
		return this.hechizos.size();
	}

	public void hechizar(String conjuro, Personaje personaje) {
		
		int aux=this.hechizos.get(conjuro).getGastaEnergia();
		
		if(aux<=magia)
		{
			this.hechizos.get(conjuro).afectar(personaje);
			magia-=aux;//aca se restaria el valor de magia que gasta el conjuro a la magia//
		}
		else
		{
			System.out.println("No se posee la magia necesaria para realizar el hechizo");
		}
	}
	
	@Override
	public int calcularPuntosDeAtaque() {
		
		return 10;
	}

	@Override
	public int obtenerPuntosDeDefensa() {
		
		return 6;
	}
}
