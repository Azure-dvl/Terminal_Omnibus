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

        JList<String> astroList = new JList<String>();
        JList<String> turismoList = new JList<String>();
        JList<String> esferalList = new JList<String>();
        JList<String> oficialList = new JList<String>();
        JList<String> recogidaList = new JList<String>();

        JLabel lastro = new JLabel("Lista de Omnibus Astro");
        JLabel lturismo = new JLabel("Lista de Omnibus Turismo");
        JLabel lespera = new JLabel("Lista de Espera");
        JLabel loficial = new JLabel("Lista Oficial");
        JLabel lrecogidos = new JLabel("Lista de Pasajeros Recogidos y Omnibus Idos");

        JPanel l_panel = new JPanel();
        l_panel.setLayout(new BoxLayout(l_panel, BoxLayout.Y_AXIS));
        l_panel.setBorder(BorderFactory.createTitledBorder("Ranking!"));
        JLabel dinertotal = new JLabel("");
        JLabel destinotop = new JLabel("");
        JLabel omnibutop = new JLabel("");
        JLabel astroido = new JLabel("");
        JLabel turismoido = new JLabel("");
        l_panel.add(dinertotal);
        l_panel.add(destinotop);
        l_panel.add(omnibutop);
        l_panel.add(astroido);
        l_panel.add(turismoido);

        JButton btn_actualizar = new JButton("Actualizar valores");

        /*
         * Events!
         */
        btn_actualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                astroList.setListData(nuevo.MostrarAstro());
                turismoList.setListData(nuevo.MostrarTurismo());
                esferalList.setListData(nuevo.MostrarEspera());
                oficialList.setListData(nuevo.MostrarOficial());
                recogidaList.setListData(nuevo.MostrarRecogidos());
                
                // Labels
                dinertotal.setText("Dinero Recuadado: "+nuevo.getDinero_total());
                omnibutop.setText("Omnibus que mas dinero recaudado: "+nuevo.getDinero_omnibus());
                astroido.setText("Cantidad de Omnibus Astro idos: "+nuevo.getIdos_astros());
                turismoido.setText("Cantidad de Omnibus Turismo ido: "+nuevo.getIdos_turismo());

            }
        });

        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(2, 2, 2, 2);

        /*
         * Agregando los elementos a la ventana
         */
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
