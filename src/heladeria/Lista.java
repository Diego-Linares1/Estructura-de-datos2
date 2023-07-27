
package heladeria;

public class Lista {
    private Nodo inicio;
    private int tamanio;
    
    public Lista() {
        this.inicio = null;
        this.tamanio = 0;
    }
    
    public int getTamanio() {
        return tamanio;
    }
    
    public Nodo getInicio() {
        return inicio;
    }
    
    public void ingreso(Productos producto){
        Nodo nuevoNodo = new Nodo(producto);
        
        if (inicio == null){
            inicio = nuevoNodo;
        }
        else {
            Nodo aux = inicio;
            while (aux.getEnlace() != null){
                aux = aux.getEnlace();
            }
            aux.setEnlace(nuevoNodo);
        }
        tamanio++;
    }
    
    // eliminar nodo
    public void eliminar(double monto) {
        if (inicio == null) {
            // La lista está vacía, no hay nodos para eliminar
            return;
        }

        if (inicio.getInformacion().getMonto() == monto) {
            // El nodo a eliminar es el nodo de inicio
            inicio = inicio.getEnlace();
            tamanio--;
            return;
        }

        Nodo anterior = inicio;
        Nodo actual = inicio.getEnlace();

        while (actual != null) {
            if (actual.getInformacion().getMonto() == monto) {
                // Se encontró el nodo a eliminar
                anterior.setEnlace(actual.getEnlace());
                tamanio--;
                return;
            }

            anterior = actual;
            actual = actual.getEnlace();
        }
        // El nodo a eliminar no se encontró en la lista
    }
}
