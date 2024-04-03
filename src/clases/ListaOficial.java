package src.clases;

/*
 * Clase de la Lista Oficial con 3 variables. El id, el dia de salida y el destino.
 */

public class ListaOficial {

    private String id;
    private String dia_salida;
    private String destino;
    
    public ListaOficial(String id, String dia_salida, String destino) {
        this.id = id;
        this.dia_salida = dia_salida;
        this.destino = destino;
    }

    public String getId() {
        return id;
    }
    public String getDia_salida() {
        return dia_salida;
    }
    public String getDestino() {
        return destino;
    }
}
