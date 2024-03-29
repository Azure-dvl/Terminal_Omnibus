package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Ventana para agregar los omnibus a la listas
 */

public class AgregarOmnibus extends JPanel{

    Metodos nuevo = new Metodos();
    
    JTextField chapa; JTextField destino; JTextField chofer; JTextField asientos; JRadioButton turismo; JRadioButton astro; JTextField hora_llegada; JTextField dia_salida;JLabel ldia_salida; JLabel lhora_llegada; JLabel lhora_salida; JTextField hora_salida; JButton agregar; JTextField km;

    public AgregarOmnibus(){
        super();
        this.setSize(800, 500);

        this.setLayout(new GridLayout(2,0));

        JPanel cont1 = new JPanel(new GridLayout(9, 2));

        JLabel lchapa = new JLabel("Chapa: ");
        chapa = new JTextField(12);

        JLabel ldestino = new JLabel("Destino: ");
        destino = new JTextField(12);

        JLabel lchofer = new JLabel("Chofer: ");
        chofer = new JTextField(12);

        JLabel lasientos = new JLabel("Cantidad de asientos: ");
        asientos = new JTextField(5);

        JLabel lkm = new JLabel("Km de distancia: ");
        km = new JTextField(5);

        JLabel tipo = new JLabel("Tipo: ");
        ButtonGroup buttonGroup = new ButtonGroup();
        turismo = new JRadioButton("Turismo");
        turismo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(turismo.isSelected()){
                    lhora_llegada.setVisible(true);
                    ldia_salida.setVisible(false);
                    lhora_salida.setVisible(false);
                    hora_llegada.setVisible(true);
                    dia_salida.setVisible(false);
                    hora_salida.setVisible(false);
                }
            }
        });
        astro = new JRadioButton("Astro");
        astro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(astro.isSelected()){
                    lhora_llegada.setVisible(false);
                    ldia_salida.setVisible(true);
                    lhora_salida.setVisible(true);
                    hora_llegada.setVisible(false);
                    dia_salida.setVisible(true);
                    hora_salida.setVisible(true);
                }
            }
        });
        buttonGroup.add(turismo);
        buttonGroup.add(astro);
        JPanel cont2 = new JPanel();
        cont2.add(turismo);
        cont2.add(astro);

        // Ocultos
        lhora_llegada = new JLabel("hora de llegada: ");
        hora_llegada = new JTextField("h/m",12);
        ldia_salida = new JLabel("Dia de salida: ");
        dia_salida = new JTextField("dd/mm/aa",12);
        lhora_salida = new JLabel("Hora de salida: ");
        hora_salida = new JTextField("h/m",12);

        lhora_llegada.setVisible(false);
        ldia_salida.setVisible(false);
        lhora_salida.setVisible(false);
        hora_llegada.setVisible(false);
        dia_salida.setVisible(false);
        hora_salida.setVisible(false);

        
        agregar = new JButton("Agregar");
        agregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (turismo.isSelected()) {
                    try{
                        nuevo.Add_ListTurismo(chapa.getText(), destino.getText(), chofer.getText(), Integer.valueOf(asientos.getText()), Integer.valueOf(km.getText()), hora_llegada.getText());
                    }catch(Exception f){
                        System.out.println("Excepcion ==> " +f.getMessage());
                    }
                }
                else if(astro.isSelected()){
                    try{
                        nuevo.Add_ListAstro(chapa.getText(), destino.getText(), chofer.getText(), Integer.valueOf(asientos.getText()), Integer.valueOf(km.getText()), dia_salida.getText(), hora_salida.getText());
                    }catch(Exception f){
                        System.out.println("Excepcion ==> " +f.getMessage());
                    }
                }
                else{System.out.println("Rellene todas las casillas");}
            }
        });

        this.add(cont1, BorderLayout.CENTER);
        this.add(agregar, BorderLayout.SOUTH);

        cont1.add(lchapa, BorderLayout.WEST);
        cont1.add(chapa, BorderLayout.EAST);

        cont1.add(lchofer, BorderLayout.WEST);
        cont1.add(chofer, BorderLayout.EAST);

        cont1.add(ldestino, BorderLayout.WEST);
        cont1.add(destino, BorderLayout.EAST);

        cont1.add(lasientos, BorderLayout.WEST);
        cont1.add(asientos, BorderLayout.EAST);

        cont1.add(lkm, BorderLayout.WEST);
        cont1.add(km, BorderLayout.EAST);

        cont1.add(tipo, BorderLayout.WEST);
        cont1.add(cont2, BorderLayout.EAST);

        cont1.add(lhora_llegada, BorderLayout.WEST);
        cont1.add(hora_llegada, BorderLayout.EAST);

        cont1.add(lhora_salida, BorderLayout.WEST);
        cont1.add(hora_salida, BorderLayout.EAST);

        cont1.add(ldia_salida, BorderLayout.WEST);
        cont1.add(dia_salida, BorderLayout.EAST);
        
        this.setVisible(true);
    }


}
