package modelos;

public class Lista {
    
    private Nodo cab;
    private Nodo aux;
    
    public Lista() {
        
    }
    
    public Lista(Nodo cab, Nodo aux) {
        this.cab = cab;
        this.aux = aux;
    }
    
    public Nodo getCab() {
        return cab;
    }
    
    public void setCab(Nodo cab) {
        this.cab = cab;
    }
    
    public Nodo getAux() {
        return aux;
    }
    
    public void setAux(Nodo aux) {
        this.aux = aux;
    }
    
    public void ingresar(Enemigo E, int i) {
        
        if (this.cab == null) {
            this.cab = new Nodo(null, null , E, i);
            this.aux = this.cab;
        }
        else {
            this.aux.setSig(new Nodo(aux, null, E, i));
            this.aux = this.aux.getSig();
            
        }
    }
    
    public void eliminar(Nodo i) {
        Nodo Aux = i;
        
        if (Aux.getAnt() == null && Aux.getSig() != null) {
            Aux.getSig().setAnt(null);
            this.cab = Aux.getSig();
            
        }
        
        
        else if (Aux.getSig() == null && Aux.getAnt() != null) {
            Aux.getAnt().setSig(null);
        }
        
        else if(Aux.getSig() == null && Aux.getAnt() == null){
            this.cab = null;
        }
        else {
            Aux.getAnt().setSig(Aux.getSig());
            Aux.getSig().setAnt(Aux.getAnt());
        }
    }
    
    
}