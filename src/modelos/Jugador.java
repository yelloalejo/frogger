/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author diegoalejandromarulandamarin
 */
public class Jugador {
    private int x;
    private int y;
    private int alto;
    private int ancho;
    private Color fondo;
    ImageIcon dibujo;
    ImageIcon dibujom;
    private String[] Rutasar = {"../imagenes/ini arriba.png", 
        "../imagenes/salto arriba.png",
        "../imagenes/ini arriba.png"};
    
    private String Rutasab[]={"../imagenes/inicial abajo.png",
        "../imagenes/salto abajo.png",
        "../imagenes/inicial abajo.png"};
    
    private String Rutasiz[]={"../imagenes/ini izq.png",
        "../imagenes/salto izq.png",
        "../imagenes/ini izq.png"};
    
    private String Rutasde[]={"../imagenes/ini der.png",
        "../imagenes/salto der.png",
        "../imagenes/ini der.png"};

    public Jugador() {
    }

    public Jugador(int x, int y, int alto, int ancho, Color fondo) {
        this.x = x;
        this.y = y;
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fondo;


        this.dibujom=new ImageIcon(getClass().getResource("../imagenes/graphics-game-sprites.png"));
        this.dibujo=new ImageIcon(getClass().getResource("../imagenes/ini arriba.png"));
    }
    public ImageIcon getDibujo() {
        return dibujo;
    }
    
    public void setDibujo(ImageIcon dibujo) {
        this.dibujo = dibujo;
    }
    public ImageIcon getDibujom() {
        return dibujom;
    }
    
    public void setDibujom(ImageIcon dibujom) {
        this.dibujo = dibujom;
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

    /**
     * @return the Rutasar
     */
    public String[] getRutasar() {
        return Rutasar;
    }

    /**
     * @param Rutasar the Rutasar to set
     */
    public void setRutasar(String[] Rutasar) {
        this.Rutasar = Rutasar;
    }

    /**
     * @return the Rutasab
     */
    public String[] getRutasab() {
        return Rutasab;
    }

    /**
     * @param Rutasab the Rutasab to set
     */
    public void setRutasab(String[] Rutasab) {
        this.Rutasab = Rutasab;
    }

    /**
     * @return the Rutasiz
     */
    public String[] getRutasiz() {
        return Rutasiz;
    }

    /**
     * @param Rutasiz the Rutasiz to set
     */
    public void setRutasiz(String[] Rutasiz) {
        this.Rutasiz = Rutasiz;
    }

    /**
     * @return the Rutasde
     */
    public String[] getRutasde() {
        return Rutasde;
    }

    /**
     * @param Rutasde the Rutasde to set
     */
    public void setRutasde(String[] Rutasde) {
        this.Rutasde = Rutasde;
    }
}
