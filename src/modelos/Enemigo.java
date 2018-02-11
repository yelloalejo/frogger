/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;

/**
 *
 * @author diegoalejandromarulandamarin
 */
public class Enemigo extends Thread{
    
    private float x;
    private int y;
    private int alto;
    private int ancho;
    private Rectangle colision;
    boolean bandera;
    float xa;
    float xd;
    ImageIcon Dibujo;
    boolean orientacion;
    private float velocidad = 1;
    
    public Enemigo() {
    }

    public Enemigo(int x, int y, int ancho, int alto, boolean isRight) {
        this.x = x;
        this.y = y;
        this.alto = alto;
        this.ancho = ancho;
        this.bandera = true;
        this.xd= 1;
        this.xa= -1;
        this.orientacion = isRight;        
        this.start();
    }
    public boolean getOrientacion(){
        return orientacion;
    }
    public void setOrientacion(boolean orientacion){
        this.orientacion=orientacion;
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

    @Override
    public void run() {
        while(this.bandera == true){
            this.colision = new Rectangle((int)x,y,ancho,alto);
            if (orientacion){
                this.Dibujo=new ImageIcon(getClass().getResource("../imagenes/carro2.png"));
                if (this.x + xd > 500)
                    setX(0);
                
                this.setX(this.getX() + this.xd);
                }
            if (!orientacion) {
                this.Dibujo=new ImageIcon(getClass().getResource("../imagenes/carro1.png"));
                if (this.x + this.xa < 0)
                    setX(500);
                
                this.setX((this.getX() + this.xa));
                }
            try {
                sleep(5);
            }
            catch (InterruptedException ex) {
                Logger.getLogger(Enemigo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
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