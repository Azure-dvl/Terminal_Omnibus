package src;

import javax.swing.*;
import java.awt.*;

public class buscar extends JFrame{

    public buscar(){
        super();
        this.setLayout(new BorderLayout());
        
        JLabel text5 = new JLabel("Busqueda de omnibus y pasajeros");

        this.add(text5, BorderLayout.NORTH);
        this.setVisible(true);
        
    }
}