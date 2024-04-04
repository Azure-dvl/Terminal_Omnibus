package src.gui;

import src.Metodos;

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
        this.setLayout(new GridLayout(3,0));
        
        JPanel cont1 = new JPanel(new GridLayout(0,2));

        JLabel lastro = new JLabel("Lista de Omnubus Astro");
        JList<String> astroList = new JList<String>();
        JLabel lturismo = new JLabel("Lista de Omnubus Turismo");
        JList<String> turismoList = new JList<String>();
        
        JButton arrancar = new JButton("Arrancar");
        JButton actualizar = new JButton("Actualizar");
        
        /*
         * Eventos!
         */
        arrancar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(!astroList.isSelectionEmpty()){
                    String listaa = astroList.getSelectedValue();
                    nuevo.RecogerValora(listaa);
                }
                if (!turismoList.isSelectionEmpty()) {
                    String listat = turismoList.getSelectedValue();
                    nuevo.RecogerValort(listat);
                }
            }
        });
        actualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                astroList.setListData(nuevo.MostrarAstro());
                turismoList.setListData(nuevo.MostrarTurismo());
            }
        });

        /*
         * Agregando los elementos a la ventana
         */
        cont1.add(lastro);
        cont1.add(astroList);
        cont1.add(lturismo);
        cont1.add(turismoList);

        this.add(cont1);
        this.add(actualizar);
        this.add(arrancar);

        this.setVisible(true);
    }
}
