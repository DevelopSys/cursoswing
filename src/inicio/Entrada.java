package inicio;

import javax.swing.*;

public class Entrada {

    public static void main(String[] args) {
        //Ventana v = new Ventana();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ventana v = new Ventana();
            }
        });
    }

}
