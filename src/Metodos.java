package src;

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

    List<Recogidos> recogidos = new ArrayList<>();
    
    List<ListaEspera> listaespera = new ArrayList<>();
    List<ListaOficial> listaoficial = new ArrayList<>();
    List<OmnibusAstro> astro = new ArrayList<>();
    List<OmnibusTurismo> turismo = new ArrayList<>();

    public void Add_ListEspera(int id, String[] destinos){
        ListaEspera lista = new ListaEspera(id, destinos);
        listaespera.add(lista);
    }
    public void Add_ListOficial(int id, String dia_salida, String dia_llegada){
        ListaOficial lista = new ListaOficial(id, dia_salida, dia_llegada);
        listaoficial.add(lista);
    }

    public void Add_ListTurismo(String chapa, String destino, String chofer, int cant_asientos, float km_recorridos, String hora_llegada){
        OmnibusTurismo lista = new OmnibusTurismo(chapa, destino, chofer, cant_asientos, km_recorridos, hora_llegada);
        turismo.add(lista);
    }
    public void Add_ListAstro(String chapa, String destino, String chofer, int cant_asientos, float km_recorridos, String dia_salida, String hora_salida){
        OmnibusAstro lista = new OmnibusAstro(chapa, destino, chofer, cant_asientos, km_recorridos, dia_salida, hora_salida);
        astro.add(lista);
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

    public void Mostrar(){
        for(OmnibusTurismo x: turismo){
            System.out.println(x.getChapa());
        }
    }
    
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
