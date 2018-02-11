/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Color;
import java.awt.Rectangle;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author diegoalejandromarulandamarin
 */
public class tronco extends Thread {
    private float velocidad =1;
    private float x;
    private int y;
    private int alto;
    private int ancho;
    boolean bandera;
    private Rectangle colision;
    float xa;
    float xd;
    ImageIcon Dibujo = new ImageIcon(getClass().getResource("../imagenes/troncopeque.png"));
    boolean orientation;    
    public tronco() {
    }

    public tronco(int x, int y, boolean rightMove) {           
        this.ancho = 60;
        this.alto = 40;        
        this.x = x;
        this.y = y;
        this.bandera=true;
        this.xd=1;
        this.xa=-1;        
        this.orientation = rightMove;
        this.start();
    }
    public boolean getOrientacion(){
        return orientation;
    }
    public void setOrientacion(boolean orientacion){
        this.orientation=orientacion;
    }
    public ImageIcon getDibujo() {
        return Dibujo;
    }

    public void setDibujo(ImageIcon Dibujo) {
        this.Dibujo = Dibujo;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }


    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

    public boolean isBandera() {
        return bandera;
    }
   

    @Override
    public void run() {
        while(this.bandera == true){
            this.setColision(new Rectangle((int)x,y,ancho,alto));
            if (orientation == true){
                if (this.x + xd > 500)
                    setX(0);
                
                this.setX(this.getX() + this.xd);
                }
            if (orientation == false) {                
                if (this.x + this.xa < 0)
                    setX(500);
                
                this.setX(this.getX() + this.xa);
                }
            try {
                sleep(5);
            }
            catch (InterruptedException ex) {
                Logger.getLogger(tronco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    /**
     * @return the colision
     */
    public Rectangle getColision() {
        return colision;
    }

    /**
     * @param colision the colision to set
     */
    public void setColision(Rectangle colision) {
        this.colision = colision;
    }

    /**
     * @return the velocidad
     */
    public float getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
}
