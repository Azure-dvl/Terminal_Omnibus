package src.gui;

import src.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Ventana para mostrar las diferentes listas
 */

public class Mostrar extends JPanel{

    Metodos nuevo = new Metodos();
    JLabel lastro; JLabel lturismo; JLabel lrecogidos; JLabel lespera; JLabel loficial; JButton btn_actualizar;

    public Mostrar(){
        super();
        this.setLayout(new GridLayout(2,0));
        this.setBackground(Color.BLUE);

        JPanel cont1 = new JPanel(new GridLayout(0,2));
        cont1.setBackground(Color.RED);
        lastro = new JLabel("Lista de Omnibus Astro");
        lturismo = new JLabel("Lista de Omnibus Turismo");

        btn_actualizar = new JButton("Actualizar listas");
        btn_actualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                lastro.setText(nuevo.MostrarAstro());
                lturismo.setText(nuevo.MostrarTurismo());
            }
        });

        this.add(cont1);
        this.add(btn_actualizar);

        cont1.add(lastro);
        cont1.add(lturismo);

        this.setVisible(true);
    }
    
}
