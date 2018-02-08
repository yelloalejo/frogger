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
    String Rutas[]=new String[9];

    public Jugador() {
    }

    public Jugador(int x, int y, int alto, int ancho, Color fondo) {
        this.x = x;
        this.y = y;
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fondo;
        this.Rutas[0]="../imagenes/ini arriba.png";
        this.Rutas[1]="../imagenes/salto arriba.png";
        this.Rutas[2]="../imagenes/ini der.png";
        this.Rutas[3]="../imagenes/salto der.png";
        this.Rutas[4]="../imagenes/inicial abajo.png";
        this.Rutas[5]="../imagenes/salto abajo.png";
        this.Rutas[6]="../imagenes/ini izq.png";
        this.Rutas[7]="../imagenes/salto izq.png";
        this.Rutas[8]="../imagenes/graphics-game-sprites.png";

        
        this.dibujo=new ImageIcon(getClass().getResource(this.Rutas[0]));
    }
    public ImageIcon getDibujo() {
        return dibujo;
    }
    
    public void setDibujo(ImageIcon dibujo) {
        this.dibujo = dibujo;
    }

    public void setRutas(String[] Rutas) {
        this.Rutas = Rutas;
    }

    public String[] getRutas() {
        return Rutas;
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
}
