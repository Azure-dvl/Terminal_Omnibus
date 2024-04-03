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

    JLabel lchapa; JTextField chapa; JButton arrancar;

    public Arrancar(){
        super();
        this.setLayout(new GridLayout(2,0));
        
        JPanel cont1 = new JPanel();
        lchapa = new JLabel("Ingrese la chapa del omnibus que desea arrancar: ");
        chapa = new JTextField(12);
        
        arrancar = new JButton("Arrancar");
        arrancar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String var = chapa.getText();
                nuevo.Buscarchapa(var);
                System.out.println(nuevo.MostrarAstro());
            }
        });
        
        cont1.add(lchapa, BorderLayout.EAST);
        cont1.add(chapa, BorderLayout.WEST);

        this.add(cont1);
        this.add(arrancar);

        this.setVisible(true);
    }
}
