package src;

import src.gui.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Ventana Principal del programa
 */

public class window extends JFrame{
    
    AgregarPasajero pasajeros = new AgregarPasajero();
    AgregarOmnibus omnibus = new AgregarOmnibus();
    Mostrar mostrar = new Mostrar();
    Arrancar arrancar = new Arrancar();

    JButton btn_omnibus; JButton btn_pasajero; JButton btn_arrancar; JButton btn_actualizar; JButton btn_filtrar; JTextField filtrar; JLabel resultado_buscar;

    public void run(){
        // Configuracion de la ventana principal
        this.setTitle("Terminal de Omnibus");
        this.setSize(800, 500);
        // this.setResizable(false);
        this.setDefaultCloseOperation(window.EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout(2,2));
    
        // Panel de las listas
        JPanel contenedor = new JPanel();
    
        // Panel de botones
        JPanel botones = new JPanel();
        botones.setLayout(new GridLayout(1, 4));
    
        btn_actualizar = new JButton("Mostrar");
        btn_actualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                contenedor.removeAll();
                contenedor.add(mostrar);
                contenedor.updateUI();
            }
        });
        btn_omnibus = new JButton("Agregar Omnibus");
        btn_omnibus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                contenedor.removeAll();
                contenedor.add(omnibus);
                contenedor.updateUI();
            } 
        });
        btn_pasajero = new JButton("Agregar Pasajero");
        btn_pasajero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                contenedor.removeAll();
                contenedor.add(pasajeros);
                contenedor.updateUI();
            }
        });
        btn_arrancar = new JButton("Arrancar");
        btn_arrancar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                contenedor.removeAll();
                contenedor.add(arrancar);
                contenedor.updateUI();
            }
        });
    
        botones.add(btn_actualizar);
        botones.add(btn_omnibus);
        botones.add(btn_pasajero);
        botones.add(btn_arrancar);
    
        // Panel de busqueda
        JPanel buscar = new JPanel();
        buscar.setLayout(new GridLayout(2,2));
          
        filtrar = new JTextField(10);
        btn_filtrar = new JButton("Filtrar");
        resultado_buscar = new JLabel("El resultado de la busqueda aparece aqui. Para buscar por fecha el formato es d/m/a");
        resultado_buscar.setForeground(Color.LIGHT_GRAY);
    
        buscar.add(filtrar);
        buscar.add(btn_filtrar);
        buscar.add(resultado_buscar);
    
        JPanel container = new JPanel();
        container.setLayout(new BorderLayout());

        container.add(contenedor, BorderLayout.NORTH);
        container.add(botones, BorderLayout.SOUTH);

        this.add(buscar, BorderLayout.NORTH);
        this.add(container, BorderLayout.CENTER);
        
        this.setVisible(true);
    }
}
