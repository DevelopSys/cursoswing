package inicio.layouts;

import javax.swing.*;
import java.awt.*;

public class VentanaBox extends JFrame {


    JPanel panelUno, panelDos;
    JButton botonUno, botonDos;
    JLabel labelUno, labelDos;
    Container container;

    public VentanaBox() throws HeadlessException {
        instancias();
        initGUI();
        acciones();
    }

    private void acciones() {

    }

    private void initGUI() {
        container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
        //container.setLayout(new FlowLayout());
        container.add(panelUno);
        container.add(panelDos);
        setVisible(true);

    }

    private void instancias() {
        panelDos = new JPanel();
        panelUno = new JPanel();
        panelUno.setBackground(Color.BLUE);
        panelDos.setBackground(Color.YELLOW);
        botonUno = new JButton("Boton uno");
        botonDos = new JButton("Boton dos");
        labelDos = new JLabel("Etiqueta dos");
        labelUno = new JLabel("Etiqueta uno");
        container = getContentPane();

    }
}
