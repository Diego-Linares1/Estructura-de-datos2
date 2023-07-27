
package heladeria;

public class Nodo {
    private Nodo enlace;
    private Productos informacion;
    
    public Nodo(Productos informacion) {
        this.enlace = null;
        this.informacion = informacion;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    public Productos getInformacion() {
        return informacion;
    }

    public void setInformacion(Productos informacion) {
        this.informacion = informacion;
    }  
}
