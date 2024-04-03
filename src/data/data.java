package src.data;

import src.clases.*;

import java.io.*;
import java.util.List;

/*
 * Data para txts
 */

public class data {

    public boolean Vacio(String dato){
        boolean ver = false;
        
        try(BufferedReader reader = new BufferedReader(new FileReader(dato))){
            if(reader.readLine()==null){
                ver = true;
            }else{
                ver = false;
            }
        }catch(Exception f){
            System.out.println(f);
        }
        return ver;
    }

    public void datosListAstro(List<OmnibusAstro> x){
        String dato = "src/data/ListaAstro.txt";
        String linea;

        try(BufferedReader reader = new BufferedReader(new FileReader(dato))){
            String[] elements = new String[6];
            if (!Vacio(dato)) {
                while ((linea = reader.readLine()) != null){
                    elements = linea.split(", ");
                }
                OmnibusAstro n = new OmnibusAstro(elements[0], elements[1], elements[2], Integer.parseInt(elements[3]), Float.parseFloat(elements[4]), elements[5], elements[6]);
                x.add(n);
            }
        }
        catch(Exception f){
            System.out.println(f);
        }   
    }

    public void datosListTurismo(List<OmnibusTurismo> x){
        String dato = "src/data/ListaTurismo.txt";
        String linea;
        
        try(BufferedReader reader = new BufferedReader(new FileReader(dato))){
            String[] elements = new String[5];
            if (!Vacio(dato)) {
                while ((linea = reader.readLine()) != null){
                    elements = linea.split(", ");
                }
                OmnibusTurismo n = new OmnibusTurismo(elements[0], elements[1], elements[2], Integer.parseInt(elements[3]), Float.parseFloat(elements[4]), elements[5]);
                x.add(n);
            }
        }
        catch(Exception f){
            System.out.println(f);
        }
        
    }

    public void datosListOficial(List<ListaOficial> x){
        String dato = "src/data/ListaOficial.txt";
        String linea;

        try(BufferedReader reader = new BufferedReader(new FileReader(dato))){
            String[] elements = new String[2];
            if (!Vacio(dato)) {
                while ((linea = reader.readLine()) != null){
                    elements = linea.split(", ");
                }
                ListaOficial n = new ListaOficial(Integer.parseInt(elements[0]), elements[1], elements[2]);
                x.add(n);
            }
        }
        catch(Exception f){
            System.out.println(f);
        }
    }

    public void datosListEspera(List<ListaEspera> x){
        String dato = "src/data/ListaEspera.txt";
        String linea;

        try(BufferedReader reader = new BufferedReader(new FileReader(dato))){
            String[] elements = new String[3];
            if (!Vacio(dato)) {
                while ((linea = reader.readLine()) != null){
                    elements = linea.split(", ");
                }
                String[] n = new String[2];
                n[0]=elements[1];
                n[1]=elements[2];
                n[2]=elements[3];
                ListaEspera m = new ListaEspera(Integer.parseInt(elements[0]), n);
                x.add(m);
            }
        }
        catch(Exception f){
            System.out.println(f);
        }
        
    }

    public void datosListRecogidos(List<Recogidos> x){
        String dato = "src/data/ListaRecogidos.txt";        
        String linea;

        try(BufferedReader reader = new BufferedReader(new FileReader(dato))){
            String[] elements = new String[2];
            if (!Vacio(dato)) {
                while ((linea = reader.readLine()) != null){
                    elements = linea.split(", ");
                }
                Recogidos n = new Recogidos(Integer.parseInt(elements[0]), elements[1], elements[2]);
                x.add(n);
            }
        }
        catch(Exception f){
            System.out.println(f);
        }
        
    }

    public void dataListAstro(List<OmnibusAstro> x){
        String dato = "src/data/ListaAstro.txt";
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(dato))){
            for(OmnibusAstro z: x){
                String c = String.format("%s, %s, %s, %d, %f, %s, %s", z.getChapa(), z.getDestino(), z.getChofer(), z.getAsientos(), z.getKm_recorridos(), z.getDia_salida(), z.getHora_salida());
                if (Vacio(dato)) {
                    writer.write(c);
                    writer.newLine();
                }else{
                    writer.write(c);
                }       
            }
            writer.close();
        }catch(Exception f){
            System.out.println(f);
        }
    }

    public void dataListTurismo(List<OmnibusTurismo> x){
        String dato = "src/data/ListaTurismo.txt";
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(dato))){
            for(OmnibusTurismo z: x){
                String c = String.format("%s, %s, %s, %d, %f, %s", z.getChapa(), z.getDestino(), z.getChofer(), z.getAsientos(), z.getKm_recorridos(), z.getHora_llegada());
                if (Vacio(dato)) {
                    writer.write(c);
                    writer.newLine();
                }
                else{
                    writer.write(c);
                }
            }
            writer.close();
        }catch(Exception f){
            System.out.println(f);
        }
    }

    public void dataListEspera(List<ListaEspera> x){
        String dato = "src/data/ListaEspera.txt";
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(dato))){
            for(ListaEspera z: x){
                String c = String.format("%s, %s, %s, %s", z.getId(), z.getDestino()[0], z.getDestino()[1], z.getDestino()[2]);
                
                if (Vacio(dato)) {
                    writer.write(c);
                    writer.newLine();
                }else{
                    writer.write(c);
                }       
            }
            writer.close();
        }catch(Exception f){
            System.out.println(f);
        }
    }

    public void dataListOficial(List<ListaOficial> x){
        String dato = "src/data/ListaOficial.txt";
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(dato))){
            for(ListaOficial z: x){
                String c = String.format("%s, %s, %s", z.getId(), z.getDia_salida(), z.getDestino());
                if (Vacio(dato)) {
                    writer.write(c);
                    writer.newLine();
                }else{
                    writer.write(c);
                }       
            }
            writer.close();
        }catch(Exception f){
            System.out.println(f);
        }
    }

    public void dataListRecogidos(List<Recogidos> x){
        String dato = "src/data/ListaRecogidos.txt";
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(dato))){
            for(Recogidos z: x){
                String c = String.format("%s, %s, %s", z.getId(), z.getChapa(), z.getDestino());
                if (Vacio(dato)) {
                    writer.write(c);
                    writer.newLine();
                }else{
                    writer.write(c);
                }       
            }
            writer.close();
        }catch(Exception f){
            System.out.println(f);
        }
    }
}


