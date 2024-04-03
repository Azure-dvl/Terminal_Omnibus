package src.gui;

import src.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Ventana para mostrar las diferentes listas
 */

public class Mostrar extends JPanel {

    Metodos nuevo = new Metodos();
    JLabel lastro;
    JLabel lturismo;
    JLabel lrecogidos;
    JLabel lespera;
    JLabel loficial;
    JButton btn_actualizar;
    GridBagLayout layout;
    GridBagConstraints constraints;

    void addElement(JComponent component, int x, int y) {
        this.constraints.gridx = x;
        this.constraints.gridy = y;
        this.layout.setConstraints(component, this.constraints);
        this.add(component);
    }

    void addElement(JComponent component, int x, int y, int width) {
        this.constraints.gridx = x;
        this.constraints.gridy = y;
        constraints.gridwidth = width;
        this.layout.setConstraints(component, this.constraints);
        this.add(component);
    }

    void addElement(JComponent component, int x, int y, int width, int height) {
        this.constraints.gridx = x;
        this.constraints.gridy = y;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        this.layout.setConstraints(component, this.constraints);
        this.add(component);
    }

    public Mostrar() {
        super();

        this.layout = new GridBagLayout();
        this.constraints = new GridBagConstraints();
        this.setLayout(layout);

        // Las casillas de las listas se agregan cuando se pone un valor
        JList<String> astroList = new JList<String>();
        JList<String> turismoList = new JList<String>();
        JList<String> esferalList = new JList<String>();
        JList<String> oficialList = new JList<String>();
        JList<String> recogidaList = new JList<String>();

        lastro = new JLabel("Lista de Omnibus Astro");
        lturismo = new JLabel("Lista de Omnibus Turismo");
        lespera = new JLabel("Lista de Espera");
        loficial = new JLabel("Lista Oficial");
        lrecogidos = new JLabel("Lista de Pasajeros Recogidos y Omnibus Idos");

        btn_actualizar = new JButton("Actualizar listas");
        btn_actualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                astroList.setListData(nuevo.MostrarAstro());
                turismoList.setListData(nuevo.MostrarTurismo());
                // esferalList.setListData(nuevo.MostrarTurismo());
                // oficialList.setListData(nuevo.MostrarTurismo());
                // recogidaList.setListData(nuevo.MostrarTurismo());
            }
        });

        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(2, 2, 2, 2);

        addElement(lastro, 0, 0);
        addElement(lturismo, 1, 0);
        addElement(astroList, 0, 1);
        addElement(turismoList, 1, 1);
        addElement(btn_actualizar, 0, 2, 2);

        this.setVisible(true);
    }

}
