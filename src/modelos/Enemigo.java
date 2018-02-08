/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import frogger.dibujo;
import java.awt.Color;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;

/**
 *
 * @author diegoalejandromarulandamarin
 */
public class Enemigo implements Runnable{
    
    private int x;
    private int y;
    private int alto;
    private int ancho;
    private Color fondo;
    boolean bandera;
    int xa;
    int ya;
    ImageIcon Dibujo;
    
    public Enemigo() {
    }

    public Enemigo(int x, int y, int alto, int ancho, Color fondo) {
        this.x = x;
        this.y = y;
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fondo;
        this.bandera=true;
        this.xa=1;
        this.ya=-1;
        this.Dibujo=new ImageIcon(getClass().getResource("../imagenes/carro1.png"));
    }
    public ImageIcon getDibujo() {
        return Dibujo;
    }

    public void setDibujo(ImageIcon Dibujo) {
        this.Dibujo = Dibujo;
    }

    
    
    
    
    
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
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

    public Color getFondo() {
        return fondo;
    }

    public void setFondo(Color fondo) {
        this.fondo = fondo;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

    public boolean isBandera() {
        return bandera;
    }
   

    @Override
    public void run() {
        while(this.bandera){
                if (this.x + this.xa < 0)
			this.xa = 1;
		if (this.x + xa > 500  - 10)
			this.xa = -1;
		if (this.y + this.ya < 0)
			this.ya = 1;
		if (this.y + this.ya > 550 - 10)
			this.ya = -1;
		
		this.setX(this.getX() + this.xa);
		this.setY(this.getY() + this.ya);
                
            try {
                sleep(5);
            }
            catch (InterruptedException ex) {
                Logger.getLogger(Enemigo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}