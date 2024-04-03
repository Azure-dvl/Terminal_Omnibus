package src.clases;

/*
 * Clase hijo que hereda de Omnibus. Con 1 variables hora de llegada. Modificando el metodo precio.
 */

public class OmnibusTurismo extends Omnibus{

    private String hora_llegada;

    public OmnibusTurismo(String chapa, String destino, String chofer, int asientos, float km_recorridos, String hora_llegada) {
        super(chapa, destino, chofer, asientos, km_recorridos);
        this.hora_llegada = hora_llegada;
    }
    public String getHora_llegada() {
        return hora_llegada;
    }

    @Override
    public float Precio(){
        float precio = 0;
            
        if (km_recorridos <= 100) {
            precio = 10;
        }
        else if (km_recorridos > 100 && km_recorridos < 200) {
            precio = 20;
        }
        else {
            precio = 30;
        }

        return precio;
    }
}
