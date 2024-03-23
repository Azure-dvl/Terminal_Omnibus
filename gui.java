import src.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class gui implements ActionListener{

    private final int width = 800; // Width of the entire window
    private final int height = 500; // Height of the entire window

    private final int menu_width = Math.round(25f/100f*width); // Width of the menu panel (25% of the entire size)
    private final int menu_height = 200; // Height of the menu panel

    // Atributes
    JButton btn_omnibus; JButton btn_pasajeros; JButton btn_ganancias; JButton btn_listado_pasajeros; JButton btn_listado_omnibus; JButton btn_buscar; JPanel container;

    

    public void run(){
        // Window
        JFrame window = new JFrame("Terminal de Omnibus");
        window.setSize(this.width, this.height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());

        // MENU
        JPanel menu = new JPanel();
        menu.setLayout(new BorderLayout(0,3));
        menu.setBackground(Color.LIGHT_GRAY);
        menu.setPreferredSize(new Dimension(menu_width, menu_height));

        // Title
        JLabel titulo = new JLabel("MENU");
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setBorder(BorderFactory.createEmptyBorder(5,50,5,50));

        // Buttons Menu
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(6,1,2,5));
        buttons.setBackground(Color.LIGHT_GRAY);
        buttons.setBorder(BorderFactory.createEmptyBorder(0,10,5,10));
        
        btn_omnibus = new JButton("Omnibus");
        btn_pasajeros = new JButton("Pasajeros");
        btn_ganancias = new JButton("Ganancias");
        btn_listado_pasajeros = new JButton("Listado de pasajeros");
        btn_listado_omnibus = new JButton("Listado de guaguas");
        btn_buscar = new JButton("Buscar");

        btn_ganancias.setBackground(Color.BLACK);
        btn_listado_pasajeros.setBackground(Color.BLACK);
        btn_listado_omnibus.setBackground(Color.BLACK);
        btn_pasajeros.setBackground(Color.BLACK);
        btn_omnibus.setBackground(Color.BLACK);
        btn_buscar.setBackground(Color.BLACK);

        btn_ganancias.setForeground(Color.WHITE);
        btn_listado_pasajeros.setForeground(Color.WHITE);
        btn_listado_omnibus.setForeground(Color.WHITE);
        btn_pasajeros.setForeground(Color.WHITE);;
        btn_omnibus.setForeground(Color.WHITE);
        btn_buscar.setForeground(Color.WHITE);

        // Events Call
        btn_omnibus.addActionListener(this);
        btn_buscar.addActionListener(this);
        btn_ganancias.addActionListener(this);
        btn_listado_omnibus.addActionListener(this);
        btn_listado_pasajeros.addActionListener(this);
        btn_pasajeros.addActionListener(this);


        // CONTAINER
        container = new JPanel();
        container.setSize(400,100);

        // Add
        window.add(container, BorderLayout.CENTER);
        window.add(menu, BorderLayout.EAST);

        menu.add(titulo, BorderLayout.NORTH);
        menu.add(buttons, BorderLayout.CENTER);

        buttons.add(btn_omnibus);
        buttons.add(btn_pasajeros);
        buttons.add(btn_listado_omnibus);
        buttons.add(btn_listado_pasajeros);
        buttons.add(btn_buscar);
        buttons.add(btn_ganancias);

        // Show
        window.setVisible(true);
    }
    // Events
    public void actionPerformed(ActionEvent e){
        container.removeAll();
        
        if (e.getSource()==btn_omnibus) {
            Omnibus bus = new Omnibus();
            container.add(bus, BorderLayout.CENTER);   
        }
        else if (e.getSource()==btn_buscar) {
            Buscar buscar = new Buscar();
            container.add(buscar, BorderLayout.CENTER);
        }
        else if(e.getSource()==btn_ganancias){
            Ganancias ganancias = new Ganancias();
            container.add(ganancias, BorderLayout.CENTER);
        }
        else if(e.getSource()==btn_pasajeros) {
            Pasajeros pasajeros = new Pasajeros();
            container.add(pasajeros, BorderLayout.CENTER);
        }
        else if(e.getSource()==btn_listado_omnibus){
            Lista_Omnibus lista_omnibus = new Lista_Omnibus();
            container.add(lista_omnibus, BorderLayout.CENTER);
        }
        else{
            Listado_Pasajeros lista_pasajero = new Listado_Pasajeros();
            container.add(lista_pasajero);
        }
        
        container.updateUI();
    }

    public static void main(String[] args){
        gui window = new gui();
        window.run();
    }
    
}