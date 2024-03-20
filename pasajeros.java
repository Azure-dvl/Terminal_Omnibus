import javax.swing.*;
import java.awt.*;

public class pasajeros extends JFrame{
    
    public pasajeros(){
        JPanel container = new JPanel();
        container.setLayout(new BorderLayout());

        JLabel text2 = new JLabel("Agregar la llegada del pasajero");
        container.add(text2, BorderLayout.NORTH);
    }
}
