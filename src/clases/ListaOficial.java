package src.clases;

public class ListaOficial {

    private int id;
    private String dia_salida;
    private String destino;
    
    public ListaOficial(int id, String dia_salida, String destino) {
        this.id = id;
        this.dia_salida = dia_salida;
        this.destino = destino;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDia_salida() {
        return dia_salida;
    }
    public void setDia_salida(String dia_salida) {
        this.dia_salida = dia_salida;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }    
}
