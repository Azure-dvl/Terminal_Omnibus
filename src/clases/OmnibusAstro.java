package src.clases;

/*
 * Clase hijo que hereda de Omnibus. Con 2 variables hora de salida y dia de salida. Modificando el metodo precio.
 */

public class OmnibusAstro extends Omnibus{
    private String hora_salida;
    private String dia_salida;
    
    public OmnibusAstro(String chapa, String destino, String chofer, int asientos, float km_recorridos,
            String hora_salida, String dia_salida) {
        super(chapa, destino, chofer, asientos, km_recorridos);
        this.hora_salida = hora_salida;
        this.dia_salida = dia_salida;
    }
    public String getHora_salida() {
        return hora_salida;
    }
    public String getDia_salida() {
        return dia_salida;
    }

    @Override
    public float Precio(){
        return km_recorridos*4;
    }
}
