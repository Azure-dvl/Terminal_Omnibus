package src.clases;

/*
 * Clase Padre! Omnibus es una clase abstracta con 5 variables y un metodo. La chapa, el destino, el chofer,
 * los asientos y los kilometros recorridos. El metodo abstracto es precio.
 */

public abstract class Omnibus {
    protected String chapa;
    protected String destino;
    protected String chofer;
    protected int asientos;
    protected float km_recorridos;

    public Omnibus(String chapa, String destino, String chofer, int asientos, float km_recorridos){
        this.chapa = chapa;
        this.destino = destino;
        this.chofer = chofer;
        this.asientos = asientos;
        this.km_recorridos = km_recorridos;
    }

    public String getChapa() {
        return chapa;
    }
    public String getDestino() {
        return destino;
    }
    public String getChofer() {
        return chofer;
    }
    public int getAsientos() {
        return asientos;
    }
    public float getKm_recorridos() {
        return km_recorridos;
    }

    public abstract float Precio();
}
