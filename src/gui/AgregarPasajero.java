package src.gui;

import src.Metodos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * Ventana para agregar los pasajeros a la listas
 */

public class AgregarPasajero extends JPanel{

    // Atributos y Objetos
    Metodos nuevo = new Metodos();
    
    JTextField id; JButton agregar; JTextField destino1 ;JTextField destino2; JTextField destino3; JTextField dia_salida; JLabel ldestino; JLabel ldia_salida;JRadioButton espera; JRadioButton oficial;

    public AgregarPasajero(){
        /*
         * Ventana y la configuracion
         */
        super();
        this.setLayout(new BorderLayout());

        JPanel cont1 = new JPanel(new GridLayout(4,2));
        
        JLabel lid = new JLabel("ID: ");
        id = new JTextField(12);

        JLabel tipo = new JLabel("Lista a ingresar: ");
        ButtonGroup buttonGroup = new ButtonGroup();
        espera = new JRadioButton("Espera");
        oficial = new JRadioButton("Oficial");
        
        buttonGroup.add(espera);
        buttonGroup.add(oficial);
        JPanel cont2 = new JPanel();
        cont2.add(espera);
        cont2.add(oficial);

        agregar = new JButton("Agregar");

        /*
         * Elementos Ocultos de la ventana
         */
        ldestino = new JLabel("Destino: ");
        destino1 = new JTextField(10);
        destino2 = new JTextField(10);
        destino3 = new JTextField(10);
        JPanel cont3 = new JPanel();
        cont3.add(destino1);
        cont3.add(destino2);
        cont3.add(destino3);

        ldia_salida = new JLabel("Dia de salida: ");
        dia_salida = new JTextField(12);

        ldestino.setVisible(false);
        destino1.setVisible(false);
        destino2.setVisible(false);
        destino3.setVisible(false);
        ldia_salida.setVisible(false);
        dia_salida.setVisible(false);

        /*
         * Eventos!
         */
        espera.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                // Metodo para cuando se seleccione Espera se muestren los elementos ocultos
                if(espera.isSelected()){
                    ldestino.setVisible(true);
                    destino1.setVisible(true);
                    destino2.setVisible(true);
                    destino3.setVisible(true);
                    ldia_salida.setVisible(false);
                    dia_salida.setVisible(false);
                }
            }
        });
        oficial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                // Metodo para cuando se seleccione Oficial se muestren los elementos ocultos
                if(oficial.isSelected()){
                    ldestino.setVisible(true);
                    destino1.setVisible(true);
                    destino2.setVisible(false);
                    destino3.setVisible(false);
                    ldia_salida.setVisible(true);
                    dia_salida.setVisible(true);
                }
            }
        });
        agregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                // Llamada de los diferentes metodos de Agregrar Espera y Lista
                if (espera.isSelected()) {
                    if (id.getText()==" "||destino1.getText()==" "||destino2.getText()==null||destino3.getText()==" ") {
                        JOptionPane.showMessageDialog(null, "Por favor, rellene todas las casillas", "Alerta", JOptionPane.WARNING_MESSAGE);
                    }
                    else{
                        try{
                            String[] destinos = new String[3];
                            destinos[0] = destino1.getText();
                            destinos[1] = destino2.getText();
                            destinos[2] = destino3.getText();
                            nuevo.Add_ListEspera(id.getText(), destinos);
    
                        }catch(Exception f){
                            JOptionPane.showMessageDialog(null, "ERROR: "+f, "Alerta", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else if(oficial.isSelected()){
                    if (id.getText()!=" "||destino1.getText()!=""||dia_salida.getText()!="") {
                        try{
                            nuevo.Add_ListOficial(id.getText(), dia_salida.getText(), destino1.getText());
    
                        }catch(Exception f){
                            JOptionPane.showMessageDialog(null, "ERROR: "+f, "Alerta", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else{
                        
                        JOptionPane.showMessageDialog(null, "Por favor, rellene todas las casillas", "Alerta", JOptionPane.WARNING_MESSAGE);
                    }    
                }
                else{JOptionPane.showMessageDialog(null, "Por favor, rellene todas las casillas", "Alerta", JOptionPane.WARNING_MESSAGE);}
            }
        });

        /*
         * Agregando los elementos a la ventana
         */
        this.add(cont1, BorderLayout.CENTER);
        this.add(agregar, BorderLayout.SOUTH);

        cont1.add(lid, BorderLayout.WEST);
        cont1.add(id, BorderLayout.EAST);

        cont1.add(tipo, BorderLayout.WEST);
        cont1.add(cont2, BorderLayout.EAST);

        cont1.add(ldestino, BorderLayout.WEST);
        cont1.add(cont3, BorderLayout.EAST);

        cont1.add(ldia_salida, BorderLayout.WEST);
        cont1.add(dia_salida, BorderLayout.EAST);

        this.setVisible(true);
    }
}
