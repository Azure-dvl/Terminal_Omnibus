package src.clases;

/*
 * Clase para los omnibus y los pasajerros que ya se fueron. Con 3 variables el id del pasajero, la chapa y el destino.
 */

public class Recogidos {
    
    private String id;
    private String chapa;
    private String destino;
    
    public Recogidos(String id, String chapa, String destino) {
        this.id = id;
        this.chapa = chapa;
        this.destino = destino;
    }
    public String getId() {
        return id;
    }
    public String getChapa() {
        return chapa;
    }
    public String getDestino() {
        return destino;
    }
}
