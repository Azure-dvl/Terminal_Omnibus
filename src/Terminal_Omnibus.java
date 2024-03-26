package src;

import java.util.List;
import java.util.ArrayList;

public class Terminal_Omnibus {

    private String nombre;
    private String direccion;

    float dinero_total = 0;
    
    List<String> viajes = new ArrayList<>();
    List<Lista_Espera> lista_espera = new ArrayList<>();
    List<Lista_Oficial> lista_oficial = new ArrayList<>();
    List<Turismo> lista_turismo = new ArrayList<>();
    List<Astro> lista_astro = new ArrayList<>();

    public Terminal_Omnibus(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Agregar Pasajero
    public void Add_ListEspera(int id, String[] destinos){
        Lista_Espera lista = new Lista_Espera(id, destinos);
        lista_espera.add(lista);
    }
    public void Add_ListOficial(int id, String dia_salida, String dia_llegada){
        Lista_Oficial lista = new Lista_Oficial(id, dia_salida, dia_llegada);
        lista_oficial.add(lista);
    }

    //Agregar Omnibus
    public void Add_ListTurismo(String chapa, String destino, String chofer, int cant_asientos, float km_recorridos, String hora_llegada){
        Turismo lista = new Turismo(chapa, destino, chofer, cant_asientos, km_recorridos, hora_llegada);
        lista_turismo.add(lista);
    }
    public void Add_ListAstro(String chapa, String destino, String chofer, int cant_asientos, float km_recorridos, String dia_salida, String hora_salida){
        Astro lista = new Astro(chapa, destino, chofer, cant_asientos, km_recorridos, dia_salida, hora_salida);
        lista_astro.add(lista);
    }

    public void Recogida_Astro(){
        
    }

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

        public String getHora_salida() {
            return hora_salida;
        }

        public void setHora_salida(String hora_salida) {
            this.hora_salida = hora_salida;
        }

        public String getDia_salida() {
            return dia_salida;
        }

        public void setDia_salida(String dia_salida) {
            this.dia_salida = dia_salida;
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

        public String getHora_llegada() {
            return hora_llegada;
        }

        public void setHora_llegada(String hora_llegada) {
            this.hora_llegada = hora_llegada;
        }
    }

    public abstract class Listas{
        protected int id;

        public Listas(int id){
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public class Lista_Espera extends Listas{
        private String[] destinos;

        public Lista_Espera(int id, String[] destinos){
            super(id);
            this.destinos = destinos;
        }

        public String[] getDestinos() {
            return destinos;
        }

        public void setDestinos(String[] destinos) {
            this.destinos = destinos;
        }
    }

    public class Lista_Oficial extends Listas{
        private String dia_salida;
        private String destino;

        public Lista_Oficial(int id, String dia_salida, String destino){
            super(id);
            this.destino = destino;
            this.dia_salida = dia_salida;
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
}
