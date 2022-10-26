package GUI_6;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana(){
        setSize(400,400);
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
        etiqueta.setBounds(10, 10,30, 30);

        etiqueta.setForeground(Color.ORANGE);           // Cambiar color de la letra
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.WHITE);            // Cambiar fondo del cuadro del JLabel
        panel.add(etiqueta);                            // Agregar etiqueta al panel


    }

}
