package src.gui;

import src.Metodos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Ventana para agregar los omnibus a la listas
 */

public class AgregarOmnibus extends JPanel{

    // Atributos y Objetos
    Metodos nuevo = new Metodos();

    public AgregarOmnibus(){
        /*
         * Ventana y la configuracion
         */
        super();
        this.setLayout(new BorderLayout());

        JPanel cont1 = new JPanel(new GridLayout(9, 2));

        JLabel lchapa = new JLabel("Chapa: ");
        JTextField chapa = new JTextField(12);

        JLabel ldestino = new JLabel("Destino: ");
        JTextField destino = new JTextField(12);

        JLabel lchofer = new JLabel("Chofer: ");
        JTextField chofer = new JTextField(12);

        JLabel lasientos = new JLabel("Cantidad de asientos: ");
        JTextField asientos = new JTextField(5);

        JLabel lkm = new JLabel("Km de distancia: ");
        JTextField km = new JTextField(5);

        JLabel tipo = new JLabel("Tipo: ");
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton turismo = new JRadioButton("Turismo");
        JRadioButton astro = new JRadioButton("Astro");
        buttonGroup.add(turismo);
        buttonGroup.add(astro);
        JPanel cont2 = new JPanel();
        cont2.add(turismo);
        cont2.add(astro);

        JButton agregar = new JButton("Agregar");

        /*
         * Elementos Ocultos de la ventana
         */
        JLabel lhora_llegada = new JLabel("hora de llegada: ");
        JTextField hora_llegada = new JTextField(12);
        JLabel ldia_salida = new JLabel("Dia de salida: ");
        JTextField dia_salida = new JTextField(12);
        JLabel lhora_salida = new JLabel("Hora de salida: ");
        JTextField hora_salida = new JTextField(12);

        lhora_llegada.setVisible(false);
        ldia_salida.setVisible(false);
        lhora_salida.setVisible(false);
        hora_llegada.setVisible(false);
        dia_salida.setVisible(false);
        hora_salida.setVisible(false);

        /*
         * Eventos!
         */
        turismo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                // Metodo para cuando se seleccione Turismo se muestren los elementos ocultos
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
        astro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                // Metodo para cuando se seleccione Astro se muestren los elementos ocultos
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
        agregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                // Llamada de los diferentes metodos de Agregrar Turismo y Astro
                if (turismo.isSelected()) {
                    
                    if(chapa.getText().equals("") || destino.getText().equals("")|| chofer.getText().equals("") || asientos.getText().equals("") || km.getText().equals("") || hora_llegada.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Por favor, rellene todas las casillas", "Alerta", JOptionPane.WARNING_MESSAGE);
                    }else{
                        try{
                            nuevo.Add_ListTurismo(chapa.getText(), destino.getText(), chofer.getText(), Integer.valueOf(asientos.getText()), Integer.valueOf(km.getText()), hora_llegada.getText());

                            chapa.setText("");
                            chofer.setText("");
                            destino.setText("");
                            asientos.setText("");
                            km.setText("");
                            hora_llegada.setText("");
                        }catch(Exception f){
                            JOptionPane.showMessageDialog(null, "Por favor, solo numeros en las casillas de km y asientos", "Alerta", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    
                }
                else if(astro.isSelected()){
                    if(chapa.getText().equals("") || destino.getText().equals("") || chofer.getText().equals("")|| asientos.getText().equals("") || km.getText().equals("") || hora_salida.getText().equals("") || dia_salida.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Por favor, rellene todas las casillas", "Alerta", JOptionPane.WARNING_MESSAGE);
                    }else{
                        try{
                            nuevo.Add_ListAstro(chapa.getText(), destino.getText(), chofer.getText(), Integer.valueOf(asientos.getText()), Integer.valueOf(km.getText()), dia_salida.getText(), hora_salida.getText());

                            chapa.setText("");
                            chofer.setText("");
                            destino.setText("");
                            asientos.setText("");
                            km.setText("");
                            hora_salida.setText("");
                            dia_salida.setText("");
                        }catch(Exception f){
                            JOptionPane.showMessageDialog(null, "Por favor, solo numeros en las casillas de km y asientos", "Alerta", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }else{JOptionPane.showMessageDialog(null, "Por favor, rellene todas las casillas", "Alerta", JOptionPane.WARNING_MESSAGE);}
            }
        });

        /*
         * Agregando los elementos a la ventana
         */
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

        this.add(cont1, BorderLayout.CENTER);
        this.add(agregar, BorderLayout.SOUTH);

        this.setVisible(true);
    }


}
