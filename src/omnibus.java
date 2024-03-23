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

        this.add(text1, BorderLayout.NORTH);
        this.add(cont1, BorderLayout.SOUTH);

        cont1.add(lchapa, BorderLayout.WEST);
        cont1.add(chapa, BorderLayout.EAST);


        this.setVisible(true);
    }
}
