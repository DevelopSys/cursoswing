package inicio.gestioneventos;

import javax.swing.*;

public class Entrada {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaEventos v = new VentanaEventos();
            }
        });
    }
}
