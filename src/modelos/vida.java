/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.swing.ImageIcon;

/**
 *
 * @author diegoalejandromarulandamarin
 */
public class vida {
    private ImageIcon vida = new ImageIcon(getClass().getResource("../imagenes/vida.png"));
    private ImageIcon vidaper = new ImageIcon(getClass().getResource("../imagenes/vidaperdida.png"));
    private int x;
    private int y;
    private int ancho;
    private int alto;

    public vida(int x,int y,int ancho,int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * @return the vida
     */
    public ImageIcon getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(ImageIcon vida) {
        this.vida = vida;
    }

    /**
     * @return the vidaper
     */
    public ImageIcon getVidaper() {
        return vidaper;
    }

    /**
     * @param vidaper the vidaper to set
     */
    public void setVidaper(ImageIcon vidaper) {
        this.vidaper = vidaper;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    
}
