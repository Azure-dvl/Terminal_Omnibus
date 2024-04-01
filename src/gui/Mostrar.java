package src.gui;

import javax.swing.*;

import src.Metodos;

import java.awt.*;
import java.awt.event.*;

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
