package src.gui;

import src.Metodos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/*
 * Ventana para mostrar las diferentes listas
 */

public class Mostrar extends JPanel{

    Metodos nuevo = new Metodos();


    public Mostrar(){
        super();
        this.setLayout(new BorderLayout());

        JLabel l = new JLabel("Esta es mi ventana Mostrar");
        this.add(l);

        
        this.setVisible(true);
    }
    
}
