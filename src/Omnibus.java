package src;

import javax.swing.*;
import java.awt.*;

public class Omnibus extends JPanel{    

    public Omnibus(){
        super();
        this.setLayout(new BorderLayout());
        
        JLabel text1 = new JLabel("Agregar la llegada del omnibus");
        text1.setHorizontalAlignment(JLabel.CENTER);
        JPanel cont = new JPanel();

        cont.add(text1);

        JPanel cont1 = new JPanel(new GridLayout(7, 2, 0, 3));

        JLabel lchapa = new JLabel("Chapa: ");
        JTextField chapa = new JTextField(12);

        JLabel ldestino = new JLabel("Destino: ");
        JTextField destino = new JTextField(12);

        JLabel lchofer = new JLabel("Chofer: ");
        JTextField chofer = new JTextField(12);

        JLabel lasientos = new JLabel("Cantidad de asientos: ");
        JTextField asientos = new JTextField(5);

        JLabel tipo = new JLabel("Tipo: ");
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton turismo = new JRadioButton("Turismo");
        JRadioButton astro = new JRadioButton("Astro");
        buttonGroup.add(turismo);
        buttonGroup.add(astro);
        JPanel cont2 = new JPanel();
        cont2.add(turismo);
        cont2.add(astro);

        // Ocultos
        JLabel ldia_llegada = new JLabel("Dia de llegada: ");
        JTextField dia_llegada = new JTextField(12);

        JLabel ldia_salida = new JLabel("Dia de salida");
        JTextField dia_salida = new JTextField(12);

        this.add(text1, BorderLayout.NORTH);
        this.add(cont1, BorderLayout.SOUTH);

        cont1.add(ldestino, BorderLayout.WEST);
        cont1.add(destino, BorderLayout.EAST);

        cont1.add(lchapa, BorderLayout.WEST);
        cont1.add(chapa, BorderLayout.EAST);

        cont1.add(lchofer, BorderLayout.WEST);
        cont1.add(chofer, BorderLayout.EAST);

        cont1.add(lasientos, BorderLayout.WEST);
        cont1.add(asientos, BorderLayout.EAST);

        cont1.add(tipo, BorderLayout.WEST);
        cont1.add(cont2, BorderLayout.EAST);

        cont1.add(ldia_llegada, BorderLayout.WEST);
        cont1.add(dia_llegada, BorderLayout.EAST);

        cont1.add(ldia_salida, BorderLayout.WEST);
        cont1.add(dia_salida, BorderLayout.EAST);

        this.setVisible(true);
    }
}
