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
public class bg {
    private ImageIcon fondoso;


    public bg() {
        this.fondoso = new ImageIcon(getClass().getResource("../imagenes/fondo.png"));
    }

    /**
     * @return the background
     */
    public ImageIcon getfondoso() {
        return fondoso;
    }

    /**
     * @param background the background to set
     */
    public void setfondoso(ImageIcon background) {
        this.fondoso = background;
    }
    
}

