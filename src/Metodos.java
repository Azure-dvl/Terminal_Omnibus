package src;

import src.clases.*;
import src.data.*;

import java.util.List;
import java.util.ArrayList;


/*
 * Metodos implementados
 */

public class Metodos {
    
    float dinero_total = 0;
    String dinero_omnibus = "";
    float comp = 0;
    int idos_astros = 0;
    int idos_turismo = 0;


    static List<Recogidos> recogidos = new ArrayList<>();
    
    static List<ListaEspera> listaespera = new ArrayList<>();
    static List<ListaOficial> listaoficial = new ArrayList<>();
    static List <OmnibusAstro> astro = new ArrayList<>();
    static List<OmnibusTurismo> turismo = new ArrayList<>();

    data data = new data();

    public void IniData(){
        data.datosListAstro(astro);
        data.datosListTurismo(turismo);
        data.datosListOficial(listaoficial);
        data.dataListEspera(listaespera);
        
    }

    public void Add_ListEspera(int id, String[] destinos){
        ListaEspera lista = new ListaEspera(id, destinos);
        listaespera.add(lista);
        data.dataListEspera(listaespera);
    }
    public void Add_ListOficial(int id, String dia_salida, String destinos){
        ListaOficial lista = new ListaOficial(id, dia_salida, destinos);
        listaoficial.add(lista);
        data.dataListOficial(listaoficial);
    }

    public void Add_ListTurismo(String chapa, String destino, String chofer, int cant_asientos, float km_recorridos, String hora_llegada){
        OmnibusTurismo lista = new OmnibusTurismo(chapa, destino, chofer, cant_asientos, km_recorridos, hora_llegada);
        turismo.add(lista);
        data.dataListTurismo(turismo);
    }
    public void Add_ListAstro(String chapa, String destino, String chofer, int cant_asientos, float km_recorridos, String dia_salida, String hora_salida){
        OmnibusAstro lista = new OmnibusAstro(chapa, destino, chofer, cant_asientos, km_recorridos, dia_salida, hora_salida);
        astro.add(lista);
        data.dataListAstro(astro);
    }

    public void Arrancar_Astro(OmnibusAstro x){         
        int num = astro.indexOf(x);
        int dinero_recogido = 0;
        int asientos = astro.get(num).getAsientos();
        String destino = astro.get(num).getDestino();
        
        for(ListaOficial z : listaoficial){
            if(asientos>0){
                if(destino==z.getDestino()){
                    Recogidos v = new Recogidos(z.getId(), astro.get(num).getChapa(), destino);
                    recogidos.add(v);
                    data.dataListRecogidos(recogidos);
                    dinero_recogido+=astro.get(num).Precio();
                    int var = listaoficial.indexOf(z);
                    listaoficial.remove(var);
                    asientos--;
                }
            }else{break;}
        }

        for(ListaEspera z : listaespera){
            if (asientos>0) {
                for(int i = 0; i<z.getDestino().length;i++){
                    if (destino==z.getDestino()[i]) {
                        Recogidos v = new Recogidos(z.getId(), astro.get(num).getChapa(), destino);
                        recogidos.add(v);
                        data.dataListRecogidos(recogidos);
                        dinero_recogido+=astro.get(num).Precio();
                        int var = listaespera.indexOf(z);
                        listaespera.remove(var);
                        asientos--;
                    }
                }
            }else{break;}
        }
        
        if (dinero_recogido >= comp) {
            comp=dinero_recogido;
            dinero_omnibus=astro.get(num).getChapa();
        }
        
        dinero_total+=dinero_recogido;
        idos_astros++;
        astro.remove(num);
    }
    public void Arrancar_Turismo(OmnibusTurismo x){
        int num = turismo.indexOf(x);
        int dinero_recogido = 0;
        int asientos = astro.get(num).getAsientos();
        String destino = astro.get(num).getDestino();

        for(ListaEspera z : listaespera){
            if (asientos>0) {
                for(int i = 0; i<z.getDestino().length;i++){
                    if (destino==z.getDestino()[i]) {
                        Recogidos v = new Recogidos(z.getId(), astro.get(num).getChapa(), destino);
                        recogidos.add(v);
                        data.dataListRecogidos(recogidos);
                        dinero_recogido+=astro.get(num).Precio();
                        int var = listaespera.indexOf(z);
                        listaespera.remove(var);
                        asientos--;
                    }
                }
            }else{break;}
        }
        
        if (dinero_recogido >= comp) {
            comp=dinero_recogido;
            dinero_omnibus=turismo.get(num).getChapa();
        }
        
        idos_turismo++;
        turismo.remove(num);
    }
    
    public String[] MostrarTurismo(){
        List<String> l = new ArrayList<String>();
        for(OmnibusTurismo w:turismo){
            String m =  String.format("%s, %s, %s, %d, %f, %s\n", w.getChapa(), w.getDestino(), w.getChofer(), w.getAsientos(), w.getKm_recorridos(), w.getHora_llegada());
            l.add(m);
            System.out.println("Turismo: ".concat(m));
        }
        String[] result = new String[l.size()];
        return l.toArray(result);
    }

    public String[] MostrarAstro(){
        List<String> l = new ArrayList<String>();
        for(OmnibusAstro w:astro){
            String m = String.format("%s, %s, %s, %d, %f, %s, %s", w.getChapa(), w.getDestino(), w.getChofer(), w.getAsientos(), w.getKm_recorridos(), w.getDia_salida(), w.getHora_salida());
            l.add(m);
            System.out.println("Astro: ".concat(m));
            // Fijate q solo hay 1 valor en la lista, deje el print pa q veas eso
        }
        String[] result = new String[l.size()];
        return l.toArray(result);
    }

    // public String MostrarEspera(){

    // }

    public float getDinero_total() {
        return dinero_total;
    }
    public String getDinero_omnibus() {
        return dinero_omnibus;
    }
    public List<Recogidos> getRecogidos() {
        return recogidos;
    }
    public List<ListaEspera> getListaespera() {
        return listaespera;
    }
    public List<ListaOficial> getListaoficial() {
        return listaoficial;
    }
    public List<OmnibusAstro> getAstro() {
        return astro;
    }
    public List<OmnibusTurismo> getTurismo() {
        return turismo;
    }
    public int getIdos_astros() {
        return idos_astros;
    }
    public int getIdos_turismo() {
        return idos_turismo;
    }

}
