/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelos.Enemigo;
import modelos.Jugador;

/**
 *
 * @author diegoalejandromarulandamarin
 */
public class dibujo extends javax.swing.JPanel {

    
    public dibujo() {
        initComponents();
        this.J1=new Jugador(0,0,40,60,Color.BLACK);
        this.E1=new Enemigo(0,0,40,60, Color.RED);
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
            this.J1.setY(this.J1.getY() - 20);
            animaciones++;
            System.out.println(""+animaciones);
            animaciones=0;
        }
        
        if(D==2){
            animaciones=5;
            this.J1.setDibujo(new ImageIcon(getClass().getResource(this.J1.getRutas()[animaciones])));
            this.J1.setDibujo(new ImageIcon(getClass().getResource(this.J1.getRutas()[animaciones+1])));
            this.J1.setDibujo(new ImageIcon(getClass().getResource(this.J1.getRutas()[animaciones])));
            this.J1.setY(this.J1.getY() + 20);
            System.out.println(""+animaciones);
            animaciones=0;
        }
        
        if(D==3){
            animaciones=7;
            this.J1.setDibujo(new ImageIcon(getClass().getResource(this.J1.getRutas()[animaciones])));
            this.J1.setDibujo(new ImageIcon(getClass().getResource(this.J1.getRutas()[animaciones+1])));
            this.J1.setDibujo(new ImageIcon(getClass().getResource(this.J1.getRutas()[animaciones])));
            this.J1.setX(this.J1.getX() - 20);
            System.out.println(""+animaciones);
            animaciones=0;
        }
    
        if(D==4){
            animaciones=3;
            this.J1.setDibujo(new ImageIcon(getClass().getResource(this.J1.getRutas()[animaciones])));
            this.J1.setDibujo(new ImageIcon(getClass().getResource(this.J1.getRutas()[animaciones+1])));
            this.J1.setDibujo(new ImageIcon(getClass().getResource(this.J1.getRutas()[animaciones])));
            this.J1.setX(this.J1.getX() + 20);
            System.out.println(""+animaciones);
            animaciones=0;
        }
        
        if(this.J1.getX()>500){
            this.J1.setX(0);
        }
        
        if(this.J1.getX()<0){
            this.J1.setX(500);
        }
        
        if(this.J1.getY()>550){
            this.J1.setY(0);
        }
        
        if(this.J1.getY()<0){
            this.J1.setY(550);
        }
        
        }
    }
    public void Colisiones(){
        if(new Rectangle(this.J1.getX(), this.J1.getY(), this.J1.getAncho(), this.J1.getAlto()).intersects(new Rectangle(this.E1.getX(), this.E1.getY(), this.E1.getAncho(),this.E1.getAlto()))){
            this.J1=null;
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
       // g.drawOval(this.E1.getX(), this.E1.getY(), this.E1.getAncho(),this.E1.getAlto());
        //g.setColor(this.E1.getFondo());
        //g.fillOval(this.E1.getX(), this.E1.getY(), this.E1.getAncho(),this.E1.getAlto());
        
        g.drawImage(this.E1.getDibujo().getImage(), this.E1.getX(), this.E1.getY(), this.E1.getAncho(), this.E1.getAlto(), this);
        
        
        
        if(this.J1!=null){
        
            g.drawImage(this.J1.getDibujo().getImage(), this.J1.getX(), this.J1.getY(), this.J1.getAncho(), this.J1.getAlto(), this);
            Colisiones();
                
            if(J1==null){
                g.drawImage(this.J1.getDibujom().getImage(), this.J1.getX(), this.J1.getY(), this.J1.getAncho(), this.J1.getAlto(), this);
                JOptionPane.showMessageDialog(null, "Gracias por jugar");
                System.exit(0);
        
            
            }
            repaint();
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
