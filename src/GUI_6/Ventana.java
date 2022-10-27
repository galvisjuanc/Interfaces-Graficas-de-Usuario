package GUI_6;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana(){
        setSize(800,800);
        setTitle("El mejor titulo");
        // setLocation(100,200);
        // setBounds(100,200, 600, 600);           // Este método engloba ambos metodos setSize, setLocation
        setLocationRelativeTo(null);            // Ventana en el centro
        setResizable(true);                    // evitamos que la ventana se pueda agrandar o modificar el tamaño
        setMinimumSize(new Dimension(100,100));             // tamaño minimo de la ventana

        //this.getContentPane().setBackground(Color.BLACK);            // Color de la ventana

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){
        JPanel panel = new JPanel();                    // Crear panel

        panel.setBackground(Color.BLACK);              // Establecer el color del panel
        this.getContentPane().add(panel);               // Agregar panel a la ventana

        panel.setLayout(null);                          // Desactivamos el diseño
        JLabel etiqueta = new JLabel();                 // Creamos etiqueta

        etiqueta.setText("Hola");                       // Setear valor
        etiqueta.setBounds(10, 10,30, 30);      // ubicación de la etiqueta

        etiqueta.setForeground(Color.ORANGE);           // Cambiar color de la letra
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.WHITE);            // Cambiar fondo del cuadro del JLabel
        panel.add(etiqueta);                            // Agregar etiqueta al panel

        JLabel etiqueta1 = new JLabel("I'm Juan", SwingConstants.LEADING);
        etiqueta1.setBounds(60, 10, 70, 20);
        etiqueta1.setForeground(Color.GREEN);
        etiqueta1.setOpaque(true);
        etiqueta1.setBackground(Color.DARK_GRAY);
        panel.add(etiqueta1);

        JLabel etiqueta2 = new JLabel();
        etiqueta2.setText("Camilo Galvis");
        etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta2.setBounds(150, 10, 100, 20);
        etiqueta2.setForeground(Color.BLUE);
        etiqueta2.setOpaque(true);
        etiqueta2.setBackground(Color.DARK_GRAY);
        panel.add(etiqueta2);

        JLabel etiqueta3 = new JLabel();
        etiqueta3.setText("Mafe chan");
        etiqueta3.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta3.setBounds(500, 10, 150, 70);
        etiqueta3.setForeground(Color.BLUE);
        etiqueta3.setOpaque(true);
        etiqueta3.setBackground(Color.LIGHT_GRAY);
        etiqueta3.setFont(new Font("Calibri", Font.ITALIC, 30));
        panel.add(etiqueta3);

        JLabel etiqueta4 = new JLabel();
        etiqueta4.setText("Mundial 2018");
        etiqueta4.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta4.setBounds(200, 100, 300, 100);
        etiqueta4.setForeground(Color.BLACK);
        etiqueta4.setOpaque(true);
        etiqueta4.setBackground(Color.LIGHT_GRAY);
        etiqueta4.setFont(new Font("Comic Sans MS", 3, 30));
        panel.add(etiqueta4);

        // Etiqueta tipo imagen. Se puede colocar directamente en el constructor
        ImageIcon imagen = new ImageIcon("Adidas_Telstar_18_in_Russia_vs._Argentina.jpg");
        JLabel etiqueta5 = new JLabel();
        etiqueta5.setBounds(200,300,400,400);
        etiqueta5.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta5.getWidth(), etiqueta5.getHeight(), Image.SCALE_SMOOTH)));


        //JLabel etiqueta5 = new JLabel(new ImageIcon("Adidas_Telstar_18_in_Russia_vs._Argentina.jpg"));
        // etiqueta5.setIcon(new ImageIcon("Adidas_Telstar_18_in_Russia_vs._Argentina.jpg"))
        //etiqueta5.setBounds(700, 100, 784, 784);
        panel.add(etiqueta5);



    }

}
