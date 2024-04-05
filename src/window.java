package src;

import src.gui.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Ventana Principal del programa
 */

public class window extends JFrame{
    
    // Atributos y Objetos
    Metodos nuevo = new Metodos();
    
    AgregarPasajero pasajeros = new AgregarPasajero();
    AgregarOmnibus omnibus = new AgregarOmnibus();
    Mostrar mostrar = new Mostrar();
    Arrancar arrancar = new Arrancar();
    Integrantes integrante = new Integrantes();


    public void run(){
        /*
         * Ventana y la configuracion
         */
        this.setTitle("Terminal de Omnibus");
        this.setSize(800, 500);
        this.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(2,2));

        JPanel contenedor = new JPanel();
    
        JPanel botones = new JPanel();
        botones.setLayout(new GridLayout(1, 4));
    
        JButton btn_actualizar = new JButton("Mostrar");
        JButton btn_omnibus = new JButton("Agregar Omnibus");
        JButton btn_pasajero = new JButton("Agregar Pasajero");
        JButton btn_arrancar = new JButton("Arrancar");

        botones.add(btn_actualizar);
        botones.add(btn_omnibus);
        botones.add(btn_pasajero);
        botones.add(btn_arrancar);
    
        JPanel buscar = new JPanel();
        buscar.setLayout(new GridLayout(3,2));
          
        JTextField filtrar = new JTextField(10);
        JButton btn_filtrar = new JButton("Filtrar");
        JLabel resultado_buscar = new JLabel("Resultado de la busqueda: ");
        resultado_buscar.setForeground(Color.LIGHT_GRAY);
        JList<String> resultado = new JList<String>();

        buscar.add(filtrar);
        buscar.add(btn_filtrar);
        buscar.add(resultado_buscar);
        buscar.add(resultado);
    
        JPanel container = new JPanel();
        container.setLayout(new BorderLayout());

        /*
         * Eventos!
         */
        addWindowListener(new WindowAdapter() {
            // Evento para iniciar los txt como listas.
            @Override
            public void windowOpened(WindowEvent e) {
                nuevo.IniData();
            }
        });
        btn_actualizar.addActionListener(new ActionListener() {
            // Evento para moverse para la ventana Mostrar
            public void actionPerformed(ActionEvent e){
                contenedor.removeAll();
                contenedor.add(mostrar);
                contenedor.updateUI();
            }
        });
        btn_omnibus.addActionListener(new ActionListener() {
            // Evento para moverse para la ventana Omnibus
            public void actionPerformed(ActionEvent e){
                contenedor.removeAll();
                contenedor.add(omnibus);
                contenedor.updateUI();
            } 
        });
        btn_pasajero.addActionListener(new ActionListener() {
            // Evento para moverse para la ventana Pasajero
            public void actionPerformed(ActionEvent e){
                contenedor.removeAll();
                contenedor.add(pasajeros);
                contenedor.updateUI();
            }
        });
        btn_arrancar.addActionListener(new ActionListener() {
            // Evento para moverse para la ventana Arrancar
            public void actionPerformed(ActionEvent e){
                contenedor.removeAll();
                contenedor.add(arrancar);
                contenedor.updateUI();
            }
        });
        btn_filtrar.addActionListener(new ActionListener() {
            // Evento para la llamada del metodo Filtrar
            public void actionPerformed(ActionEvent e){
                resultado.setListData(nuevo.Filtrar(filtrar.getText()));
            }
        });
    
        /*
         * Agregando los elementos a la ventana
         */
        container.add(contenedor, BorderLayout.NORTH);
        container.add(botones, BorderLayout.SOUTH);

        contenedor.add(integrante);

        this.add(buscar, BorderLayout.NORTH);
        this.add(container, BorderLayout.CENTER);
        
        this.setVisible(true);
    }
}
