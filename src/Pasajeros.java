package src;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class Pasajeros extends JPanel{
    
    public Pasajeros(){
        super();
        this.setLayout(new BorderLayout(0,5));

        JLabel text2 = new JLabel("Agregar la llegada del pasajero");
        JPanel cont1 = new JPanel(new GridLayout(4, 2)); // Ajustar las rows para cuando se agreguen los campos ocultos
        cont1.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        JLabel lid = new JLabel("ID: ");
        JTextField id = new JTextField(12);

        JLabel tipo = new JLabel("tipo: ");
        ButtonGroup radios = new ButtonGroup();
        JRadioButton oficial = new JRadioButton("Oficial");
        JRadioButton espera = new JRadioButton("Espera");
        radios.add(oficial);
        radios.add(espera);
        JPanel radioGroup = new JPanel();
        radioGroup.add(oficial);
        radioGroup.add(espera);

        // Ocultos
        JLabel destinos = new JLabel("Posibles destinos");
        final int COLUMNS = 8;
        JTextField destino1 = new JTextField(COLUMNS);
        JTextField destino2 = new JTextField(COLUMNS);
        JTextField destino3 = new JTextField(COLUMNS);
        JPanel pDestinos = new JPanel(new BorderLayout());
        pDestinos.add(destino1, BorderLayout.WEST);
        pDestinos.add(destino2, BorderLayout.CENTER);
        pDestinos.add(destino3, BorderLayout.EAST);

        JLabel ldia_salida = new JLabel("Dia de salida");
        JTextField dia_salida = new JTextField(12);

        JButton agregar = new JButton("Agregar");

        this.add(text2, BorderLayout.NORTH);
        this.add(cont1, BorderLayout.CENTER);
        this.add(agregar, BorderLayout.SOUTH);
        
        cont1.add(lid, BorderLayout.WEST);
        cont1.add(id, BorderLayout.EAST);

        cont1.add(tipo, BorderLayout.WEST);
        cont1.add(radioGroup, BorderLayout.EAST);

        // Destinos
        // cont1.add(destinos, BorderLayout.WEST);
        // cont1.add(pDestinos, BorderLayout.EAST);

        cont1.add(ldia_salida, BorderLayout.WEST);
        cont1.add(dia_salida, BorderLayout.EAST);
    }
}
