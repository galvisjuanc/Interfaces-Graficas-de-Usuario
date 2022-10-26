package GUI_5;

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
        setMinimumSize(new Dimension(400,400));             // tamaño minimo de la ventana

        this.getContentPane().setBackground(Color.WHITE);            // Color de la ventana

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){
        JPanel panel = new JPanel();                // Crear panel

        panel.setBackground(Color.RED);             // Establecer el color del panel
        this.getContentPane().add(panel);           // Agregar panel a la ventana

    }
}
