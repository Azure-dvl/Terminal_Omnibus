package src.clases;

public class ListaEspera {
    
    private int id;
    private String[] destino;

    public ListaEspera(int id, String[] destino) {
        this.id = id;
        this.destino = destino;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String[] getDestino() {
        return destino;
    }
    public void setDestino(String[] destino) {
        this.destino = destino;
    }
}
