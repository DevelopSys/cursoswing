package inicio.layouts;

import javax.swing.*;

public class Entrada {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //VentanaCard v = new VentanaCard();
                VentanaGridFlowBorder v = new VentanaGridFlowBorder();
            }
        });
    }
}
