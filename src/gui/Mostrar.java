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

        JPanel l_panel = new JPanel();
        l_panel.setLayout(new BoxLayout(l_panel, BoxLayout.Y_AXIS));
        l_panel.setBorder(BorderFactory.createTitledBorder("Labels"));
        JLabel Label1 = new JLabel("Random Label 1");
        JLabel Label2 = new JLabel("Random Label 2");
        JLabel Label3 = new JLabel("Random Label 3");
        JLabel Label4 = new JLabel("Random Label 4");
        JLabel Label5 = new JLabel("Random Label 5");
        l_panel.add(Label1);
        l_panel.add(Label2);
        l_panel.add(Label3);
        l_panel.add(Label4);
        l_panel.add(Label5);



        btn_actualizar = new JButton("Actualizar listas");
        btn_actualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                astroList.setListData(nuevo.MostrarAstro());
                turismoList.setListData(nuevo.MostrarTurismo());
                // esferalList.setListData(nuevo.MostrarTurismo());
                // oficialList.setListData(nuevo.MostrarTurismo());
                // recogidaList.setListData(nuevo.MostrarTurismo());
                esferalList.setListData(new String[]{"aaa"});
                oficialList.setListData(new String[]{"aaa"});
                recogidaList.setListData(new String[]{"aaa"});
            }
        });

        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(2, 2, 2, 2);

        addElement(lastro, 0, 0);
        addElement(astroList, 0, 1);

        addElement(lturismo, 1, 0);
        addElement(turismoList, 1, 1);

        addElement(lespera, 0, 2);
        addElement(esferalList, 0, 3);

        addElement(loficial, 1, 2);
        addElement(oficialList, 1, 3);

        addElement(lrecogidos, 0, 4, 2);
        addElement(recogidaList, 0, 5, 2);
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        addElement(btn_actualizar, 1, 6, 1);
        addElement(l_panel, 0, 6, 1);

        this.setVisible(true);
    }

}
