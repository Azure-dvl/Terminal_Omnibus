package src.data;

import src.clases.*;

import java.io.*;
import java.util.List;

/*
 * Data para txts
 */

public class data {

    public static void main(String[] args) {
        data d = new data();
        d.datos();
    }

    public void datos(){
        String[] chard = new String[10000];
        
        try{
            FileReader file = new FileReader("src/data/ListaAstro.txt");
            BufferedReader input = new BufferedReader(file);

            input.read();
            System.out.println("Linea dentro del txt");
            System.out.println(chard);

            input.close();
        }
        catch(Exception f){
            System.out.println(f);
        }
        
    }

    public void dataListAstro(List<OmnibusAstro> x){
        try{
            String cadena = "LISTA DE OMNIBUS ASTRO";
            FileWriter file = new FileWriter("src/data/ListaAstro.txt");
            BufferedWriter input = new BufferedWriter(file);
            input.write(cadena);
            for(OmnibusAstro z: x){
                String c = String.format("%s, %s, %s, %d, %f, %s, %s", z.getChapa(), z.getDestino(), z.getChofer(), z.getAsientos(), z.getKm_recorridos(), z.getDia_salida(), z.getHora_salida());
                input.newLine();
                input.write(c);
            }

            input.close();
        }
        catch(Exception f){
            System.out.println(f);
        }
    }

    public void dataListTurismo(List<OmnibusTurismo> x){
        try{
            String cadena = "LISTA DE OMNIBUS TURISMO";
            FileWriter file = new FileWriter("src/data/ListaTurismo.txt");
            BufferedWriter input = new BufferedWriter(file);
            input.write(cadena);
            for(OmnibusTurismo z: x){
                String c = String.format("%s, %s, %s, %d, %f, %s", z.getChapa(), z.getDestino(), z.getChofer(), z.getAsientos(), z.getKm_recorridos(), z.getHora_llegada());
                input.newLine();
                input.write(c);
            }

            input.close();
        }
        catch(Exception f){
            System.out.println(f);
        }
    }

    public void dataListEspera(List<ListaEspera> x){
        try{
            String cadena = "LISTA DE ESPERA";
            FileWriter file = new FileWriter("src/data/ListaEspera.txt");
            BufferedWriter input = new BufferedWriter(file);
            input.write(cadena);
            for(ListaEspera z: x){
                String c = String.format("%s, %s, %s, %s", z.getId(), z.getDestino()[0], z.getDestino()[1], z.getDestino()[2]);
                input.newLine();
                input.write(c);
            }

            input.close();
        }
        catch(Exception f){
            System.out.println(f);
        }
    }

    public void dataListOficial(List<ListaOficial> x){
        try{
            String cadena = "LISTA OFICIAL";
            FileWriter file = new FileWriter("src/data/ListaOficial.txt");
            BufferedWriter input = new BufferedWriter(file);
            input.write(cadena);
            for(ListaOficial z: x){
                String c = String.format("%s, %s, %s", z.getId(), z.getDia_salida(), z.getDestino());
                input.newLine();
                input.write(c);
            }

            input.close();
        }
        catch(Exception f){
            System.out.println(f);
        }
    }

    public void dataListRecogidos(List<Recogidos> x){
        try{
            String cadena = "LISTA DE RECOGIDOS";
            FileWriter file = new FileWriter("src/data/ListaRecogidos.txt");
            BufferedWriter input = new BufferedWriter(file);
            input.write(cadena);
            for(Recogidos z: x){
                String c = String.format("%s, %s, %s", z.getId(), z.getChapa(), z.getDestino());
                input.newLine();
                input.write(c);
            }

            input.close();
        }
        catch(Exception f){
            System.out.println(f);
        }
    }
}


