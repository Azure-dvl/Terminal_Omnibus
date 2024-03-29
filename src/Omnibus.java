package src;

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

    public void setChapa(String chapa) {
        this.chapa = chapa;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public float getKm_recorridos() {
        return km_recorridos;
    }

    public void setKm_recorridos(float km_recorridos) {
        this.km_recorridos = km_recorridos;
    }

    public abstract float Precio();
}
