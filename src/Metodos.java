package src;

import src.clases.*;
import src.data.*;

import java.util.List;
import java.util.ArrayList;


/*
 * Metodos implementados
 */

public class Metodos {
    
    /*
     * Variables y Listas
     */
    static float dinero_total = 0;
    static String dinero_omnibus = "";
    static float comp = 0;
    static int idos_astros = 0;
    static int idos_turismo = 0;

    static List<Recogidos> recogidos = new ArrayList<>();
    static List<ListaEspera> listaespera = new ArrayList<>();
    static List<ListaOficial> listaoficial = new ArrayList<>();
    static List <OmnibusAstro> astro = new ArrayList<>();
    static List<OmnibusTurismo> turismo = new ArrayList<>();

    data data = new data();

    /*
     * Metodos!
     */
    public  void IniData(){
        // Metodo para sacar los txt a las listas
        data.datosListAstro(astro);
        data.datosListTurismo(turismo);
        data.datosListOficial(listaoficial);
        data.datosListEspera(listaespera);
        data.datosListRecogidos(recogidos);
    }

    /*
     * Metodos para Agregar a las listas
     */
    public void Add_ListEspera(String id, String[] destinos){
        // Metodo para Agregar los elementos a la Lista Espera
        ListaEspera lista = new ListaEspera(id, destinos);
        listaespera.add(lista);
        data.dataListEspera(listaespera);
    }
    public void Add_ListOficial(String id, String dia_salida, String destinos){
        // Metodo para Agregar los elementos a la Lista Oficial
        ListaOficial lista = new ListaOficial(id, dia_salida, destinos);
        listaoficial.add(lista);
        data.dataListOficial(listaoficial);
    }
    public void Add_ListTurismo(String chapa, String destino, String chofer, int cant_asientos, float km_recorridos, String hora_llegada){
        // Metodo para Agregar los elementos a la Lista Omnibus Turismo
        OmnibusTurismo lista = new OmnibusTurismo(chapa, destino, chofer, cant_asientos, km_recorridos, hora_llegada);
        turismo.add(lista);
        data.dataListTurismo(turismo);
    }
    public void Add_ListAstro(String chapa, String destino, String chofer, int cant_asientos, float km_recorridos, String dia_salida, String hora_salida){
        // Metodo para Agregar los elementos a la Lista Omnibus Astro
        OmnibusAstro lista = new OmnibusAstro(chapa, destino, chofer, cant_asientos, km_recorridos, dia_salida, hora_salida);
        astro.add(lista);
        data.dataListAstro(astro);
    }

    public void Buscarchapa(String chapa){
        for(OmnibusAstro x: astro){
            if(x.getChapa() == chapa){
                //Arrancar_Astro(x);
                System.out.println("Chapa encontrada en Astro");
            }
        }
        for(OmnibusTurismo x: turismo){
            if(x.getChapa() == chapa){
                //Arrancar_Turismo(x);
                System.out.println("Chapa encontrada en Turismo");
            }
        }
    }
    
    public void Arrancar_Astro(OmnibusAstro x){         
        System.out.println("Astro");
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
        System.out.println("Turismo");
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
    
    /*
     * Metodos para Mostrar las listas en la ventana mostrar
     */
    public String[] MostrarTurismo(){
        List<String> l = new ArrayList<String>();
        for(OmnibusTurismo w:turismo){
            String m= String.format("%s, %s, %s, %d, %.2f, %s\n", w.getChapa(), w.getDestino(), w.getChofer(), w.getAsientos(), w.getKm_recorridos(), w.getHora_llegada());
            l.add(m);
        }
        String[] result = new String[l.size()];
        return l.toArray(result);
    }
    public String[] MostrarAstro(){
        List<String> l = new ArrayList<String>();
        for(OmnibusAstro w:astro){
            String m = String.format("%s, %s, %s, %d, %.2f, %s, %s", w.getChapa(), w.getDestino(), w.getChofer(), w.getAsientos(), w.getKm_recorridos(), w.getDia_salida(), w.getHora_salida());
            l.add(m);
        }
        String[] result = new String[l.size()];
        return l.toArray(result);
    }

    public String MostrarEspera(){
        String l = "Lista de Espera\n";
        for(ListaEspera w:listaespera){
            String m = String.format("%s, %s, %s, %s\n", w.getId(), w.getDestino()[0], w.getDestino()[1], w.getDestino()[2]);
            l.concat(m);
        }
        return l;
    }

    public String MostrarOficial(){
        String l = "Lista de Oficial\n";
        for(ListaOficial w:listaoficial){
            String m = String.format("%s, %s, %s\n", w.getId(), w.getDia_salida(), w.getDestino());
            l.concat(m);
        }
        return l;
    }

    public String MostrarRecogidos(){
        String l = "Lista de Recogidos\n";
        for(Recogidos w:recogidos){
            String m = String.format("%s, %s, %s\n", w.getId(), w.getChapa(), w.getDestino());
            l.concat(m);
        }
        return l;
    }
}
