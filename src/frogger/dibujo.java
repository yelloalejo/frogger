/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelos.Enemigo;
import modelos.Jugador;
import modelos.bg;
import modelos.tronco;

/**
 *
 * @author diegoalejandromarulandamarin
 */
public final class dibujo extends javax.swing.JPanel {
        
    Jugador J1;
    bg fondo;
    int animaciones;
    int count = 0;
    ArrayList<Enemigo> carros;
    ArrayList<tronco> troncos;
    
    public Enemigo createEnemy(int x, int y, int width, int heigth,boolean orientation) {
        Enemigo auto = new Enemigo(x,y,width, heigth, orientation);
        return auto;
    }
    
    public tronco createtronco(int x, int y, boolean orientation) {
        tronco tronquito = new tronco(x,y, orientation);
        return tronquito;
    }
    
    public dibujo() {
        initComponents();
        troncos = new ArrayList();
        troncos.add(createtronco(499,70, false));
        troncos.add(createtronco(119,70, false));
        
        troncos.add(createtronco(119,130, true));
        troncos.add(createtronco(360,130, true));              
        troncos.add(createtronco(270,130, true));
        
        troncos.add(createtronco(159,190, false));
        troncos.add(createtronco(300,190, false));
        troncos.add(createtronco(480,190, false));
        
        
        this.J1 = new Jugador(219, 510);
        
        carros = new ArrayList();
        carros.add(createEnemy(219, 315, 60, 40, true));
        carros.add(createEnemy(0, 315, 60, 40, true));
        
        carros.add(createEnemy(0, 380, 60, 40, false));
        carros.add(createEnemy(325, 380, 60, 40, false));
        
        carros.add(createEnemy(200, 450, 60, 40, true));
        carros.add(createEnemy(499, 450, 60, 40, true));
        animaciones = 0;
    }
    
    
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

    public void Direcciones(int D) {

        if (J1 != null) {

            if (this.animaciones == 2) {
                this.animaciones = 0;
            }

            switch (D) {
                case 1:
                    this.J1.setDibujo(new ImageIcon(getClass().getResource(this.J1.getRutasar()[animaciones])));
                    this.J1.setY(this.J1.getY() - 63);
                    animaciones++;
                    repaint();
                    this.J1.setDibujo(new ImageIcon(getClass().getResource(this.J1.getRutasar()[animaciones])));                                
                    break;
                case 2:
                    this.J1.setDibujo(new ImageIcon(getClass().getResource(this.J1.getRutasab()[animaciones])));
                    this.J1.setY(this.J1.getY() + 63);
                    animaciones++;
                    break;
                case 3:
                    this.J1.setDibujo(new ImageIcon(getClass().getResource(this.J1.getRutasiz()[animaciones])));
                    this.J1.setX(this.J1.getX() - 63);
                    animaciones++;
                    break;
                case 4:
                    this.J1.setDibujo(new ImageIcon(getClass().getResource(this.J1.getRutasde()[animaciones])));
                    this.J1.setX(this.J1.getX() + 63);
                    animaciones++;
                    break;
                default:
                    break;
            }

            if (this.J1.getX() > 500) {
                this.J1.setX(0);
            }

            if (this.J1.getX() < 0) {
                this.J1.setX(500);
            }

            if (this.J1.getY() <= 47) {
                JOptionPane.showMessageDialog(null, "Has ganado");
                System.exit(0);
                //this.J1.setX(219);
                //this.J1.setY(510);
                //for (int i = 0; i < troncos.size(); i++) {
                    //this.troncos.get(i).setVelocidad((float) (this.troncos.get(i).getVelocidad() + 0.1f));
                //}
                //for (int j = 0; j < carros.size(); j++) {
                    //this.carros.get(j).setVelocidad((float) (this.carros.get(j).getVelocidad() + 0.1f));
                //}
            }

            if (this.J1.getY() > 500) {
                this.J1.setY(500);
            }

        }
    }

    public void subidaTronco(Graphics g) {
        if (count == 0) {
            for (int i = 0; i < troncos.size(); i++) {
                if (J1.getColision().intersects(troncos.get(i).getColision())){                                                   
                    J1.setX((int)troncos.get(i).getX());
                    J1.setY((int)troncos.get(i).getY());
                } 
                /*else if ((this.J1.getY() > 70 && this.J1.getY() < 190 && !(J1.getColision().intersects(troncos.get(i).getColision())))) {
                    count++;
                    J1.setDibujo(J1.getDibujom());
                    repaint();
                    this.carros.get(i).setBandera(false);
                    this.troncos.get(i).setBandera(false);
                    for (int j = 0; j < carros.size(); j++) {
                        this.carros.get(j).setBandera(false);
                    }
                    for (int k = 0; k < troncos.size(); k++) {
                        this.troncos.get(k).setBandera(false);
                    }
                    JOptionPane.showMessageDialog(null, "Gracias por jugar");
                    System.exit(0);
                }*/
            }
        }        
    }
    
    public void Colisiones(Graphics g) {
        if (count == 0) {
            for (int i = 0; i < carros.size(); i++) {
                if (J1.getColision().intersects(carros.get(i).getColision())){               
                    count++;
                    J1.setDibujo(J1.getDibujom());
                    repaint();
                    this.carros.get(i).setBandera(false);
                    for (int j = 0; j < carros.size(); j++) {
                        this.carros.get(j).setBandera(false);
                    }
                    for (int k = 0; k < troncos.size(); k++) {
                        this.troncos.get(k).setBandera(false);
                    }
                    JOptionPane.showMessageDialog(null, "Gracias por jugar");
                    System.exit(0);
                }  
            }            
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        fondo= new bg();
        
        g.drawImage(this.fondo.getfondoso().getImage(), 0, 0, 500, 559, this);
        
        for (int j = 0; j < troncos.size(); j++) {
            g.drawImage(this.troncos.get(j).getDibujo().getImage(), (int)this.troncos.get(j).getX(), this.troncos.get(j).getY(), this.troncos.get(j).getAncho(), this.troncos.get(j).getAlto(), this);
        }  
        
        for (int i = 0; i < carros.size(); i++) {
            g.drawImage(this.carros.get(i).getDibujo().getImage(), (int)this.carros.get(i).getX(), this.carros.get(i).getY(), this.carros.get(i).getAncho(), this.carros.get(i).getAlto(), this);
        }
       
        if (this.J1 != null) {
            g.drawImage(this.J1.getDibujo().getImage(), this.J1.getX(), this.J1.getY(), this.J1.getAncho(), this.J1.getAlto(), this);
            subidaTronco(g);
            Colisiones(g);
        }
        
        repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
