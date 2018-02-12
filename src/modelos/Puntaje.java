/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Rectangle;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author diegoalejandromarulandamarin
 */
public class Puntaje  extends Thread{
    
    private int puntos = 0;
    
    
    
    
    public Puntaje(){
    }

    /**
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    @Override
    public void run() {
        
        
        
        try {
            sleep(5);
        }
        catch (InterruptedException ex) {
            Logger.getLogger(Enemigo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

