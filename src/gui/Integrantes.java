package src.gui;

import javax.swing.*;
import java.awt.*;

/*
 * Ventana para los integrantes
 */

public class Integrantes extends JPanel{
    public Integrantes(){
        super();
        this.setLayout(new BorderLayout());

        JPanel l_panel = new JPanel();
        l_panel.setPreferredSize(new Dimension(250,100));

        l_panel.setLayout(new BoxLayout(l_panel, BoxLayout.Y_AXIS));
        l_panel.setBorder(BorderFactory.createTitledBorder("Proyecto 1: Terminal de Omnibus"));
        JLabel integrante1 = new JLabel("Esmeralda Cespedes Chavez");
        JLabel integrante2 = new JLabel("Liz Judith Laborit Garcia");
        JLabel integrante3 = new JLabel("Yanet Angelica Cabreja Vega");
        JLabel integrante4 = new JLabel("Jose Carlos Coneza Perez");

        l_panel.add(integrante1);
        l_panel.add(integrante2);
        l_panel.add(integrante3);
        l_panel.add(integrante4);

        this.add(l_panel);

        this.setVisible(true);
    }
}