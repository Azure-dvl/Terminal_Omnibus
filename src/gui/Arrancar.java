package src.gui;

import src.Metodos;
import src.Metodos.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Ventana para llamar al metodo arrancar
 */

public class Arrancar extends JPanel{
    
    Metodos nuevo = new Metodos();

    public Arrancar(){
        super();
        this.setLayout(new BorderLayout());
        JLabel l = new JLabel("Esta es mi ventana Arrancar");
        this.add(l);

        this.setVisible(true);
    }
}
