package src;

public class Terminal_Omnibus {
    
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

        public abstract float Precio();

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
    }

    public class Astro extends Omnibus{
        private String hora_salida;
        private String dia_salida;

        public Astro(String chapa, String destino, String chofer, int asientos, float km_recorridos, String dia_salida, String hora_salida){
            super(chapa, destino, chofer, asientos, km_recorridos);
            this.hora_salida = hora_salida;
            this.dia_salida = dia_salida;
        }

        @Override
        public float Precio(){
            return km_recorridos * 4;
        }
    }

    public class Turismo extends Omnibus {
    
        private String hora_llegada;

        public Turismo(String chapa, String destino, String chofer, int asientos, float km_recorridos, String hora_llegada){
            super(chapa, destino, chofer, asientos, km_recorridos);
            this.hora_llegada = hora_llegada;
        }

        @Override
        public float Precio(){
            float precio = 0;
            
            if (km_recorridos <= 100) {
                precio = 10;
            }
            else if (km_recorridos > 100 && km_recorridos <= 200) {
                precio = 20;
            }
            else {
                precio = 30;
            }

            return precio;
        }
    }
}
