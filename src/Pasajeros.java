package src;

import javax.swing.*;
import java.awt.*;

public class Pasajeros extends JPanel{
    
    public Pasajeros(){
        super();
        this.setLayout(new BorderLayout());

        JLabel text2 = new JLabel("Agregar la llegada del pasajero");
        JPanel cont1 = new JPanel();

        JLabel lid = new JLabel("ID: ");
        JTextField id = new JTextField(12);

        JLabel tipo = new JLabel("tipo: ");
        JRadioButton oficial = new JRadioButton("Oficial");
        JRadioButton espera = new JRadioButton("Espera");

        // Ocultos
        JLabel destinos = new JLabel("Posibles destinos");
        JTextField destino1 = new JTextField(12);
        JTextField destino2 = new JTextField(12);
        JTextField destino3 = new JTextField(12);

        JLabel ldia_salida = new JLabel("Dia de salida");
        JTextField dia_salida = new JTextField(12);

        JButton agregar = new JButton("Agregar");

        this.add(text2, BorderLayout.NORTH);
        this.add(cont1, BorderLayout.SOUTH);
        
        cont1.add(lid, BorderLayout.WEST);
        cont1.add(id, BorderLayout.EAST);
    }
}
