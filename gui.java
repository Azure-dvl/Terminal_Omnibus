import javax.swing.*;
import java.awt.*;

//import Terminal_Omnibus.*;

public class gui{
    // Principal
    public static void main(String[] args){
        Interfaz interfaz = new Interfaz();
        interfaz.setVisible(true);
    }
}

class Interfaz extends JFrame{
    public Interfaz(){
        setTitle("Terminal de Omnibus");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocationRelativeTo(null);

        // Contenedor
        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        // Panel izquierdo
        JPanel panel_izquierdo = new JPanel();
        panel_izquierdo.setBackground(Color.LIGHT_GRAY);
        panel_izquierdo.setPreferredSize(new Dimension(700, 20));

        // Ventana de Pasajeros
        JPanel add_Pasajeros = new JPanel();
        add_Pasajeros.setLayout(new GridLayout(4,2));

        

        // Panel Derecho
        JPanel panel_derecho = new JPanel();

        // Menu
        JLabel menu = new JLabel("MENU");
        JPanel titulo = new JPanel();
        titulo.add(menu);

        // Botones
        JPanel botones = new JPanel();
        botones.setLayout(new GridLayout(5,1));
        botones.setBorder(BorderFactory.createEmptyBorder(200,8,200,8));
        
        JButton btn_omnibus = new JButton("Omnibus");
        JButton btn_pasajeros = new JButton("Pasajeros");
        JButton btn_ganancias = new JButton("Ganancias");
        JButton btn_listado = new JButton("Listado de pasajeros");
        JButton btn_listado2 = new JButton("Listado de guaguas");

        btn_ganancias.setBackground(Color.BLACK);
        btn_listado.setBackground(Color.BLACK);
        btn_listado2.setBackground(Color.BLACK);
        btn_pasajeros.setBackground(Color.BLACK);
        btn_omnibus.setBackground(Color.BLACK);

        btn_ganancias.setForeground(Color.WHITE);
        btn_listado.setForeground(Color.WHITE);
        btn_listado2.setForeground(Color.WHITE);
        btn_pasajeros.setForeground(Color.WHITE);;
        btn_omnibus.setForeground(Color.WHITE);

        // Agregar los elementos
        botones.add(btn_omnibus);
        botones.add(btn_pasajeros);
        botones.add(btn_ganancias);
        botones.add(btn_listado);
        botones.add(btn_listado2);

        panel_derecho.add(titulo, BorderLayout.NORTH);
        panel_derecho.add(botones, BorderLayout.CENTER);

        container.add(panel_izquierdo, BorderLayout.WEST);
        container.add(panel_derecho, BorderLayout.CENTER);
    }
}