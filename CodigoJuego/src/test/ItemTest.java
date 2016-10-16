package test;

import org.junit.Assert;
import org.junit.Test;

import personaje.ConAnilloDraupnir;
import personaje.ConEscudoSvalinn;
import personaje.ConEspadaSkofnung;
import personaje.Especialidad;
import personaje.Hechicero;
import personaje.Humano;
import personaje.Personaje;

public class ItemTest {
	
	/*
     * Especificación de Items
     * ~~~~~~~~~~~~~~~~~~~~~~~
     * ConEspadaSkofnung: Esta espada aumenta en 5 pts el ataque
     * ConEscudoSvalinn: Este escudo otorga 10 pts de defensa
     * ConAnilloDraupnir: Este anillo multiplica el ataque x2
     */
   
    @Test
    public void quePuedoAgregarItemDeAtaque() {
 
        Personaje sigmund = new Humano();
        Especialidad casta= new Hechicero();
        sigmund.setCasta(casta);
        sigmund.bonificacionDeCasta();
        
        Assert.assertEquals(10, sigmund.calcularPuntosDeAtaque());
 
        // agrego item de ataque
        sigmund = new ConEspadaSkofnung(sigmund);
        Assert.assertEquals(5 + 10, sigmund.calcularPuntosDeAtaque());
    }
 
   
   @Test
    public void quePuedoAgregarAmbosItems() {
 
	    Personaje sigmund = new Humano();
        Especialidad casta= new Hechicero();
        sigmund.setCasta(casta);
        sigmund.bonificacionDeCasta();
        Assert.assertEquals(10, sigmund.calcularPuntosDeAtaque());
 
        // agrego item de ataque
        sigmund = new ConEspadaSkofnung(sigmund);
        Assert.assertEquals(5 + 10, sigmund.calcularPuntosDeAtaque());
 
        Assert.assertEquals(0, sigmund.obtenerPuntosDeDefensa());
        sigmund = new ConEscudoSvalinn(sigmund);
        // agrego defensa
        Assert.assertEquals(10 + 0, sigmund.obtenerPuntosDeDefensa());
        // y no pierdo ataque
        Assert.assertEquals(5 + 10, sigmund.calcularPuntosDeAtaque());
    }
    
    @Test
    public void quePuedoAgregarDosTiposDeItem() {
    	
    	Personaje sigmund = new Humano();
        Especialidad casta= new Hechicero();
        sigmund.setCasta(casta);
        sigmund.bonificacionDeCasta();
        
        Assert.assertEquals(10, sigmund.calcularPuntosDeAtaque());
 
        // agrego item de ataque
        sigmund = new ConEspadaSkofnung(sigmund);
        Assert.assertEquals(5 + 10, sigmund.calcularPuntosDeAtaque());
 
        // agrego anillo multiplicador (x2)
        sigmund = new ConAnilloDraupnir(sigmund);
        Assert.assertEquals((5 + 10) * 2, sigmund.calcularPuntosDeAtaque());
    }

}
