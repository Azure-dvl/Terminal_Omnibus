package src.clases;

/*
 * Clase de Lista de Espera con 2 variables. El id y los 3 destinos.
 */

public class ListaEspera {
    
    private String id;
    private String[] destino;

    public ListaEspera(String id, String[] destino) {
        this.id = id;
        this.destino = destino;
    }
    
    public String getId() {
        return id;
    }
    public String[] getDestino() {
        return destino;
    }
}
