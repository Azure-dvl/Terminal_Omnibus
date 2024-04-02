package src.gui;

import src.data.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Ventana para mostrar las diferentes listas
 */

public class Mostrar extends JPanel{

    data data = new data();


    public Mostrar(){
        super();
        this.setLayout(new BorderLayout());

        JLabel l = new JLabel("Esta es mi ventana Mostrar");
        this.add(l);

        
        this.setVisible(true);
    }
    
}
