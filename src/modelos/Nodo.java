package modelos;

/**
 *
 * @author sebitas
 */
public class Nodo{
    private Nodo ant;
    private Nodo sig;
    private Enemigo E;
    private int ID;

    public Nodo(){
        
    }

    public Nodo(Nodo ant, Nodo sig, Enemigo E, int ID){
        this.ant = ant;
        this.sig = sig;
        this.E = E;
        this.ID = ID;
    }

    public Nodo getAnt(){
        return ant;
    }

    public void setAnt(Nodo ant){
        this.ant = ant;
    }

    public Nodo getSig(){
        return sig;
    }

    public void setSig(Nodo sig){
        this.sig = sig;
    }

    public Enemigo getE(){
        return E;
    }

    public void setE(Enemigo E){
        this.E = E;
    }
    
    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }
    
    
    
}