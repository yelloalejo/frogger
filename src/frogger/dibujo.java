/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

import java.awt.Color;
import javax.swing.ImageIcon;
import modelos.Enemigo;
import modelos.Jugador;

/**
 *
 * @author diegoalejandromarulandamarin
 */
public class dibujo extends javax.swing.JPanel {

    
    public dibujo() {
        initComponents();
        this.J1=new Jugador(90, 10,10,10,Color.BLACK);
        this.E1=new Enemigo(0, 0,30, 30, Color.RED);
        Thread Hilo = new Thread(this.E1);
        Hilo.start();
        animaciones=0;
    }
    Enemigo E1;
    Jugador J1;
    int animaciones;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    public void Direcciones(int D){
        
        if(J1!=null){
        
        if(D==1){
            this.J1.setDibujo(new ImageIcon(getClass().getResource(this.J1.getRutas()[animaciones])));
            this.J1.setY(this.J1.getY() - 2);
            animaciones++;
            System.out.println(""+animaciones);
        }
        
        if(this.animaciones==3){
            this.animaciones=0;
        }
        
        if(D==2){
            this.J1.setY(this.J1.getY() + 5);
        }
        
        if(D==3){
            this.J1.setX(this.J1.getX() - 5);
        }
        
        if(D==4){
            this.J1.setX(this.J1.getX() + 5);
        }
        
        if(this.J1.getX()>250){
            this.J1.setX(0);
        }
        
        if(this.J1.getX()<0){
            this.J1.setX(250);
        }
        
        if(this.J1.getY()>230){
            this.J1.setY(0);
        }
        
        if(this.J1.getY()<0){
            this.J1.setY(230);
        }
        
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
