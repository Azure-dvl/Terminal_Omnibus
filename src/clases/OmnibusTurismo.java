package src.clases;

public class OmnibusTurismo extends Omnibus{

    private String hora_llegada;

    public OmnibusTurismo(String chapa, String destino, String chofer, int asientos, float km_recorridos, String hora_llegada) {
        super(chapa, destino, chofer, asientos, km_recorridos);
        this.hora_llegada = hora_llegada;
    }

    public String getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
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
