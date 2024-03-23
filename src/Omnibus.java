package src;

import javax.swing.*;
import java.awt.*;

public class Omnibus extends JPanel{    

    public Omnibus(){
        super();
        this.setLayout(new BorderLayout());
        
        JLabel text1 = new JLabel("Agregar la llegada del omnibus");
        JPanel cont = new JPanel();

        cont.add(text1);

        JPanel cont1 = new JPanel();

        JLabel lchapa = new JLabel("Chapa: ");
        JTextField chapa = new JTextField(12);

        JLabel ldestino = new JLabel("Destino: ");
        JTextField destino = new JTextField(12);

        JLabel lchofer = new JLabel("Chofer: ");
        JTextField chofer = new JTextField(12);

        JLabel lasientos = new JLabel("Cantidad de asientos: ");
        JTextField asientos = new JTextField(5);

        JLabel tipo = new JLabel("Tipo: ");
        JCheckBox turismo = new JCheckBox("Turismo");
        JCheckBox astro = new JCheckBox("Astro");

        // Ocultos
        JLabel ldia_llegada = new JLabel("Dia de llegada: ");
        JTextField dia_llegada = new JTextField(12);

        JLabel ldia_salida = new JLabel("Dia de salida");
        JTextField dia_salida = new JTextField(12);

        JButton agregar = new JButton("Agregar");

        this.add(text1, BorderLayout.NORTH);
        this.add(cont1, BorderLayout.SOUTH);

        cont1.add(lchapa, BorderLayout.WEST);
        cont1.add(chapa, BorderLayout.EAST);

        this.setVisible(true);
    }
}
