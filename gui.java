import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class gui implements ActionListener{
    // Atributes
    JButton btn_omnibus; JButton btn_pasajeros; JButton btn_ganancias; JButton btn_listado_pasajeros; JButton btn_listado_omnibus; JButton btn_buscar; JPanel omnibus; JPanel container; JPanel pasajeros; JPanel listado_omnibus; JPanel listado_pasajeros; JPanel buscar; JPanel ganancias;

    public void run(){
        // Window
        JFrame window = new JFrame("Terminal de Omnibus");
        window.setSize(800,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());

        // MENU
        JPanel menu = new JPanel();
        menu.setBackground(Color.LIGHT_GRAY);
        menu.setPreferredSize(new Dimension(300,200));

        // Title
        JLabel titulo = new JLabel("MENU");
        titulo.setBorder(BorderFactory.createEmptyBorder(10,50,10,50));

        // Buttons Menu
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(6,1));
        buttons.setBackground(Color.LIGHT_GRAY);
        
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
        
        // Omnibus Panel
        omnibus = new JPanel();
        JLabel text1 = new JLabel("Agregar la llegada del omnibus");
        JPanel cont = new JPanel();

        cont.add(text1);

        JPanel cont1 = new JPanel();

        JLabel lchapa = new JLabel("Chapa");
        JTextField chapa = new JTextField("chapa");

        omnibus.add(text1, BorderLayout.NORTH);
        omnibus.add(cont1, BorderLayout.SOUTH);
        cont1.add(lchapa, BorderLayout.NORTH);
        cont1.add(chapa, BorderLayout.NORTH);
        
        //Aca tiene que ir el text q ya esta q hace falta q se este quieto
        //Abajo tiene que ir un label y un textbox alineados...como esta ahi pero que ponga ABAJOOO
        //despues eso mismo pero con los textos: destino, chofer, kilometros, asientos disponibles, dia y hora de salida, dia y hora de llegada
        //despues un checkbox con dos opciones omnibus astro y omnibus turismo
        // y al final un botoncito que diga salir


        // Pasajeros Panel
        pasajeros = new JPanel();
        JLabel text2 = new JLabel("Agregar la llegada del pasajero");


        pasajeros.add(text2, BorderLayout.NORTH);

        // Listado omnibus Panel
        listado_omnibus = new JPanel();
        JLabel text3 = new JLabel("Listado de omnibus");


        listado_omnibus.add(text3, BorderLayout.NORTH);

        // Listado pasajeros Panel
        listado_pasajeros = new JPanel();
        JLabel text4 = new JLabel("Listado de pasajeros");


        listado_pasajeros.add(text4, BorderLayout.NORTH);

        // Buscar Panel
        buscar = new JPanel();
        JLabel text5 = new JLabel("Busqueda de omnibus y pasajeros");


        buscar.add(text5, BorderLayout.NORTH);

        // Ganancias Panel
        ganancias = new JPanel();
        JLabel text6 = new JLabel("Ganancias por los onmibus y los top!");


        ganancias.add(text6, BorderLayout.NORTH);

        // Add
        window.add(container, BorderLayout.CENTER);
        window.add(menu, BorderLayout.EAST);

        menu.add(titulo, BorderLayout.NORTH);
        menu.add(buttons, BorderLayout.SOUTH);

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
            container.add(omnibus, BorderLayout.CENTER);   
        }
        else if (e.getSource()==btn_buscar) {
            container.add(buscar, BorderLayout.CENTER);
        }
        else if(e.getSource()==btn_ganancias){
            container.add(ganancias, BorderLayout.CENTER);
        }
        else if(e.getSource()==btn_pasajeros) {
            container.add(pasajeros, BorderLayout.CENTER);
        }
        else if(e.getSource()==btn_listado_omnibus){
            container.add(listado_omnibus, BorderLayout.CENTER);
        }
        else{
            container.add(listado_pasajeros);
        }
        container.updateUI();
    }

    public static void main(String[] args){
        gui window = new gui();
        window.run();
    }
    
}