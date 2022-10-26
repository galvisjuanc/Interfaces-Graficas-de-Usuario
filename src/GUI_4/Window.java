package GUI_4;

import javax.swing.*;
import java.awt.*;

/**
 * Do not allow to redesign the window
 * */
public class Window extends JFrame {
    public Window(){
        setSize(800,800);
        setTitle("El mejor titulo");
        // setLocation(100,200);
        // setBounds(100,200, 600, 600);           // Este método engloba ambos metodos setSize, setLocation
        setLocationRelativeTo(null);            // Ventana en el centro
        setResizable(true);                    // evitamos que la ventana se pueda agrandar o modificar el tamaño
        setMinimumSize(new Dimension(400,400));             // tamaño minimo de la ventana

        this.getContentPane().setBackground(Color.BLUE);            // Color de la ventana

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
