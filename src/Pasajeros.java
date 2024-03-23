package src;

import javax.swing.*;
import java.awt.*;

public class Pasajeros extends JPanel{
    
    public Pasajeros(){
        super();
        this.setLayout(new BorderLayout());

        JLabel text2 = new JLabel("Agregar la llegada del pasajero");
        this.add(text2, BorderLayout.NORTH);
    }
}
