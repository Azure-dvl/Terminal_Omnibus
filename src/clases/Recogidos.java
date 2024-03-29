package src.clases;

public class Recogidos {
    
    private int id;
    private String chapa;
    private String destino;
    
    public Recogidos(int id, String chapa, String destino) {
        this.id = id;
        this.chapa = chapa;
        this.destino = destino;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getChapa() {
        return chapa;
    }
    public void setChapa(String chapa) {
        this.chapa = chapa;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
}
