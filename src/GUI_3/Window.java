package GUI_3;

import javax.swing.*;

public class Window extends JFrame {
    public Window(){
        setSize(600,600);
        setTitle("El mejor titulo");
        // setLocation(100,200);
        // setBounds(100,200, 600, 600);           // Este método engloba ambos metodos setSize, setLocation
        setLocationRelativeTo(null);            // Ventana en el centro

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
